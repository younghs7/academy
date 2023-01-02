

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.text.SimpleDateFormat" %>    
<%@ page import="java.util.Date" %>    
    
    
    
<%!
String str1 = "JSP";
String str2 = "Hello!";

%>
    
    
<!-- JSP는 응답페이지를 만들기 위해 자바와 HTML등을 이용하는 기술. 

 %는 동적 데이터를 담당.
 -->    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1><%= str2 %> <%= str1 %> World </h1>
	
<%
Date today = new Date();
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
String todayStr = dateFormat.format(today);
out.println("오늘날짜: " + todayStr);
out.println("<h1> 오늘날짜: " + todayStr+ "</h1>");
%>	

</body>
</html>

<!-- 여기까지 실행되면, 사용자가 받아야 할 HTML 정보가 나온다. -->

