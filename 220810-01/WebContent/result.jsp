<%@page import="kr.co.greenart.Country"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<body>
	<c:if test ="${ not empty list }"> <!-- empty 는 오른쪽의 객체가 null이면 true를 반환한다 -->
		<ul>
			<c:forEach var ="country" items ="${ list}"><!-- country라는 이름을 가지는 어트리뷰트로 list를 저장한다? -->
				<li>${country.name } ${country.population }</li>
			</c:forEach>
		
		
		</ul>
	
	</c:if>



</body>
</html>