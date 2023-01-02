
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="DBPKG.DBConnection"%>

<%@ page import="java.sql.Date"%>
<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Statement"%>
<%@ page import="java.sql.Connection"%>
    
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원목록조회</h2>
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
	
	String sql = "SELECT * FROM MEMBER_TBL_02 ORDER BY custno";
	
	String custno = "";
	String custname = "";
	String phone = "";
	String address = "";
	Date joindate;
	String grade = "";
	String city = "";
	
try 
{
	conn = DBConnection.getConnection();
	stmt = conn.createStatement();
	rset = stmt.executeQuery(sql);
	
	while(rset.next())
	{
		custno	 = rset.getString("custno");
		custname = rset.getString("custname");
		phone	 = rset.getString("phone");
		address	 = rset.getString("address");
		joindate = rset.getDate("joindate");
		grade = rset.getString("grade");
		city = rset.getString("city");
	
	
	
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
			<td><%= phone %></td>
			<td><%= address %></td>
			<td><%= joindate %></td>
			<td><%= grade %></td>
			<td><%= city %></td>
		</tr>

<%
	
	}
	
}
catch(Exception excp)
{
	System.out.println("[inquiry.jsp]: " + excp.getMessage());
	
}
	
%>	
	
	
</table>


</body>
</html>