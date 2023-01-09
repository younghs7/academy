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

<% 
	request.setCharacterEncoding("UTF-8"); // 인코딩 하지 않으면 한글 깨짐.
%>


<%= request.getParameter("id") %> <br>
<%= request.getParameter("pw") %> <br>
<%= request.getParameter("sex") %> <br>


</body>
</html>