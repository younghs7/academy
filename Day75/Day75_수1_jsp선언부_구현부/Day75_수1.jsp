<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>





<h1>두 수를 더한 결과를 보여줍니다. 예) 23 + 6</h1>
<% 
out.print(add(23,6));
%>
<%= a %>

<%! int a = 23; 
	int b = 6;
	
	int add(int a, int b)
	{
		return a + b;
	}
%>


</body>
</html>