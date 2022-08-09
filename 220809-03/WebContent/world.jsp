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
<title>국가목록</title>
</head>
<body>
	<ul>
	   <%
	   Class.forName("com.mysql.cj.jdbc.Driver");
	   Connection conn = null;
	   Statement stmt = null;
	   ResultSet rs = null;
	   
	   try {
	      conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
	      stmt = conn.createStatement();
	      rs = stmt.executeQuery("SELECT name FROM world.country;");
	      
	      while (rs.next()) {
	         out.println("<li>"); 
	         out.println(rs.getString("name"));
	         out.println("</li>");
	      }
	   } finally {
	      if (rs != null) {
	         rs.close();
	      }
	      if (stmt != null) {
	         stmt.close();
	      }
	      if (conn != null) {
	         conn.close();
	      }
	   }
	   %>
	</ul>
	
	
</body>
</html>