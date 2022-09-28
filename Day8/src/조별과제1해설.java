
public class 조별과제1해설 {
	

	
	// 1~100 사이의 짝수의 합을 구한다. + 1~100 사이의 홀수의 합을 구한다.
	public static int addEvenOdd(int max, boolean evenFlag)
	{
		int target = 1;
		int total = 0;
		int comp = 0;
		
//		짝수
		if (evenFlag == true)
		{
			comp = 0;
		}
		
//		홀수 
		else
		{
			comp = 1;
		}
		
		
		for (int i = 0; i < max; i++)
		{	
			//1. taget이 짝수면 누적한다.
		
			if( (target % 2) == comp )
			{
				total = total + target;
				System.out.println(target);
			}
			
			//2. target 증가한다.
			target = target + 1;
		}
		
		
		return total;
	}
		
	/*
	 ★파리미터와 리턴값부터 생각해야한다.
	 
	 ★보편적인 사람의 사고대로 짜야된다. 
	 1. 이해하기 좋다. (가독성)
	 2. 뜯어고치고 좋다. (수정용이성)
	 3. 간단하게 짜는 게 견고하다 (에러 가능성이 낮다)
	 */
	
	/*
	 코드는 하나도 안 중요하고 함수를 
	 1. 개별화, 통합화하는 기준과 
	 2. 개별화와 통합화의 장점, 단점을 아는 것이 이게 중요하다.
	 */
	


	public static void main(String[] args) {
		
		int result = addEvenOdd(10, true);
		System.out.println(result);
		
		
		

	}

}
