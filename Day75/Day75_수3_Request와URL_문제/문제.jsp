<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>당신의 아이디는 <%= request.getParameter("id")%></p>
	<p>패스워드는 <%= request.getParameter("pw")%></p>
	<p>유형은 
	<%
	if("admin".equals( request.getParameter("type") )  )
	{
		out.println("관리자");
	}
	else{
		out.print("비관리자");
	}
	%>
	입니다.
	</p>


</body>
</html>