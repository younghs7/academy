<%@page import="DBPKG.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


<link rel="stylesheet" href="main.css">



</head>
<body>



<%@ include file ="header.jsp" %>
<%@ include file ="nav.jsp" %>



<section>
	<h1>회원목록조회/수정</h1>
	
	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>고객등급</th>
			<th>매출</th>
		</tr>
	
	
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String custno = null;
	String custname = null;
	String grade = null;
	String sale = null;
	 
	String sql 	= " SELECT me.custno, custname, grade, SUM(price) AS sale FROM member_tbl_02 me" 
				+ " JOIN money_tbl_02 mo ON mo.custno = me.custno GROUP BY me.custno, custname, grade";
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		while(rset.next())
		{
			custno = rset.getString("custno");	
			custname = rset.getString("custname");	
			grade = rset.getString("grade");	
			sale = rset.getString("sale");	
			
			switch(grade)
			{
				case "A": grade = "VIP"; break;
				case "B": grade = "일반"; break;
				case "C": grade = "직원"; break;
			}
		
	%>	
	
			<tr>
				<td><%= custno %></td>
				<td><%= custname %></td>
				<td><%= grade %></td>
				<td><%= sale %></td>
			</tr>
	
	<% 		
		}
		
		
		rset.close();
		stmt.close();
		conn.close();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
	



%>	
	
		
		
		
	</table>
	


</section>


<%@ include file ="footer.jsp" %>




</body>
</html>