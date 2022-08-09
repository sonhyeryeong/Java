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
	
		String choice = request.getParameter("num");
		
		if(choice.equals("1")){
			out.println("<img src =./images/chunsik/춘식1.png>");
		}
		if(choice.equals("2")){
			out.println("<img src =./images/chunsik/춘식2.png>");
		}
		if(choice.equals("3")){
			out.println("<img src =./images/chunsik/춘식3.png>");
		}
	
	%>
	
	
	
	
	
</body>
</html>