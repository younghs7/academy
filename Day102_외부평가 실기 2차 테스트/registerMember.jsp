<%@page import="DBPKG.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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



<%
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;

	String sql = "SELECT MAX(custno+1)  FROM member_tbl_02";
	
	String MaxCustno = null;
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		while(rset.next())
		{
			MaxCustno = rset.getString("MAX(custno+1)");
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

<section>
	<h1>홈쇼핑 회원 등록</h1>
	
	<form name="form" method="post" action="DB_insert.jsp">
		<table border="1">
		<tr>
			<th>회원번호(자동발생)</th>
			<td><input id="custno" name="custno" value ="<%= MaxCustno %>" readonly="readonly"></td>
		</tr>
		
		<tr>
			<th>회원성명</th>
			<td><input id="custname" name="custname"></td>
		</tr>
		
		<tr>
			<th>회원전화</th>
			<td><input id="phone" name="phone"></td>
		</tr>
		
		<tr>
			<th>회원주소</th>
			<td><input id="address" name="address"></td>
		</tr>
		
		<tr>
			<th>가입일자</th>
			<td><input id="joindate" name="joindate"></td>
		</tr>
		
		<tr>
			<th>고객등급[A:VIP, B:일반, C:직원]</th>
			<td><input id="grade" name="grade"></td>
		</tr>
		
		<tr>
			<th>도시코드</th>
			<td><input id="city" name="city"></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="button" id="btn_reg" value="등록">
				<input type="button" id="btn_inq" value="조회">
			</td>
		</tr>
		
		</table>
	</form>	
	
	<iframe name ="iframe"></iframe>

</section>


<%@ include file ="footer.jsp" %>


<script>
	
	const custno = document.querySelector("#custno");
	const custname = document.querySelector("#custname");
	const phone = document.querySelector("#phone");
	const address  = document.querySelector("#address");
	const joindate = document.querySelector("#joindate");
	const grade = document.querySelector("#grade");
	const city = document.querySelector("#city");
	
	const btn_reg = document.querySelector("#btn_reg");
	const btn_inq = document.querySelector("#btn_inq");
	
	
	const objectSet = [
		
		{ref: custno, 	size: 6, 	nodataMsg:"회원번호가 입력되지 않았습니다",		sizeMsg:"회원번호 길이를 6이하로 입력하십시오" }
	,	{ref: custname, size: 20, 	nodataMsg:"회원성명이 입력되지 않았습니다",		sizeMsg:"회원성명 길이를 20이하로 입력하십시오" }
	,	{ref: phone,	size: 13, 	nodataMsg:"전화번호 입력되지 않았습니다" ,		sizeMsg:"전화번호 길이를 13이하로 입력하십시오"}
	,	{ref: address, 	size: 60, 	nodataMsg:"주소가 입력되지 않았습니다" ,		sizeMsg:"주소 길이를 60이하로 입력하십시오"}
	,	{ref: joindate, size: 10, 	nodataMsg:"날짜가 입력되지 않았습니다" ,		sizeMsg:"날짜 길이를 10이하로 입력하십시오"}
	,	{ref: grade, 	size: 1, 	nodataMsg:"고객등급이 입력되지 않았습니다" ,	sizeMsg:"고객등급 길이를 1이하로 입력하십시오"}
	,	{ref: city, 	size: 2, 	nodataMsg:"도시코드가 입력되지 않았습니다" ,	sizeMsg:"도시코드 길이를 2이하로 입력하십시오"}
	
	];
	

	console.log(custno);
	console.log(custname);
	console.log(phone);
	console.log(address);
	console.log(joindate);
	console.log(grade);
	console.log(city);
	
	console.log(btn_reg);
	console.log(btn_inq);
	
	
	
	const checkDataExistance = function()
	{
		for(const elem of objectSet)
		{
			if(elem.ref.value.length === 0)
			{
				elem.ref.focus();
				alert(elem.nodataMsg);
				return false;
			}
		}
		
		return true;
	}
	
	const checkDataSize = function()
	{
		for(const elem of objectSet)
		{
			if(elem.size < elem.ref.value.length )
			{
				elem.ref.focus();
				alert(elem.sizeMsg);
				return false;
			}
		}
		
		return true;
		
	}
	
	let res;
	btn_reg.addEventListener("click", ()=>{
		
		// 데이터 유효성 
		
			// 존재여부
		res = checkDataExistance();
		
		if(res === false)
			return;
		
			// 데이터 사이즈 체크
		res = checkDataSize();
		
		if(res === false)
			return;
		
			// 다 통과하면 update 페이지로 form 데이터 전송
		
		form.target = "iframe";
		form.submit();
		
			
			
	});
	
	
	btn_inq.addEventListener("click", ()=>{
		
		location.href = "inquiryMember.jsp";
		
	});
	
	
	


</script>




</body>
</html>