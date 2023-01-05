<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>

<%@ page import="DBPKG.DBConnection" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>

<style>
	
	
	
	td, h1 {
	
	margin: 0;
	padding: 0;
	}

	html {
		font-size: 16px
	}


	h1 {
	 	text-align: center;
	}
	
	table {
		width: 500px;
		margin: auto;
	}

	td {
		border: 1px solid black;
		text-align: center;
	}

</style>

</head>
<body>

<h1>홈쇼핑 회원등록</h1>

<% 
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;

	
	String sql = "SELECT max(custno) + 1 FROM MEMBER_TBL_02"; // 끝에 ;(세미콜론) 붙이면 안 되네
	String maxCustno = null;
	try{
		
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		
		
		while( true == rset.next() )
		{
			maxCustno = rset.getString(1);
	
		}
		
	
	}
	catch(Exception e)
	{	
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
%>

<table>
	

	<tr>
		<td>회원번호(자동발생)</td>
		<td><input type="text" id="custno" readonly  value=<%= maxCustno %>></td>	
	</tr>
	
	<tr>
		<td>회원성명</td>
		<td><input type="text" id="custname" ></td>	
	</tr>
	
	<tr>
		<td>회원전화</td>
		<td><input type="text" id="phone"></td>	
	</tr>
	
	<tr>
		<td>회원주소</td>
		<td><input type="text" id="address"></td>	
	</tr>
	
	<tr>
		<td>가입일자</td>
		<td><input type="text" id="joindate"></td>	
	</tr>
	
	<tr>
		<td>고객등급[A:VIP, B:일반, C:직원]</td>
		<td><input type="text" id="grade" ></td>	
	</tr>
	
	<tr>
		<td>도시코드</td>
		<td><input type="text" id="city"></td>	
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="button" value="등록" id="regbtn">
			<input type="button" value="조회" id="inqbtn">
		</td>	
	</tr>
	
	

	
	<script>

		const custno = document.querySelector("#custno");
		const custname = document.querySelector("#custname");
		const phone = document.querySelector("#phone");
		const address = document.querySelector("#address");
		const joindate = document.querySelector("#joindate");
		const grade = document.querySelector("#grade");
		const city = document.querySelector("#city");
		const regbtn = document.querySelector("#regbtn");
		const inqbtn = document.querySelector("#inqbtn");
	
		const checkDataExistence = function()
		{
			if
			(	custno.value.length === 0 	||
				custname.value.length === 0 ||
				address.value.length === 0 	||
				grade.value.length === 0	||
				city.value.length === 0		
			)
				return false;	
			
			
			return true;
		}
		
		const checkDataValidity	= function()
		{
			if
			(	custno.value.length > 6		||
				custname.value.length > 20	||
				phone.value.length > 13		||
				address.value.length > 60	||
				grade.value.length > 1		||
				city.value.length > 2		
			)
				return false;
			
			
			
			
			return true;
		}
		

		
	</script>


</table>

</body>
</html>