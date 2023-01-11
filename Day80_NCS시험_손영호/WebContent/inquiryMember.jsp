<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page import="DBPKG.DBConnection" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	section > h1 {
		text-align: center;
		margin: 20px auto;
	}
	
	table {
	
		margin: 20px auto;
		width: 1000px;
	
	
	}

</style>

<link rel="stylesheet" href="main.css">

</head>
<body>

	<%@ include file="header.jsp" %>
	<%@ include file="nav.jsp" %>
	

	
	
	<section>
		<h1>회원목록조회</h1>
		
		<table border="1">
			<tr>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
			</tr>
			
<%

	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String sql = "SELECT custname, phone, address, joindate, grade FROM MEMBER_TBL_02";
	
	String custname = null;
	String phone = null;
	String address = null;
	String joindate = null;
	String grade = null;

	try
	{
		
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		while(rset.next())
		{
			custname = rset.getString("custname");
			phone = rset.getString("phone");
			address = rset.getString("address");
			joindate = rset.getDate("joindate").toString();
			grade = rset.getString("grade");
			
			
			switch(grade)
			{
				case "A": grade ="VIP"; break;
				case "B": grade ="일반"; break;
				case "C": grade ="직원"; break;
				
			
			}
			 
%>

		<tr>
			<td><%= custname %></td>
			<td><%= phone %></td>
			<td><%= address %></td>
			<td><%= joindate %></td>
			<td><%= grade %></td>
		</tr>	


		
<%		
		
		
		}
		
		rset.close();
		stmt.close();
		rset.close();
		
		
	}
	catch(Exception e)
	{
		out.println(e.getMessage());
		e.printStackTrace();
	}
	
	
		
	


%>

			
			
		</table>
	</section>

	<%@ include file="footer.jsp" %>



</body>
</html>