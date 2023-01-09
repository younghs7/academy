<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "java.sql.Connection" %>    
<%@ page import= "java.sql.Statement" %>    
<%@ page import= "java.sql.ResultSet" %>    
<%@page import="java.sql.Date"%>
   
<%@ page import= "DBPKG.DBConnection" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./style.css">

<style>
	h1 {
		text-align: center;
	}
	
	table {
		width: 500px;
		border: 1px solid black;
		margin: auto;
	}

</style>

</head>
<body>

	<%@ include file="header.jsp" %>
	<%@ include file="nav.jsp" %>
	

	<%
	
		String custno = null;
		String custname = null;
		String phone = null;
		String address = null;
		Date joindate = null;
		String grade = null;
		String city = null;
	
		custno = request.getParameter("custno");
		out.println("<h1>" +custno+ "</h1>");
	
		Connection conn = null;	// DBMS를 연결 객체
		Statement stmt = null;	// 쿼리를 처리하는 객체
		ResultSet rset = null;	
		
		String sql = "SELECT * FROM MEMBER_TBL_02 WHERE custno="+custno;
	
		try {
			conn = DBConnection.getConnection();		
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
	
			while(true == rset.next())
			{
				custname = rset.getString("custname");
				phone = rset.getString("phone");
				address = rset.getString("address");
				joindate = rset.getDate("joindate");
				grade = rset.getString("grade");
				city = rset.getString("city");
			
	%>
			<form method="post" id="form_update" action="update.jsp">
				 <table>
		            <tr>
		                <th>회원번호(자동발생)</th>
		                <td><input type="text" id="custno" name="custno" value="<%=custno %>"></td>
		            </tr>  
		        
		       
		            <tr>
		                <th>회원성명</th>
		                <td><input type="text" id="custname" name="custname" value="<%=custname %>"></td>
		            </tr>   
		           
		
		            <tr>
		                <th>회원전화</th>
		                <td><input type="text" id="phone" name="phone" value="<%=phone %>" ></td>
		            </tr>   
		           
		            <tr>
		                <th>회원주소</th>
		                <td><input type="text" id="address" name="address" value="<%=address %>"></td>
		            </tr>   
		           
		            <tr>
		                <th>가입일자</th>
		                <td><input type="text" id="joindate" name="joindate" value="<%=joindate %>" ></td>
		            </tr>   
		
		            <tr>
		                <th>고객등급(A:VIP, B:일반, C:직원)</th>
		                <td><input type="text" id="grade" name="grade" value="<%=grade %>"></td>
		            </tr>   
		
		            <tr>
		                <th>도시코드</th>
		                <td><input type="text" id="city" name="city" value="<%=city %>"></td>
		
		
		            </tr>

		            <tr>
		                <td colspan ="2">
		                    <input type="button" value="수정" id="btn_update">   
		                </td>
		            </tr>
       		 </table>
			</form>	
<%		
		}
			
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}


%>       



<%@ include file="footer.jsp" %>

<script>
(()=>{
	
	// 1. 폼 도큐먼트 오브젝트를 가지고 온다.
	const btn_update 		= document.querySelector('#btn_update');		
	const form_update 		= document.querySelector('#form_update');		
		
	const objs = [
		// {객체, 메시지, 메시지}
		{box : document.querySelector("#custname"),		size : 20, 	nodataMsg : '회원성명이 입력되지 않습니다.', 	invalidMsg : '회원성명 데이터가 잘못되었습니다.'},
		{box : document.querySelector("#phone"), 		size : 13,	nodataMsg : '회원전화가 입력되지 않습니다.', 	invalidMsg : '회원전화 데이터가 잘못되었습니다.'},
		{box : document.querySelector("#address"), 		size : 60,	nodataMsg : '회원주소가 입력되지 않습니다.', 	invalidMsg : '회원주소 데이터가 잘못되었습니다.'},
		{box : document.querySelector("#joindate"), 	size : 10,	nodataMsg : '가입일자가 입력되지 않습니다.', 	invalidMsg : '가입일자 데이터가 잘못되었습니다.'},
		{box : document.querySelector("#grade"), 		size : 1,	nodataMsg : '고객등급이 입력되지 않습니다.', 	invalidMsg : '고객등급 데이터가 잘못되었습니다.'},
		{box : document.querySelector("#city"), 		size : 2,	nodataMsg : '도시코드가 입력되지 않습니다.', 	invalidMsg : '도시코드 데이터가 잘못되었습니다.'}
		
	];
	

	console.log(objs[3].box.value.length);
	
	// 모든 입력 박스에 데이터가 존재한다면 true;
	const checkDataExist = function()
	{		
		for (let i = 0; i < objs.length; i++)
		{
			if (objs[i].box.value.length === 0)
				return i;
			
		}
		
		return true;
		
	}
	
	const checkDataSize = function()
	{
		// box들의 데이터 길이를 검사
		for (let i = 0; i < objs.length; i++)
		{
			if (objs[i].box.value.length > objs[i].size)
				return i;
						
		}
		
		return true;	// ★ return 을 안 정해주면 undefined 뜬다. 주의하자
		
	}
	
	
	const checkDataType = function()
	{
	
		
		// 고객등급은 문자
		if (false == isNaN(objs[4].box.value))
		{
			return 4;
		}
		
		// 도시코드는 숫자
		if (true == isNaN(objs[5].box.value))
		{
			return 5;
		}
		
		return true;
	}
	
	let res = null;
	btn_update.addEventListener('click', ()=>{
				
		res = checkDataExist();
		
		if(res == true)
			res = checkDataSize();
			
		if(res == true)
			res = checkDataType();
			
		if(res == false)
		{
			alert("데이터에 문제가 있습니다.")
		}
		else
		{
			form_update.submit();
			alert("데이터를 보냈습니다.")
		}
		
		
	});
	
	
	
	
	
})();	
</script>
       
	   


</body>
</html>