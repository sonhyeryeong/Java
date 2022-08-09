<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	out.println("<!DOCTYPE html>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out 기본객체</title>
</head>
<body>
	<h1>정적 테스트</h1>
	<%= 1+2+3 %><br/>
	<%
		out.println(1+2+3);
		out.println("<br />");
	
	%>
	
	<p>jsp의 모든 텍스트는 아웃 객체가 출력합니다. </p>
	<%
		boolean someBool = true;
		if(someBool){
			//out객체로 html문법 사용 가능!!
			out.println("<p> 참 일때 출력해야 하는 텍스트</p>");
		}else{
			out.println("<p>거짓일 때 출력해야하는 텍스트</p>");
		}
		
		
	%>
</body>
</html>