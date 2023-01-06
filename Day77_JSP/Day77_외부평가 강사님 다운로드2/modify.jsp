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
	String custno = request.getParameter("custno");

	out.println("<h1>" + custno + "</h1>");

%>

</body>
</html>