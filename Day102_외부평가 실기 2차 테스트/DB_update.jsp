<%@page import="DBPKG.DBConnection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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

	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	
	Connection conn = null;
	Statement stmt = null;
	int res = 0;
	

	
	String sql 	= "UPDATE member_tbl_02 SET custname='"
				+ custname+		"', phone='"
				+ phone +		"', address='"
				+ address +		"', joindate='"
				+ joindate +	"', grade='"
				+ grade +		"', city='"
				+ city +		"' WHERE custno="+custno;
	
	
	
	try{
		
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		
		res = stmt.executeUpdate(sql);
		
		
		if(conn.getAutoCommit() == false)
		{
			conn.commit();
		}
		
		stmt.close();
		conn.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	
%>

<%= sql %>





<script>
	
	if(<%= res %> === 1)
	{
		alert("수정이 저장되었습니다.")
		parent.location.reload();
	}
	else
	{
		alert("데이터 저장에 실패했습니다. 입력을 확인해보십시오.")
	}



</script>


</body>
</html>