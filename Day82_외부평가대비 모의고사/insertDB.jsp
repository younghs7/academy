<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page import="DBPKG.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


S
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
	
	String sql = " INSERT INTO MEMBER_TBL_02 VALUES( "	+custno 
												+ ", '" +custname+ "'"
												+ ", '" +phone+ "'"
												+ ", '" +address+ "'"
												+ ", '" +joindate+ "'"
												+ ", '" +grade+ "'"
												+ ", '" +city+ "')";
		
	
	// sql Date는  	1) 20120101 
	//				2) 2012-01-01
	//				3) 2012/01/01
	// 아무렇게나 입력해도 다 들어간다.
	
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		res = stmt.executeUpdate(sql); // insert, update 둘 다 executeUpdate로 해야됨
	
		
		// commit 잊지 말 것
		// close()
		
		if(conn.getAutoCommit() == false)
			conn.commit();
			
		stmt.close();
		conn.close();
		
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

%>
	<h1><%= res %></h1>

	<script>
	
		const h1 = document.querySelector("h1");	// querySelector 철자 틀림
		
	
		if(h1.textContent == "1")					// elem.textContent 숙지 --> 정 오타난다면, 그냥 input value 사용할 것
		{
			alert("저장 되었습니다.");
			parent.location.reload();
		}
		else
		{
			alert("저장에 실패했습니다.");
		}
	
	</script>


</body>
</html>