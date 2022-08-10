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
	<c:forEach var ="i" begin ="1" end="10">
		<c:if test= "${i%2==0 }"> <!--test 로 조건식 표현   -->
			<p>${ i }</p>
		</c:if>
	</c:forEach>
	<hr/>
	
	<c:choose><!-- if else같은 느낌? -->
		<c:when test ="true">
			<p>첫 번째 조건이 참일 때 </p>
		</c:when>
		<c:when test ="false">
			<p>두 번째 조건이 참일 때 </p>
		</c:when>
		<c:otherwise>
			<p>모든 조건이 참이 아닐 때</p>
		</c:otherwise>
	</c:choose>
	

</body>
</html>