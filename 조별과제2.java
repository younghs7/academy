
public class 조별과제2 {
	
	
	//1. 소수를 판단하는 함수를 만드세요.
	public static void isPrimeNumber(int parameter) 
	{	
//		나눴을 때 나머지가0 아니면 반복. 나눴을 때 나머지가 0이면 중단(소수가 아닌 거지) 
		
		
		boolean you소수 = true;
		
		if(parameter == 1)
		{
			you소수 = false;
		}
		
		else
		{
			int count = 1;
			for(int i = 0; i < parameter-2; i++)
			{
				count = count + 1;
				
				if(parameter%count == 0) 
				{
						you소수 = false;
				}
				
			}
		}
		
		
		if(you소수)
		{
			System.out.println("그 숫자는 소수입니다.");
		}
		else
		{
			System.out.println("그 숫자는 소수가 아니에요.");
		}
		
			
		
	}
	
	
	public static void main(String[] args) 
	{
		
		
		
		// 1~100 랜덤값 출력하는 함수
		int randomNumber = (int) Math.ceil(Math.random() * 100);
				
		System.out.println("랜덤값: "+randomNumber);
		
		isPrimeNumber(2);
		
		
	
		 
		
	}
}
