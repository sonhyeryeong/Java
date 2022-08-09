<%@page import="java.util.Random"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalTime"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 
	입력 값에 따라 페이지 이동
	a:현재 서버 시간 표시
	b:현재 서버 날짜 표시
	c:랜덤 정수 숫자 표시
	  -->
<%
	String alphabet = request.getParameter("alphabet");
	request.setAttribute("alphabet", alphabet);

	switch(alphabet){
	case "a":
		request.setAttribute("result", LocalTime.now());
		request.getRequestDispatcher("./A.jsp").forward(request, response);
		break;
	case "b":
		request.setAttribute("result", LocalDate.now());
		request.getRequestDispatcher("./B.jsp").forward(request, response);
		break;
	case "c":
		Random r = new Random();
		request.setAttribute("result", r.nextInt());
		request.getRequestDispatcher("./C.jsp").forward(request, response);
		break;
		
	}
	
%>

</body>
</html>