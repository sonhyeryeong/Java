<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 예) 000,22 님 환영합니다. -->
<%
		String name =request.getParameter("name");
		String age =request.getParameter("age");
		if((name==null || name.length()==0) && (age ==null || age.length()==0)){
			/*response.sendRedirect("./person.jsp");  */
				response.setStatus(400);
				out.println("잘못된 입력");
		}else{
			out.println(name);
			out.println(age);
			
			out.println("<p>님 환영합니다!</p>");
			
		}



%>
	
	
</body>
</html>