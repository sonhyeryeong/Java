<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력 페이지 </title>
</head>
<body>
	<form action ="/ryeong/requestinfo.jsp" method = "get" >
		<label>이름<input type ="text" name = "name" /></label>
		<label>나이<input type  ="number" name ="age"/></label>
		<label><input type ="radio" name ="gender" value ="male"/>남성</label>
		<label><input type ="radio" name ="gender" value ="female"/>여성</label>
		<label><input type ="checkbox" name ="hobby" value="java">자바</label>
		<label><input type ="checkbox" name ="hobby" value="html">하이퍼 텍스트 마크업 랭귀지</label>
		<label><input type ="checkbox" name ="hobby" value="css">캐스케이딩 스타일 시트</label>
		<label><input type ="checkbox" name ="hobby" value="javascript">자바스크립트</label>
		<input type ="submit" value ="입력완료"/>
	</form>
</body>
</html>