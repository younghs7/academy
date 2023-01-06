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
<title>회원등록 </title>

<link rel="stylesheet" href="./style.css"><base>

<style>
	
	h1 {
		text-align: center;
	}
	
	selection {
		width: 100%
		align-items: center;
	}

	form {
		
	}
	
	table {
		
		width: 500px;
		margin: auto;
	}
	
	th, td {
		align-items: center;
		align-content: center;
		border: 1px solid black;
	}

</style>

</head>
<body>

  

  <%@ include file ="header.jsp" %>
  <%@ include file ="nav.jsp" %>

    <section>
        <div>
        	 <h1>홈쇼핑 회원 등록</h1>
        </div>

<%
	Connection conn = null;	// DBMS를 연결 객체
	Statement stmt = null;	// 쿼리를 처리하는 객체
	ResultSet rset = null;	// 쿼리 결과를 저장하는 객체
	
	String sql = "SELECT max(custno)+1 FROM MEMBER_TBL_02";
	
	String maxCustno ="";
	
	try {
		// 1. DBMS에 연결을 한다.
		conn = DBConnection.getConnection();
		
		// 2. 쿼리를 전송한다.
		stmt = conn.createStatement();
		rset = stmt.executeQuery(sql);
		
		// 3. ResultSet의 결과를 화면에 출력한다.
		while(true == rset.next() )
		{
			maxCustno = rset.getString(1);
		}
		
		rset.close();
		stmt.close();
		conn.close();
	}
	catch(Exception excp)
	{
		System.out.println("ERROR" + excp.getMessage());
		excp.getStackTrace();
	}


%>       
       
	   <form method="get" id="regForm" name="regForm" >

        <table>
            <tr>
                <th>회원번호(자동발생)</th>
                <td><input type="text" id="id_custno" name="custno" value=<%=maxCustno %>></td>
            </tr>  
            <!-- id는 자바스크립트를 위한 것 name은 DB저장을 위한 것 -->
        
       
            <tr>
                <th>회원성명</th>
                <td><input type="text" id="id_custname" name="custname"></td>
            </tr>   
           

            <tr>
                <th>회원전화</th>
                <td><input type="text" id="id_phone" name="phone" ></td>
            </tr>   
           
            <tr>
                <th>회원주소</th>
                <td><input type="text" id="id_address" name="address"></td>
            </tr>   
           
            <tr>
                <th>가입일자</th>
                <td><input type="text" id="id_joindate" name="joindate" ></td>
            </tr>   

            <tr>
                <th>고객등급(A:VIP, B:일반, C:직원)</th>
                <td><input type="text" id="id_grade" name="grade" ></td>
            </tr>   

            <tr>
                <th>도시코드</th>
                <td><input type="text" id="id_city" name="city"></td>


            </tr>

            <tr>
                <td colspan ="2">
                    <input type="button" value="등록" id="id_regMember">   
                    <input type="button" value="조회" id="id_inqMember">  
                </td>
            </tr>
                
        </table>

      

    </form>

       
       <div>
       	
       </div>
    </section>

    <footer>
        <div>
            <p>copyright 손영호 </p>
        </div>
    </footer>
 
 <iframe name="hiddenframe" style="display: none"></iframe>   
 
<script>
	(()=>{
		
		const frmReg = document.querySelector('#regForm');

		const custno = document.querySelector('#id_custno');
		const custname = document.querySelector('#id_custname');
		const phone = document.querySelector('#id_phone');
		const address = document.querySelector('#id_address');
		const grade = document.querySelector('#id_grade');
		const btnRegMember = document.querySelector ('#id_regMember');
		const btnInqMember = document.querySelector ('#id_inqMember');
		
		
		const examine = function() {
			
			if(	(custname.value === "") ||
				(phone.value === "")	||
				(address.value === "")	||
				(grade.value === "")
			   )
				{
					alert("다 입력하지 않았습니다.");
					return false;
				}
			
			return true;
			
		}
		
		const examineEffectiveness = function()
		{
			
			// grade 
			if(grade.value.length >= 2)
			{
				alert("grade 길이 1만 됨 ")			
				return false;
			}
			
			if(	grade.value === "A" || 
				grade.value ===	"B" || 
				grade.value === "C"
			  )
			{
			}
			else
			{
				alert("grade A, B, C 중에 입력해야됩니다.");
				return false;
			}

			
			// custname
			if(custname.value.length >= 21 )
			{
				alert("회원성명 20자리 이하로 작성해야됩니다.")
			}
			if(parseInt(custname.value) !== NaN )
			{	
				console.log(parseInt(custname.value));
				alert("회원성명 잘못된 입력")
				return false;
			}
			
			// phone
			if(phone.value.length >= 14)
			{
				alert("전화번호는 13자리를 넘을 수 없습니다.")
			}
			if(parseInt(phone.value) === NaN)
			{
				alert("전화번호 잘못된 입력")
				return false;
			}
			
			
		}
		
		// 모든 입력 박스에 데이터가 존재한다면 true;
		const checkDataSize = function()
		{
			
		}
		
		btnRegMember.addEventListener ('click', ()=>{
			// 1. 데이터가 다 있는지 검사
			let bresult = examine();
			
			// 2. 데이터가 정확한지 유효성 검사
			if( bresult)
			{
				bresult = examineEffectiveness();	
			}
				
			// 3. 다 정확하다면 저장을 해달라고 서버로 요청한다.
			frmReg.action = "member.jsp";	// action은 폼데이터가 전달될 URL 설정
			frmReg.target = "hiddenframe";
			frmReg.submit();				// 폼데이터를 던져라!!
			
		});
		
		btnInqMember.addEventListener ('click', ()=>{
			
			location.href = 'inquiry.jsp';
		
			
		});
		
		
	})();
</script>
</body>
</html>