<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="isErrorPage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>asddsa</h1>

<%

// try{
	
int myAge = Integer.parseInt(request.getParameter("age")) + 10;
out.println("10년 후에 당신의 나이: " +myAge);

// }
// catch(NumberFormatException excp)
// {
//	out.println("예외가 발생되었습니다. :" +excp.getMessage());
	// 보통 <알 수 없는 오류> 페이지로 넘기고, 새로고침하게끔 만든다.
// }

%>

</body>
</html>