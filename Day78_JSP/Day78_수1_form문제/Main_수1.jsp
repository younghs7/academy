<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>




<!-- 문제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

아이디
패스워드
성별

세가지를 사용자에게 입력받아 POST방식으로 전달하는 코드를 작성하시오.

조건1. RequestPostParam.jsp 로 form데이터를 받아 출력한다.	

	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
-->

<form method="get" action="RequestPostParam.jsp" >

아이디  <input type="text" name="id" > <br><br>
패스워드  <input name ="pw"> <br><br>
<label for="sex" >성별</label> <br>
<label for="male" >남성</label> <input type="radio" name="sex" name="male" value="male"> 
<label for="sex">여성</label> <input type="radio" name="sex" value="female"> <br><br> 

<input type="submit" value="submit">
<input type="button" id="btn" value ="btn_전송">
</form>

<!-- 깨달음: input의 name이 key였구나(key-value의) 
			또한, name-value(key-value)가 지정되어 있지 않으면 데이터 전송이 안 된다. -->

<script >

btn = document.querySelector("#btn");
form = document.querySelector("form");

btn.addEventListener("click", ()=>{
	 
	form.action = "RequestPostParam.jsp";
	form.submit();
	
});


</script>




</body>
</html>