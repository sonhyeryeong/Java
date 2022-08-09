<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인처리 </title>
</head>
<body>
	<p>로그인 처리 요청이 전달되었나요?</p>
	<%
		//request는 요청의 정보를 담고있는 객체 
		String id = request.getParameter("userid"); 
		//해당 파라미터 이름을 잘못 입력하면 null값이 반환된다.
		//해당 파라미터 값이 전달이 되었으나 입력값이 없으면 ""
		
		//입력값이 있으면 xx님 반갑습니다. 
	 	if(id.length()>0){
			out.println(id+"님 안녕?");
	 	}else{
	 		out.println("입력해주세요.");
	 		//응답 객체 response 
	 		//redirect : 여기로 이동을 해라 라는 응답이 온다..?뭔소리지 
	 		//클라이언트:cookie쿠키 / 서버:session세션
	 		response.sendRedirect("./login.jsp");
	 	}
	
	
	%>
</body>
</html>