<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form</title>
</head>
<body>
	<form>
		<!-- 버튼을 눌렀을 때 id만 볼 수 있도록 해 볼것이다. 이때 사용할 기술이 'ajax' -->
		<!--ajax: 자바스크립트로 요청을 보낼 수 있는 객체. 비동기로 일어난다(사용자의 화면에는 보이지 않는다)  -->
		<input type ="text" name ="id" id="textid" /><button id="btnchk">아이디중복확인</button>
		<input type ="submit"/>
	</form><!--  -->
</body>
<script>
	let elem = document.getElementById("btnchk");
	elem.addEventListener("click",function(e){
		/* submit을 막을거임 */
		e.preventDefault();/* 기본으로 설정된거 막는거 */
		e.stopPropagation();/* 이벤트는 전달된다-> 이벤트의 전달을 막는거  */
		let textid = document.getElementById("textid").value;
		
		if(!textid){
			return;
		}
		
		/* ajax - xhr */
		fetch("http://localhost:8080/api/idcheck?id=" +textid)
			.then((resp)=> resp.text())//프로미스라는 객체로 처리한다. 
			.then((json)=> {
				let result = JSON.parse(json);//json문자열을 객체로 바꿔라
				if(result.duplicate){//
					alert("중복");
				}else{
					alert("사용 가능");
				}
			})
			.catch((e)=> console.log(e))
			
	});
</script>
</html>