<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage ="showerror.jsp" %>
<!--에러가 발생했을 시 이동할 페이지를 명시함. forward가 일어난다  -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 발생시킬 페이지</title>
</head>
<body>
	<%
		String name= null;
		System.out.println(name.toString());
	
	%>
	<!--
	이렇게 하면 에러페이지가 뜨는데, 
	 톰캣이 만들어준 페이지는 내부 코드가 나와버린다. 
	그래서 우리가 에러 페이지를 재정의하여 커스텀해보자!
	
	 -->

</body>
</html>