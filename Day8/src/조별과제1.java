
public class 조별과제1 {
	
	
	public static int 짝수합계()
	{
		//1. 50번 반복
		//2. 2씩 증가
		
		int number = 2;
		int sum = 0;
				
		for(int i =0; i <50; i++)
		{ 
			number = number + 2;
			sum = sum + number;
		}
		
		return sum;
		
	}
	
	
	public static int 홀수합계()
	{
		//1. 50번 반복
		//2. 2씩 증가
		
		int number = 1;
		int sum = 0;
				
		for(int i =0; i <50; i++)
		{ 
			number = number + 2;
			sum = sum + number;
		}
		return sum;
		
	}
	
	
	public static int 짝수합계개선(int input)
	{
//		파라미터- 입력값, 숫자 0, 합계 0 시작
//		1. 입력값까지 반복
//		2. 숫자 2씩 증가
		
		int number = 0;
		int sum = 0;
				
		while( number < input )
		{ 
			sum = sum + number;
			number = number + 2;
		}
		
		return sum;
		
	}
	
	
	

	public static void main(String[] args) 
	{
	 System.out.println( 짝수합계() );
	 System.out.println( 홀수합계() );
	 System.out.println( 짝수합계개선(100) );
	 
	 
	 



	}

}
