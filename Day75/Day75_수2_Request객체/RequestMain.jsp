<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체-Request</title>
</head>
<body>

<h1>클라이언트의 환경정보 읽기</h1>
<a href="./RequestWebInfo.jsp?eng=Hello&kor=한글 "%>>GET방식전송 (기본)</a> <br>
<a href="./RequestWebInfo.jsp?eng=Hello&kor=<%= URLEncoder.encode("한글", "UTF-8") %>">GET방식전송 (URLEncoder)</a>

</body>
</html>