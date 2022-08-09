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
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs= null;
	List<String> list2 = new ArrayList<>();
	
	try{
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		stmt = conn.createStatement(); 
		rs= stmt.executeQuery("SELECT DISTINCT Continent FROM country");
		
		while(rs.next()){
			String what = rs.getString("Continent");
			list2.add(what);
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

	request.setAttribute("continent", list2);
	request.getRequestDispatcher("searchform.jsp").forward(request,response);


%>
</body>
</html>