package day20시험;

public class 손영호_queue {
	
	private int[] ar;
	private int front;
	private int rear;
	private int count;
	
//----------------------------------	
	
	public 손영호_queue()
	{
		ar = null;
		rear = 0;
		front = 0;
		count = 0;
	}
	
	public 손영호_queue(int arraySize)
	{
		ar = new int[arraySize];
		rear = 0;
		front = 0;
		count = 0;
	}

	

	
//	3.enqueue() 호출 --------------------------------
	public boolean enqueue(int input)
	{	
		
		
		
		if(count == ar.length)
		{
			return false;
		}
		
		ar[rear] = input; 
		rear++;
		count++;
		
		if(rear == ar.length)
			rear = 0;
		
		return true;
		
		/*
		 느낀 점:
		 코드 에러 여부를 확인하게 위해서 boolean형을 놓을 것이라면
		 return true보다 false를 앞에 놓는 게 낫다.
		 왜냐하면 딱봐도 boolean 리턴형이 어떤 용도로 쓰는지 보자마자 알 수 있기 때문에
		 전체 코드를 이해하기 쉬워진다.
		 */
		
		
//		if(count <= ar.length - 1)
//		{
//			ar[rear] = input; 
//			rear++;
//			count++;
//			
//			if(rear == ar.length)
//				rear = 0;
//			
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		
		/*
		 이것 보다는
		 */
		
	}

	
	
//	4.dequeue() 호출 -----------------------------------
	public boolean dequeue()
	{	
		if(count <= 0)
		{
			return false;
		}
		
		ar[front] = 0;
		front++;
		count--;
		
		front = front%ar.length;
		
		return true;
		
	}
	
//		if(count >= 1)
//		{
//			ar[front] = 0;
//			front++;
//			count--;
//			
//			front = front%ar.length;
//			return true;
//		}
//		
//		return false;
//	}
	
	
	
	
//	5.printQueue() 호출 -------------------------------
	public void printQueue()
	{	
		
//		for(int i = 0; i < ar.length; i++)
//			System.out.println(ar[i]);
		
	
		System.out.println("queue 상태 --------");
		System.out.println("(다음 출력▽)");
		
		int countFront = front;
		for(int i = 0; i < count; i++)
		{	
		
			
			System.out.println("배열["+countFront+"] :"+ ar[countFront]);
			countFront++;
			
			if(countFront == ar.length)
				countFront = 0;
		}
		
		System.out.println("(다음 입력 위치 ◁)");
			
	
	}
}
