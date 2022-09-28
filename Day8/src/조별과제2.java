

public class 조별과제2 {
	
	
	//문제) 소수를 판단하는 함수를 만드세요.
	public static void isPrimeNumber(int parameter) 
	{	

		
		
		
		boolean you소수 = true;
		
		
		//입력값이 1인 경우, 2인 경우, 3이상인 경우로 나눈다.
		
		//1인 경우 -> 소수가 아닙니다.
		if(parameter == 1)
		{
			you소수 = false;
		}
		
		//2인 경우 -> 소수입니다.
		else if(parameter == 2)
		{
			you소수 = true;
		}
		
		//3 이상인 경우에는 %연산자로 소수 여부를 계산한다.
		else
		{	
			// 입력값-2 만큼 반복한다.
			int count = 1;
			for(int i = 0; i < parameter-2; i++)
			{
				count = count + 1;
				
				//해당 count 숫자가 약수인지 확인한다. 약수라면 you소수에 false를 대입한다.
				if(parameter%count == 0) 
				{
						you소수 = false;
				}
				
			}
		}
		
		
		// you소수의 T/F 값에 따라 해당 숫자를 
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
		
		//만든 소수판별함수로 랜덤값을 받아서 소수인지 출력된다.
		isPrimeNumber(randomNumber);
		
		
	
		 
		
	}
}

