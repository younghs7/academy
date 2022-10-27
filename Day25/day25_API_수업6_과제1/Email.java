package day25_API_수업6_과제1;

public class Email {
	
	
	/* 문제
	String email = "jsh.ezen.2022@gmail.com";
	
	1. email 문자열이 이메일 형식 맞는지 맞지 않는지를 판단하는 함수를 만드세요 
	기준1: @는 1개 있어야한다.
	기준2: @ 앞쪽에 문자열이 존재해야한다.
	기준3: @ 뒷쪽에 문자열이 존재해야한다.
	기준4: @ 뒷쪽에 최소한 한개의.이 존재해야한다.
	
	2. 아이디를 추출하는 함수를 만드시오
	jsh.ezen.2022
	
	3. 도메인을 추출하는 함수를 만드시오 단 도메인은 www.으로 시작해야한다. 
	www.gmail.com
	
	 */
	
	
//	------------------------------------------------
//	메소드

	
	
	// 1. email 문자열이 이메일 형식 맞는지 맞지 않는지를 판단하는 함수를 만드세요 
	public static boolean isEmail(String email)
	{
		//1. @는 1개 있는지 확인한다.
		int inx = email.indexOf("@");
		int inx2 = email.lastIndexOf("@");
		//1-1. @가 없는 경우
//		try {
			
		if(inx == -1)
//			throw new Exception("이메일이 아닌데?");
//		}
//		catch(Exception e)
//		{	
//			System.out.println(e.getMessage());
			return false;
//		}
		
		
		//1-2. @가 2개 이상 있는 경우
		if(inx != inx2)
			return false;
												//lastIndexOf 안 쓰고 하는 방법은 
												//1-2-1.indexOf 로 첫번째 @ 찾고
												//1-2-2.@인덱스 후부터 마지막까지를 새로운 String 변수에 담고
												//1-2-3.String 참조변수로 indexOf("@") 호출했을 때, 리턴값이 0이상이면 false 리턴
		
		//2. @앞쪽에 문자열이 존재하는지 확인한다.
		if(inx == 0)
			return false;
		
		//3. @뒷쪽에 문자열이 존재하는지 확인한다.
		if(inx == email.length()-1)
			return false;
		
		
		//4. @뒷쪽에 .이 존재하는지 확인한다.
			
		//4-1.@인덱스 이후에서 끝까지를 temp에 담는다.
		String temp = "";
		for(int i = inx+1; i <= email.length()-1; i++)
		{
			temp = temp + email.charAt(i);
		}	
		
		//4-2.temp(뒷 부분)에 .이 있는지 확인한다.
		int inx3 = temp.indexOf(".");
		
		if(inx3 == -1)
			return false;
		
		
		//5. 1~4를 다 만족한다면 true를 리턴한다.
		return true;
	}
	
	
	
	
	
	//2. 아이디를 추출하는 함수를 만드시오
	public static String extractID(String email)
	{	
		//0. 이메일이 맞는지 확인한다.
		if( isEmail(email) == false )
			return "이메일이 아냐";
		
		//1. indexOf 메소드로 @위치를 찾는다.
	 	int inx = email.indexOf("@");
	 	
		//2. 인덱스 0 ~ @ 인덱스 전까지를 temp에 담는다
	 	String temp = "";
	 	for(int i = 0; i <= inx-1; i++)
	 	{
	 		temp = temp + email.charAt(i);
	 	}
	 	
	 	//3. temp를 리턴한다.
	 	return temp;
	}
		
		
	//3. 도메인을 추출하는 함수를 만드시오 단 도메인은 www.으로 시작해야한다. 
	public static String extract도메인(String email)
	{
		
		//0. 이메일이 맞는지 확인한다.
		if( isEmail(email) == false )
			return "이메일이 아냐";
		
		//1. indexOf 메소드로 @위치를 찾는다.
		int inx = email.indexOf("@");
		
		//2. String에 www.을 담는다.
		String temp = "www.";
		
		//3. @인덱스 이후에서 끝까지를 담는다.
		for(int i = inx+1; i <= email.length()-1; i++)
		{
			temp = temp + email.charAt(i);
		}
		
		//4. temp를 리턴한다.
		return temp;
		
	}
	
	
	
//	-------------------------------------

}
