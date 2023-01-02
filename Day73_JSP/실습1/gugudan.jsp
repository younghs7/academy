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
int dan = 1;
int mul = 1;
final int MAX_DAN = 9;
for(int i =0; i < MAX_DAN; i++)
{
	mul = 1;
	for(int j = 0; j<9; j++)
	{
		out.println(dan +" x "+ mul +" = "+dan * mul   +"<br>");
		mul++;
	}
	dan++;
}
%>




</body>
</html>