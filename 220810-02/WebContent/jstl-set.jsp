<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setAttribute("asdf", "zxcv"); %>
	<c:set var="jjj" value ="value2" scope="request"/>
	
	${asdf }
	${jjj }
	
	<c:url var ="searchGoogle" value ="http://google.com/search">
		<c:param name ="q" value ="검색파라미터"/>
	</c:url>
	<c:out value ="출력할 때 쓰는 곳" escapeXml =""/>
	<a href ="${searchGoogle }">구글 검색</a>
</body>
</html>