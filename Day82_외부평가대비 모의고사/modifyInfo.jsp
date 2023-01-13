<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ page import ="DBPKG.*" %>

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
	
	section  table {
		text-align: center;
		margin: auto;
	}
	
	section iframe {
		display: none;
	}

</style>

<body>


	
	<%@ include file ="header.jsp" %>
	<%@ include file ="nav.jsp" %>
	
<% 
	request.setCharacterEncoding("UTF-8");
	
	String custno = request.getParameter("custno");
	
	Connection conn = null;
	Statement stmt = null;
	ResultSet rset = null;
	
	String sql = "SELECT * FROM MEMBER_TBL_02 WHERE custno="+custno; // WHRER 문 꼭 붙이기
	
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
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
%>
	
	
	<section>
		<h1>홈쇼핑 회원 정보 수정</h1>
		<form id="form" method="post">
			<table border="1">
				<tr>
					<th>회원번호(자동발생)</th>
					<td><input readonly="readonly" id="custno" name="custno" value="<%=custno %>"></td>			
				</tr>
			
				<tr>
					<th>회원성명</th>
					<td><input id="custname" name="custname" value="<%=custname %>"></td>			
				</tr>
				
				<tr>
					<th>회원전화</th>
					<td><input id="phone" name="phone" value="<%=phone %>"></td>			
				</tr>
				
				
				<tr>
					<th>회원주소</th>
					<td><input id="address" name="address" value="<%=address %>"></td>			
				</tr>
			
				<tr>
					<th>가입일자</th>
					<td><input id="joindate" name="joindate" value="<%=joindate %>"></td>			
				</tr>
			
				<tr>
					<th>고객등급[A:VIP, B:일반, C:직원] </th>
					<td><input id="grade" name="grade" value="<%=grade %>"></td>			
				</tr>
				
				<tr>
					<th>도시코드</th>
					<td><input id="city" name="city" value="<%=city %>"></td>			
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="button" id="btn_mod" value="수정" >
						<input type="button" id="btn_inq" value="조회" >				
					</td>
				</tr>
				
				
				
			
			
			</table>
		</form>	
		
		<iframe name="iframe"></iframe>
		
	</section>
	
	
	
	<%@ include file ="footer.jsp" %>
	
	
	<script>
	(()=>{
			
		const custno	= {ref: document.querySelector("#custno"), 		nodataMsg: "회원번호가 없습니다.", size: 6	, 	sizeMsg: "회원번호 길이 오류  "};
		const custname 	= {ref: document.querySelector("#custname"), 	nodataMsg: "회원성명이 없습니다.", size: 20 	,	sizeMsg: "회원성명 길이 오류  "};
		const phone 	= {ref: document.querySelector("#phone"), 		nodataMsg: "회원전화가 없습니다.", size: 13 	,	sizeMsg: "회원전화 길이 오류  "};
		const address 	= {ref: document.querySelector("#address"), 	nodataMsg: "회원주소가 없습니다.", size: 60 	,	sizeMsg: "회원주소 길이 오류  "};
		const joindate 	= {ref: document.querySelector("#joindate"), 	nodataMsg: "가입일자가 없습니다.", size: 10 	,	sizeMsg: "가입일자 길이 오류  ", invalidMsg: "날짜 형식이 아닙니다."};
		const grade 	= {ref: document.querySelector("#grade"), 		nodataMsg: "고객등급이 없습니다.", size: 1 	,	sizeMsg: "고객등급 길이 오류  ", invalidMsg: "고객등급은 A,B,C만 들어갈 수 있습니다."};
		const city 		= {ref: document.querySelector("#city"),		nodataMsg: "도시코드가 없습니다.", size: 2 	,	sizeMsg: "도시코드 길이 오류  ", invalidMsg: "도시코드는 숫자만 들어갈 수 있습니다." };
		
		const objs = [
			
			custno,
			custname,
			phone,
			address,
			joindate,
			grade,
			city			
			
			];

		const btn_mod = document.querySelector("#btn_mod");
		const btn_inq = document.querySelector("#btn_inq");
		const form = document.querySelector("#form");
		
		
		// 조회		
		btn_inq.addEventListener("click", ()=>{
			
			location.href="inquiryMember.jsp";	
			
		});
		
		
		let res = null;
		// 등록
		btn_mod.addEventListener("click", ()=>{
			
			
			res = checkDataExistance();
			
			if(res != true)
				return;
			
			res = checkDataSize();
			
			if(res != true)
				return;
			
			res = checkDataType();
			
			if(res != true)
				return;
			
			if(res === true)
			{
				form.action = "updateDB.jsp";	// action: form 데이터 전송할 url 설정
				form.target = "iframe";			// target: 다른 곳에서 action url 페이지를 열도록 설정   
												// 			- iframe name 으로 써도 되고, _blank _self _parent 가능 
				form.submit();					// submit() 없으면 제출 안됨.
			
			
				// 여기서 location.reload(); 하면 alert 조차 사라진다.
				// 페이지 두개가 따로 놀아서 그런 것 같다. reload는 updateDB.jsp에서 할 것.
			}
			
			
			
			
			
		
		});
		
		
		
		const checkDataExistance = function()
		{
			for(let i = 0; i < objs.length; i++)
			{
				if(objs[i].ref.value.length == 0)
				{
					objs[i].ref.focus();
					alert(objs[i].nodataMsg);
					
					return i;
				}
			}

			return true;
		}
		
		const checkDataSize = function()
		{
			for(let i = 0; i < objs.length; i++)
			{
				if(objs[i].ref.value.length > objs[i].size)
				{
					objs[i].ref.focus();
					alert(objs[i].sizeMsg);
					
					return i;
				}
			}
			
			if(joindate.ref.value.length < 8)
			{	
				objs[4].ref.focus();
				alert(objs[4].sizeMsg);
				return 4;
			}
			
			return true;
		}
		
		const checkDataType = function()
		{	
			// 도시코드 숫자인지 아닌지
			if(isNaN(city.ref.value) === true )
			{
				alert(city.invalidMsg);
				city.focus();
				return false;
			}
	
			// grade가 A,B,C 인지 아닌지
			switch(grade.ref.value)
			{
				case "A": break;
				case "B": break;
				case "C": break;
				
				default : 
					alert(grade.invalidMsg);
					grade.focus();
					return false;
			}
			
			
			// 숫자 형태인지 확인
			let s1 	= joindate.ref.value.replaceAll("-", "");
			let s2 	= joindate.ref.value.replaceAll("/", "");
			let s3 	= joindate.ref.value.replaceAll(".", "");
			
			if
			( isNaN(s1) == false ||
			  isNaN(s2) == false ||
			  isNaN(s3) == false
			)
			{
				
			}
			else
			{
				alert(joindate.invalidMsg);
				joindate.focus();
				return false;
			}
				
			return true;
		}
		
		
		
	
	
	
	})();
	</script>
	
	

	

</body>
</html>