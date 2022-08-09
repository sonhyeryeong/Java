
<!-- 
	입력폼
	숫자1
	숫자2
	연산자 +-*/ 선택
	전송하면 계산 결과가 출력될 수 있게끔.
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action ="./calcresult.jsp">
		<label>숫자1</label><input type ="number" name ="num1">
		<label>숫자2</label><input type ="number" name ="num2"><br/>
		
		<label><input type ="radio" name ="choice" value ="+">+</label>
		<label><input type ="radio" name ="choice" value ="-">-</label>
		<label><input type ="radio" name ="choice" value ="*">*</label>
		<label><input type ="radio" name ="choice" value ="/">/</label>
		<input type ="submit"/>
	</form>

</body>
</html>