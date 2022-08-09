<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
<h1>국가와 이름</h1>
<%
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs= null;
	
	
	try{
		String con = request.getParameter("con");
		String query = "SELECT Name,Population FROM country WHERE Continent = ?  ORDER BY Population DESC";
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","root");
		pstmt =conn.prepareStatement(query);
		pstmt.setString(1,con);
		
		rs= pstmt.executeQuery();
		
		
		while(rs.next()){
			String what = rs.getString("Name");
			int pop = rs.getInt("Population");
			out.println("나라이름: "+ what+"\t"+"인구수: "+ pop +"<br/>");
			
			
		}
	}finally{
		if(pstmt != null){
			pstmt.close();
		}
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

%>
	
	



</body>
</html>