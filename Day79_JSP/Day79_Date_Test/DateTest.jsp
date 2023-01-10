<%@page import="DBPKG.DBConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page import="java.sql.Date"%>
<%@page import="java.time.LocalDate" %>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
<%

java.util.Date test = new java.util.Date();

String test2= test.toString();

out.println("test:" +test2);	// test


Connection conn = null;
Statement stmt = null;
ResultSet rset = null;

String sql = "SELECT * FROM member_tbl_02";

String joindate = null;
Date date =null;


try
{
	conn = DBConnection.getConnection();
	stmt = conn.createStatement();
	rset = stmt.executeQuery(sql);
	
	String a;
	
	

					
		date = rset.getDate("joindate"); 	
		joindate = rset.getString("joindate");
		
		 a = date.toString();
		
		out.println("getDate: " + date);
		out.println("Date변환: " + a);
		out.println("getString: " + joindate);
		
		
	
	
	rset.close();
	stmt.close();
	conn.close();
	
}
catch(Exception e)
{
	e.printStackTrace();
}


// 
// java.util.Date a = null;
// Date d = null;

%>	
	
	
	
	
	
</body>
</html>