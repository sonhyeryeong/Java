<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%! //선언부라고 한다. 
 
 	public int getSum(int lastNumber){
  		int sum = 0;
		for(int i =0; i<=lastNumber;i++){
			sum +=i;
		}
		return sum;
	}
 
 
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>합구하기</title>
</head>
<body>
	<p>jsp페이지에서 java scriptlet을 활용한 합계 구하기</p>
	<%
		int sum = 0;
		for(int i =0; i<=10;i++){
			sum +=i;
		}
		
	%>
	<p>0 ~10 까지의 합: <%= sum %></p>
	<p>0~100까지의 합: <%= getSum(100) %></p>
	<p><%= 1+2+3+4+5+6+7+8+9+10 %></p>
	<p><%= "문자열값"   %></p>
	<p><%= true   %></p>
	
</body>
</html>