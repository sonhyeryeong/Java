<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>context가 뭔가요?</p>
	<!-- 개발자들이 어플리케이션에 개발에 필요한 정보를 모아놓는 장소라고 생각하면 된다.-->
	<%
	
		ServletRequest req = pageContext.getRequest();
		out.println(req == request);
		out.println("<br/>");
		ServletResponse resp = pageContext.getResponse();
		out.println(resp == response);
		
	%>
</body>
</html>