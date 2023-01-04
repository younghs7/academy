<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String type = request.getParameter("type");

	out.println("id는 "+ id);
	out.println("pw는 "+ pw);
	out.println("type는"+ type);
	
	
%>


</body>
</html>