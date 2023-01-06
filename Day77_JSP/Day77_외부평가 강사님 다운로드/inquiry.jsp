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
<title>회원등록</title>
<link rel="stylesheet" href="main.css">
</head>
<body>
<header>
	<h1>쇼핑몰 회원관리  ver1.0</h1>
</header>

<nav>
	<a href="register.jsp">회원등록</a>
	<a href="#">회원목록조회/수정</a>
	<a href="#">회원매출조회</a>
	<a href="index.jsp">홈으로</a>
</nav>

<table>
<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>


</table>

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
		
			String custno = null;
			String custname = null;
			String phone = null;
			String address = null;
			String joindate = null;
			String grade = null;
			String city = null;
			
			String sql = "SELECT * FROM MEMBER_TBL_02 ORDER BY custno";	
			// sqldeveloper 에서 꼭 먼저 확인하면서 진행할 것
			
			try
			{
				
	
				conn = DBConnection.getConnection();
				stmt = conn.createStatement();
				rset = stmt.executeQuery(sql);
				
				while(true == rset.next())
				{	
					custno = rset.getString("custno");
					custname = rset.getString("custname");
					phone = rset.getString("phone");
					address = rset.getString("address");
					joindate = rset.getString("joindate");			
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
				<td><%=custno %></td>
				<td><%=custname %></td>
				<td><%=phone %></td>
				<td><%=address %></td>
				<td><%=joindate %></td>
				<td><%=grade %></td>
				<td><%=city %></td>
						
			</tr>
	
		
		<% 
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
	
</table>




</body>
</html>