<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>일시적으로 오류가 발생 되엇습니다. 서비스에 불편을 드려 죄송합니다.</h1>

<p>
오류명 : <%= exception.getClass().getName() %> <br>
메시지 : <%= exception.getMessage() %>
</p>

</body>
</html>