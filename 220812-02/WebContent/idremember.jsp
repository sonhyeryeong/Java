<%@ page import="java.net.URLDecoder" %>
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
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			if(c.getName().equals("rememberme")){
				request.setAttribute("idvalue", URLDecoder.decode(c.getValue(),"utf-8"));
			}
		}
	%>
	<form action = "./login" method ="post">
		<label>id:</label><input type = "text" name ="id" value ="${idvalue}"/><!-- el에서 바로 쿠키에 접근 가능. -->
		<label>password:</label><input type = "password" name = "password"/>
		<label>remember</label><input type = "checkbox" name= "rememberme"/>
		<input type = "submit" value ="로그인"/>
	</form>
</body>
</html>