<%@page import="java.util.Enumeration"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% request.setCharacterEncoding("UTF-8"); %>

<% 
String headerName =null;
String headerValue =null;

Enumeration headers = request.getHeaderNames();

while(headers.hasMoreElements())
{
	headerName = (String)headers.nextElement();
	headerValue = request.getHeader(headerName);
	
	out.println("헤더명: " +headerName+ ", 값: " +headerValue +"<br>" );
}

// 이 코드는 하나도 의미가 없다
// => 중요한 것은 출력되는 헤더들이 무슨 의미인지를 해석하는 것이다

%>

</body>
</html>