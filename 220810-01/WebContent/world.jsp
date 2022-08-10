<%@page import="java.util.List"%>
<%@page import="kr.co.greenart.CountryDAO"%>
<%@page import="kr.co.greenart.Country"%>
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
	String continent = request.getParameter("continent");
	CountryDAO dao= new CountryDAO();
	List<Country> list = dao.getCountryByContinent(continent);
	
	
	request.setAttribute("list", list);
	request.getRequestDispatcher("result.jsp").forward(request,response);

%>

</body>
</html>