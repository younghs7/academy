package day17My;

public class CircleQueue {
	
	
	int rear;
	int front;
	int[] ar;
	
	static String ERR;
	
	
	//1. 생성자 메소드 -----------------------------------------------------
	public CircleQueue(int[] ar)
	{
		rear = 0;
		front = 0;
		this.ar = ar;
		ERR = "정상작동";
	}
	
	
	//2.  메소드 -----------------------------------------------------
	public void enqueue(int data)
	{
		if(rear == ar.length)
		{
			rear = 0;
		}
		else if(rear <0 || rear > ar.length)
		{
			ERR = "inqueue() 오류, rear셋팅 오류 보수 필요. ";
		}
		
		
		if(ar[rear] == 0)
		{
			ar[rear] = data;
			rear++;
		}
		else
		{
			ERR = "inqueue() 오류, queue가 꽉 차 있는 상태에서 실행했다.";
		}
		
		
	}
	
	public int dequeue()
	{	
		int temp = 0;
		
		if(front == ar.length)
		{
			front = 0;
		}
		//front가 음수이거나, 
		else if(front <0 || front > ar.length)
		{
			ERR = "dequeue() 오류, front셋팅 오류 보수 필요. ";
		}
		
	
		if(ar[front] != 0)
		{	
			temp = ar[front];
			ar[front] = 0;
			front++;
		}
		else
		{
			ERR = "dequeue() 오류, queue가 비어있는 상태에서 실행했다.";
		}
		
		return temp;
	}
	
	
	public void printQueue()
	{
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("배열["+i+"]: "+ ar[i]);
		}
		
		System.err.println(ERR);
			
	}

	
	

}
