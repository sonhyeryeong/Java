<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	/* db연결,select만 한다.  */
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	List<String> list = new ArrayList<>();
	/* statement 객체와 preparestatement 객체의 차이점?
		둘 다 쿼리문 실행이라는 목적은 똑같으나, 동적인 파라미터 값이 있을 때, 
		그 값을 미리 지정할 수 있는게 preparestatement 객체 
			
	*/
	try{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		stmt = conn.createStatement(); /*명령을 날려 줄 수 있는 객체  */
		rs  = stmt.executeQuery("SELECT name FROM country");
		
		while(rs.next()){
			String name = rs.getString("name");
			list.add(name);
		}
		
	}finally{
		if(rs != null){
			rs.close();
		}
		if(stmt != null){
			stmt.close();
		}
		if(conn != null){
			conn.close();
		}
	}
	
	//request 객체에 list 를 attribute로 설정하기
	request.setAttribute("countries", list);
	//다음 페이지로 forward시키기. 
	request.getRequestDispatcher("viewcountry.jsp")
	.forward(request,response);
	
%>
</body>
</html>