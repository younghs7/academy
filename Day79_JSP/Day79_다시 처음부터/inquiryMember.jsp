<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page import="DBPKG.DBConnection" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>

<link rel="stylesheet" href="main.css">

<style>
	table {
		margin: auto;
	
	}
	
	h1 {
		margin: 20px auto;
		text-align: center;
	
	}
	
	

</style>


</head>
<body>
	
	<!-- 시험에 DB연결 패키지 안 줄 수도 있으니 그것까지 대비해서 준비할 필요성이 있음. -->

	<%@ include file = "header.jsp" %>
	<%@ include file = "nav.jsp" %>
	
	
	
	<section>
		
		 <h1> 회원목록조회/수정</h1>
		
		
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

	String sql = "SELECT * FROM MEMBER_TBL_02";
	
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
			custno 		= rset.getString("custno");
			custname 	= rset.getString("custname");
			phone 		= rset.getString("phone");
			address 	= rset.getString("address");
			grade 		= rset.getString("grade");
			city 		= rset.getString("city");
			
			if( rset.getDate("joindate") != null) 
				joindate 	= rset.getDate("joindate").toString();
			// joindate가 null인 경우에 toString한다고 난리난다.
			// 그런데 실제로 joindate에 null이 들어간 경우는 없었다.
			// 어쨌든 if문으로 null을 걸러주니 정상작동함.
			
			
%>			
	
		<tr>
			<td><%=custno%></td>
			<td><%=custname%></td>
			<td><%=phone%></td>
			<td><%=address%></td>
			<td><%=joindate%></td>
			<td><%=grade%></td>
			<td><%=city%></td>
		</tr>	
	
	
	
	
	
			
<%	
		}
	
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	
%>
		</table>
	</section>
	
	
	<%@ include file = "footer.jsp" %>



</body>
</html>