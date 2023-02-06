<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DBPKG.DBConnection"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="main.css" >

<style>
	table {
		margin: 2em auto;
		
		align-content: center;
	}
	
	


</style>

</head>
<body>
	
	<%@include file="header.jsp" %>
		
	<%@include file="nav.jsp" %>
	
	
	<% 
	
		request.setCharacterEncoding("UTF-8");
	
		String custno = request.getParameter("custno");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		
		String sql = "SELECT * FROM MEMBER_TBL_02 WHERE custno="+custno; 
		
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
				custname = rset.getString("custname");
				phone = rset.getString("phone");
				address = rset.getString("address");
				joindate = rset.getDate("joindate").toString();
				grade = rset.getString("grade");
				city = rset.getString("city");
	
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
		<h1> 회원등록 </h1>
		<form method="post" action="DB_update.jsp" id="form" target="iframe">
			<table border="1">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input id="custno" name="custno" readonly="readonly" value="<%= custno %>" ></td>
				</tr>
				
				<tr>
					<th>회원성명</th>
					<td><input id="custname" name="custname" value="<%= custname %>"></td>
				</tr>
				
				<tr>
					<th>회원전화</th>
					<td><input id="phone" name="phone" value="<%= phone %>"></td>
				</tr>
				
				<tr>
					<th>회원주소</th>
					<td><input id="address" name="address" value="<%= address %>"></td>
				</tr>
				
				<tr>
					<th>가입일자</th>
					<td><input id="joindate" name="joindate" value="<%= joindate %>"></td>
				</tr>
				
				<tr>
					<th>고객등급[A:VIP, B:일반, C직원]</th>
					<td><input id="grade" name="grade" value="<%= grade %>"></td>
				</tr>
				
				<tr>
					<th>도시코드</th>
					<td><input id="city" name="city" value="<%= city %>"></td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="button" value="등록" id="btn_reg"> 
						<input type="button" value="조회" id="btn_inq">
					</td>
				</tr>
				

			</table>
		</form>
		


		<iframe id="iframe" name="iframe"  > </iframe>
		
		
		
	
	</section>
	<%@include file="footer.jsp" %>
	
	<script>
	(()=>{
		
		const custname = document.querySelector("#custname");
		const phone = document.querySelector("#phone");
		const address = document.querySelector("#address");
		const joindate = document.querySelector("#joindate");
		const grade = document.querySelector("#grade");
		const city = document.querySelector("#city");

		const btn_reg = document.querySelector("#btn_reg")
		const btn_inq = document.querySelector("#btn_inq")

		const form = document.querySelector("#form")

		const objectSet = [
			{ref: custname, 	size: 20,	sizeMsg: "회원번호가 유효한 글자수가 아닙니다.", 	nodataMsg: "회원성명을 입력해야 합니다."}
		,	{ref: phone, 		size: 13,	sizeMsg: "전화번호가 유효한 글자수가 아닙니다.",	nodataMsg: "전화번호를 입력해야 합니다."}
		,	{ref: address, 		size: 60,	sizeMsg: "주소가 유효한 글자수가 아닙니다.",		nodataMsg: "주소를 입력해야 합니다."}
		,	{ref: joindate, 	size: 10,	sizeMsg: "가입일자가 유효한 글자수가 아닙니다.",	nodataMsg: "가입일자를 입력해야 합니다."}
		,	{ref: grade, 		size: 1,	sizeMsg: "고객등급이 유효한 글자수가 아닙니다.",	nodataMsg: "고객등급을 입력해야 합니다."}
		,	{ref: city,  		size: 2,	sizeMsg: "거주지역이 유효한 글자수가 아닙니다.",	nodataMsg: "거주지역을 입력해야 합니다."}
		];

		console.log(custname);
		console.log(phone);
		console.log(address);
		console.log(joindate);
		console.log(grade);
		console.log(city);
		console.log(btn_reg);
		console.log(btn_inq);
		console.log(form);
		

		const checkDataExistance = function()
		{
			for(let i = 0; i < objectSet.length; i++)
			{
				if ( objectSet[i].ref.value.length === 0 )
				{
					alert(objectSet[i].nodataMsg);
					objectSet[i].ref.focus();
		
					return false;
				}
			}
			
			return true;
		}

		const checkDataSize = function()
		{
			for(let i = 0; i < objectSet.length; i++)
			{
				if ( objectSet[i].ref.value.length > objectSet[i].size )
				{
					alert(objectSet[i].sizeMsg);
					objectSet[i].ref.focus();

					return false;
				}
			}
			
			return true;

		}

		let res;
		btn_reg.addEventListener("click",()=>{

			res = checkDataExistance();

			if(res === true)
				res = checkDataSize();

			if(res === true)
			{	
				form.submit();
			}
				
					
			
			
		})
		
		
		btn_inq.addEventListener("click",()=>{

			location.href = "inquiryMember.jsp";		
		
		})
		
		
	})();
	</script>

</body>
</html>