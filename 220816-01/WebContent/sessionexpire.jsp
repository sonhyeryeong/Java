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
		session.invalidate(); 
	%>
	//세션 아이디가 새로 부여된다. 
	<p>세션이 만료되었습니다</p>
</body>
</html>