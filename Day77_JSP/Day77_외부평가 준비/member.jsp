<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>	<!-- insert할 때는 ResultSet을 쓰지 않는다. -->

<%@page import="DBPKG.DBConnection"%>




    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MEMBER 테이블에 추가</title>
</head>
<body>

<h1>member!!</h1>

<%
	request.setCharacterEncoding("UTF-8");

	String custno 	= request.getParameter("custno");		// getParameter()안에 파라미터는 태그 name속성으로 넣어야 한다.
	String custname = request.getParameter("custname");		// 즉 input name속성은 form데이터를 참조하기 위한 용도로 사용된다.
	String phone 	= request.getParameter("phone");
	String address 	= request.getParameter("address");
	String joindate	= request.getParameter("joindate");
	String city 	= request.getParameter("city");
	String grade 	= request.getParameter("grade");
	
	String cust 	= request.getParameter("cust");
	
	String sql = "INSERT INTO MEMBER_TBL_02 VALUES(" 	+custno+ 	", "
												+"'"	+custname+ 	"', "
												+"'"	+phone+ 	"', "
												+"'"	+address+ 	"', "
												+"'"	+joindate+ 	"', "	// 날짜는 형태가 다양하기 때문에 당연히 스트링으로 받겠지.
												+"'"	+grade+ 	"', " 
												+"'"	+city+ 		"')";
	
	// 무조건 여기까지 작성해놓고, sqldeveloper에서 sql이 정상적으로 돌아가는지 확인 작업이 필요하다.
	

	
	Connection conn = null;
	Statement stmt = null;
	int result = 0;
	
	try
	{
		conn = DBConnection.getConnection();
		stmt = conn.createStatement();
		
		result = stmt.executeUpdate(sql);
	
		// INSERT문을 commit시킨다.
		if ( false == conn.getAutoCommit() )	// getAutoCommit을 쓰면 오토커밋 여부를 확인할 수 있다.	
			conn.commit();
		
		stmt.close();	// 오픈 역순으로 close 해야됨.
		conn.close();
	}
	catch(Exception excp)
	{
		System.out.println("Error" + excp.getMessage());
		excp.printStackTrace();
	}
	finally
	{
		out.println("<h1>" + result + "</h1>");
	}
	
	out.println("<h1>" + result + "</h1>");
	
%>

<h1><%= custno %></h1>
<h1><%= custname %></h1>
<h1><%= phone %></h1>
<h1><%= address %></h1>
<h1><%= joindate %></h1>
<h1><%= city %></h1>
<h1><%= sql %></h1>

<script>
(()=>{
	
	const resultElem = document.querySelector("h1");
	
	if(resultElem.textContent == '1')
	{
		parent.location.reload();
		alert("회원정보를 저장했습니다");
	}
	else
	{
		alert("회원정보를 저장하지 못했습니다.");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
})();
</script>

</body>
</html>