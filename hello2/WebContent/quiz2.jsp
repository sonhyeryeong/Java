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
		request.setCharacterEncoding("UTF-8");
	%>
	입력한 값은  = <%=request.getParameter("name")   %> <br/>
	<%
	String name = request.getParameter("name");
	 if(name.equals("still sunset")){
	%>
	<h1>1번: 정답입니다!</h1>	  
	<%
	 } else{
	%>
	<h1>바보</h1>	
	<% 
	 }  
	%>
	<%
	String name2 = request.getParameter("name2");
		if(name2.equals("손혜령")){
	%>
	<h1>2번 : 정답입니다!!</h1>
	<%
		}else{
	%>
	<h1>2번: 아닙니다. 지금 가장 집에 가고 싶은 사람은 '손혜령' 입니다</h1>
	<%
		}
	%>
	<%
	String name3 = request.getParameter("name3");
		if(name3.equals("오늘")){
	%>
	<h1>맞아요. 소현이는 오늘 나한테 밥을 사줄거에요</h1>
	<%
		}else{
	%>
	<h1>아니.오늘 사줘!!!</h1>
	<%
		}
	%>
</body>
</html>