<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 사용자가 대륙을 선택할 수 있게 만들어야 함?
	선택한 대륙의 국가들의 이름, 인구를 볼 수 있는 페이지(인구 내림차순 정렬 )
 -->
 	<%
		List<String> list = (List<String>) request.getAttribute("continent");
	%>
	<form action ="./viewAll.jsp">
			<select name ="con">
				<% for(int i = 0; i < list.size(); i++){ %>
				<option value ="<%=list.get(i) %>"><%=list.get(i) %></option>	
			<%}%>	
			</select>
		<input type ="submit"/>	
	</form>
</body>
</html>