<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>${requestScope.name1 }</p><!--name1값을 꺼냄  -->
	<p>${requestScope.name2 }</p>
	<p>${applicationScope.name3 }</p>
	<p>${requestScope.name4 }</p>
	<p>${applicationScope.name4 }</p>
	<hr/>
	<p>${name1 }</p>
	<p>${name2 }</p>
	<p>${name3 }</p>
	<p>${name4 }</p> <!--이름을 가지고 살펴볼 때 좁은 영역을 가진 것부터 살펴본다.   -->
	<hr/>
	<p>${none}</p>
</body>
</html>