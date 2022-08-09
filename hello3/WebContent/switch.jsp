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
	
	String want = request.getParameter("choice");
	if(want==null || want.length()==0){
		response.sendRedirect("./want.jsp?progress=failed");	
	}else if(want.equals("person")){
		response.sendRedirect("./persons.jsp");
	}else if(want.equals("fruit")){
		response.sendRedirect("./fruit.jsp");
	}
	
	%>
</body>
</html>