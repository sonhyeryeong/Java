<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>자바 웹 어플리케이션은 각각의 고유한 context root 경로를 가집니다.</p>
	<p><%= request.getContextPath() %></p>
	
	
	<form action="<%= request.getContextPath() %>/testRequest.jsp"> <!--이렇게 하면 루트경로를 자동적으로 찾을 수 있음.   -->
		<input type ="submit"/>
	</form>
</body>
</html>