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

<link rel="stylesheet" href="main.css" >

	<style>
		table{
			margin: 2em auto;
		}
	</style>

</head>
<body>

	<%@include file="header.jsp" %>
		
	<%@include file="nav.jsp" %>
	
	<section>
		<h1> 회원매출조회 </h1>
		
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
		
		int custno = 0;
		String custname = null;
		String grade = null;
		int sale = 0;
		
		String sql = 	" SELECT me.custno, custname, grade, SUM(price) AS sale FROM MEMBER_TBL_02 me " 
				   + 	" JOIN MONEY_TBL_02 mo ON me.custno = mo.custno GROUP BY me.custno, custname, grade "; 

		
		try{
			
			
		
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			
			while(rset.next())
			{
				custno = rset.getInt("custno");
				custname = rset.getString("custname");
				grade = rset.getString("grade");
				sale = rset.getInt("sale");
				
				switch(grade)
				{
					case "A":  grade="VIP"; break;
					case "B":  grade="일반"; break;
					case "C":  grade="직원"; break;
				}
			
		%>			
			
			<tr>
					<td><%=custno %></td>
					<td><%=custname %></td>
					<td><%=grade %></td>
					<td><%=sale %></td>
			</tr>
		<% 
			}
			
			if(conn.getAutoCommit() == false)
				conn.commit();
			
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
	<%@include file="footer.jsp" %>


</body>
</html>