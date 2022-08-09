<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>다음 문제의 답을 입력하세요.</p>
	<p>문제1)8월 5일 나오는 nell의 신곡 제목은?</p>
	<p>문제2)지금 가장 집에 가고 싶은 사람 이름은?</p>
	<p>문제3)박소현이 언제 나한테 밥을 사줄까?</p>
	<form action ="/ryeong/quiz2.jsp" method = "get" >
		<label>정답입력란1<input type ="text" name = "name" /></label><br/>
		<label>정답입력란2<input type ="text" name = "name2" /></label><br/>
		<label>정답입력란3<input type ="text" name = "name3" /></label><br/>
		<input type ="submit" value ="입력완료"/>
	
	</form>
</body>
</html>