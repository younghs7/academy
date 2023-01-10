<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>홈페이지</title>

<link rel="stylesheet" href="main.css">

<style>
	h1 {
		text-align: center;
		margin: 20px auto;
	}
	
	table {
		width: 700px;
		margin: auto;
		
	}

</style>

</head>
<body>


	<%@ include file = "header.jsp" %>
	<%@ include file = "nav.jsp" %>
	
	
	
	<section>
		<h1>홈쇼핑 회원 등록</h1>
		
		<!-- 	id는 querySelect, CSS, label,
				name은 key-value 에서 key, form데이터 전송시.
				쓰임 차이 있으니 주의할 것
		 -->
		
		<table border="1">
			<tr>
				<th>회원번호(자동발생)</th>
				<td><input id="custno" name ="custno"></td>		
			</tr>
		
			<tr>
				<th>회원성명</th>
				<td><input id="custname" name="custname"></td>		
			</tr>
		
			<tr>
				<th>회원전화</th>
				<td><input id="phone" name ="phone"></td>		
			</tr>
		
			<tr>
				<th>회원주소</th>
				<td><input id="address" name ="address"></td>		
			</tr>
		
			<tr>
				<th>가입일자</th>
				<td><input id="joindate" name ="joindate"></td>		
			</tr>
		
			<tr>
				<th>고객등급[A:VIP, B:일반, C:직원]</th>
				<td><input id="grade" name ="grade"></td>		
			</tr>
		
			<tr>
				<th>도시코드</th>
				<td><input id="city" name ="city"></td>		
			</tr>
		
			<tr>
				<td colspan="2">
					<input type="button" value="등록">
					<input type="button" value="조회">
						
				</td>		
			</tr>
		
		
		</table>
		
	</section>
	
	
	<%@ include file = "footer.jsp" %>


	<script>
	(()=>{
		
		const custno = document.querySelector("#custno");
		const custname = document.querySelector("#custname");
		
		
		
	})();	
	</script>

</body>
</html>