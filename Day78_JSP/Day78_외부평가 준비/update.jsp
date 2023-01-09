<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page import = "DBPKG.DBConnection" %>

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
	request.setCharacterEncoding("UTF-8");

	String custno 	= request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone 	= request.getParameter("phone");
	String address 	= request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade 	= request.getParameter("grade");
	String city	 	= request.getParameter("city");
	
	Connection conn = null;
	Statement stmt = null;
	int res = 0;
	
	String sql = "UPDATE MEMBER_TBL_02 SET custname='"		+custname+ 
										  	"', phone='"	+phone+
										  	"', address='"	+address+
										  	"', grade='" 	+grade+
										  	"', city='"		+city+
										  	"', joindate'" 	+joindate+
				"' WHERE custno= "+ custno;
	
	
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		res = stmt.executeUpdate(sql);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		out.println("<h1>" + res + "</h1>");
		
	}
		
%>



<script>
(()=>{
	
	const resultElem = document.querySelector("h1");
	
	if (resultElem.textContent == '1')
	{
		alert("회원정보를 저장하였습니다.");
		
	}
	else
	{
		alert("회원정보를 저장에 실패하였습니다.");
	}
		location.href = 'inquiry.jsp';	
	

	
})();
</script>

</body>
</html>