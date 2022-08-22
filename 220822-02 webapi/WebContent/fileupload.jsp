<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일선택</title>
</head>
<body>
	<form action="/fileupload" method="post" enctype="multipart/form-data"><!--  -->
	<!-- content type 으로 설정되어 보내진다.  -->
		<input type="file" name="fileupload"/>
		<input type="submit"/>
	</form>
</body>
</html>