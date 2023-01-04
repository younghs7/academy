S<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체-RequestWebInfo</title>
</head>
<body>

	<h1>Request의 각종 정보</h1>
	<ul>
		<li>데이터 전송방식: <%= request.getMethod() %></li>
		<li>URL : <%= request.getRequestURL() %></li>
		<li>param1 : <%= request.getParameter("eng") %></li>
		<li>param2 : <%= request.getParameter("kor") %></li>
		
		<li>프로토콜:  <%= request.getProtocol() %></li>
		<li>서버명:  <%= request.getServerName() %></li>
		<li>서버포트:  <%= request.getServerPort() %></li>
		<li>쿼리스트링:  <%= request.getQueryString() %></li>
		
		
	</ul>
	
	<!-- request를 통하여 이것저것 알 수 있다. -->
	
	

</body>
</html>