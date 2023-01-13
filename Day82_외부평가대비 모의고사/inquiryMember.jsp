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
	section > h1 {
		text-align: center;
		margin: 2em;
	}
	
	section > table {
		margin: auto;
	}

</style>

<body>

	<%@ include file ="header.jsp" %>
	<%@ include file ="nav.jsp" %>
	
	<section>
		<h1>회원목록조회/수정</h1>
		
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원성명</th>
				<th>전화번호</th>
				<th>주소</th>
				<th>가입일자</th>
				<th>고객등급</th>
				<th>거주지역</th>
			</tr>
			
<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String sql =  "SELECT * FROM MEMBER_TBL_02";
	
	
	String custno = null;
	String custname = null;
	String phone = null;
	String address = null;
	String joindate = null;
	String grade = null;
	String city = null;
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
	
		while(rset.next())
		{
			custno = rset.getString("custno");
			custname = rset.getString("custname");
			phone = rset.getString("phone");
			address = rset.getString("address");
			joindate = rset.getDate("joindate").toString();
			grade = rset.getString("grade");
			city = rset.getString("city");
		
			
			switch(grade)
			{
				case "A": grade="VIP"; break;
				case "B": grade="일반"; break;
				case "C": grade="직원"; break;
			}
			
%>			
	<tr>
		<td><a href="modifyInfo.jsp?custno=<%=custno %>"><%= custno %></a></td>
		<td><%= custname %></td>
		<td><%= phone %></td>
		<td><%= address %></td>
		<td><%= joindate %></td>
		<td><%= grade %></td>
		<td><%= city %></td>	
	</tr>

<% 		
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	rset.close();
	stmt.close();
	conn.close();

%>			
		
		
		</table>
	</section>
	
	<%@ include file ="footer.jsp" %>
	
	
	

	

</body>
</html>