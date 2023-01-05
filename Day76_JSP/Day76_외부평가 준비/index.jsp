<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="./style.css"><base>

<style>
	

</style>

</head>
<body>


	<%@ include file="header.jsp" %>


    <nav>
        <div>
            <a href="register.jsp"> 회원등록 </a>
            <a href="#"> 회원목록조회/수정 </a>
            <a href="#"> 회원매출조회 </a>
            <a href="index.jsp"> 홈으로</a>
            
        </div>

    </nav>

    <section>
        <div>
        	  <br>
         	  1. 회원정보 테이블을 생성한다 <br>
         	  2. 매출정보 테이블을 생성한다 <br>
         	  3. 회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다. <br>
        </div>
    </section>

    <%@ include file ="footer.jsp" %>
    
 

</body>
</html>