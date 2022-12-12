package day58_자바정리_수2_문제풀이_다운로드;

public class Example01 {
	
	
	public static void main(String[] args) 
	{

		URLAnalyer urla = new URLAnalyer
		("https://www.naver.com/index.html?id=admin&pwd=1234&type=manager");
		
		// 1. 도메인을 가지고 온다
		String domain = urla.getDomain();
		System.out.println(domain);
		
		
		int paramCount = urla.getParamCount();
		System.out.println(paramCount);

		
		for (int i = 0; i < paramCount; i++)
		{
			URLParameter param = urla.getParam(i);
			System.out.println(param.key + " = " + param.value);
		}
				
	}

}

