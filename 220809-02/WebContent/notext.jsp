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
	int result =1+1;
	request.setAttribute("result", result);
	request.getRequestDispatcher("/WEB-INF/viewPage.jsp")
	.forward(request,response);

%>
</body>
</html> 