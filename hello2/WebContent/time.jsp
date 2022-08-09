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
		//scriptlet 이라 부른다. 자바 코드를 적을 수 있는 공간. 
		System.out.println("사용자가 jsp페이지를 요청했습니다.");
		int a =10;

	%>
	<p>jsp페이지입니다.</p>
	<!-- jsp표현식이라고 한다.  -->
	
	<%--이건 jsp주석입니다!!!!--%>
	
	<strong><%= java.time.LocalTime.now() %></strong><br/>
	<p>a의 값은 <%= a %>입니다</p>
	<%--<p>b의 값은 <%= b %>입니다</p>
		<%
			int b =20;
		%>
	 --%>
	 <p> 오늘 날짜는 <%= java.util.Calendar. getInstance() %> 입니다 </p>
	 
	 
	 
</body>
</html>