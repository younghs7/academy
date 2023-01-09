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

if(id.equalsIgnoreCase("abc") && pw.equalsIgnoreCase("1234") )
{
	response.sendRedirect("ResponseWelcome.jsp");
	
}
else
{
	request.getRequestDispatcher("RequestMain.jsp?loginErr=1").forward(request, response);
	// RequestMain.jsp?loginErr=1 를 셋팅한 상태로 다시 정보를 가져오겠다.
	// dispatcher와 forward는 항상 쌍으로 온다.
	
	
}


	// 정리: redirect: 다른 페이지
	//      
%>




</body>
</html>