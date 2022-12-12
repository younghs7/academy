package day58_자바정리_수1_저번주_문제_추가요구;

public class Main_수1 {

	public static void main(String[] args) {

		
		URLAnalyer url = new URLAnalyer("https://www.naver.com/index.html?id=admin&pw=1234");
		url.initalize();
		
		System.out.println(url.getURL() );
		
		
		String domain = url.getDomain();
		System.out.println("도메인: "+domain);
		
		
		int paramCount = url.getParamCount();
		URLParameter[] param = url.getParameter();
	
		System.out.println("갯수: "+  url.getParamCount()  );
		
		
		for(int i = 0; i < paramCount; i++)
		{
			System.out.println(param[i].key +" = "+ param[i].value);

			
		}
		
		System.out.println("1번째 파라미터 key: " + url.getParamBy(1).key);
		System.out.println("1번째 파라미터 value: " + url.getParamBy(1).value);
		
		
		
//		//프린트!
		
		
		
		
		
		
		

	}

}
