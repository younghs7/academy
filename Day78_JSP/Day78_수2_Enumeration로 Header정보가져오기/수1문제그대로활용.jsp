<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form method="post" action="RequestPostParam.jsp" >

아이디  <input type="text" name="id" > <br><br>
패스워드  <input name ="pw"> <br><br>
<label for="sex" >성별</label> <br>
<label for="male" >남성</label> <input type="radio" name="sex" name="male" value="male"> 
<label for="sex">여성</label> <input type="radio" name="sex" value="female"> <br><br> 

<input type="submit" value="submit">
<input type="button" id="btn" value ="btn_전송">
</form>


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