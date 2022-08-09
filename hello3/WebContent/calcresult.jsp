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
	String number1 = request.getParameter("num1");
	String number2 = request.getParameter("num2");
	
	int num1= Integer.parseInt(number1);
	int num2= Integer.parseInt(number2);
	
	String what =request.getParameter("choice");
	
	switch(what){
	case "+":
		out.println(number1 +"+"+number2+"=");
		out.println(num1+num2);
		out.println("<br/>");
		break;
	case "-":	
		out.println(number1 +"-"+number2+"=");
		out.println(num1-num2);
		out.println("<br/>");
		break;
	case "*":	
		out.println(number1 +"*"+number2+"=");
		out.println(num1*num2);
		out.println("<br/>");
		break;
		
	case "/":	
		out.println(number1 +"/"+number2+"=");
		out.println(num1/num2);
		out.println("<br/>");
		break;
	default:
		out.println("<p>유효하지 않은 입력입니다.</p>");
	}
	
	
	%>
</body>
</html>