package day25_API_수업6_과제1;

public class Main_my {
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
	
	

	public static void main(String[] args) {
		
		String email = "jsh.ezen.2022@naver.com";
		
		System.out.println(email.length());
		

		Email em = new Email();
		
		System.out.println(email.indexOf("@"));
//		System.out.println(email.substring(0, 3));
		
		
		// 1. email 문자열이 이메일 형식 맞는지 맞지 않는지를 판단하는 함수를 만드세요 
		boolean bresult = em.isEmail(email);
		System.out.println(bresult);
		
		
		//2. 아이디를 추출하는 함수를 만드시오
		String result = em.extractID(email);
		System.out.println(result);
		
		//3. 도메인을 추출하는 함수를 만드시오 단 도메인은 www.으로 시작해야한다. 
		
		result = em.extract도메인(email);
		System.out.println(result);
		
		
		int[] ar = new int[6];
		
		System.out.println(ar.length);
		System.out.println(ar[5]);
		
		//length = 갯수와 동일함. 최대 인덱스는 length - 1와 동일함.
		//그림으로 이해해봐. 1~5에다가 +1(index 0) 해서 6개 된다고 생각하면 되잖아.
		
		
		
		
	}

}
