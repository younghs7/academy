<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form method="post" action="ResponseLogin.jsp" >

아이디  <input type="text" name="id" > <br><br>
패스워드  <input name ="pw"> <br><br>
<label for="sex" >성별</label> <br>
<label for="male" >남성</label> <input type="radio" name="sex" name="male" value="male"> 
<label for="sex">여성</label> <input type="radio" name="sex" value="female"> <br><br> 

<input type="submit" value="전송">
</form>





</body>
</html>