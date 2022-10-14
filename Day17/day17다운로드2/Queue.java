package day17다운로드2;

public class Queue {
	
	// Attribute 
	private int[] frame;		// queue data
	private int count;			// queue count (queue에 데이터가 몇개 있는가?)
	
	private int front;			// dequeue에서 사용하는 위치값 (출력)
	private int rear;			// enqueue에서 사용하는 위치값 (입력)
	
	// Constructor
	public Queue()
	{
		frame = null;
		count = 0;
		
		front = 0;
		rear = 0;
		
	}
	
	public Queue(int size)
	{	
		frame = new int[size];
		count = 0;
		
		front = 0;
		rear = 0;
		
	}
	
	///////////////////////////////////////////////////////////
	// Method
	
	// queue를 초기화
	public void init(int size)
	{
		frame = new int[size];
		count = 0;
		
		front = 0;
		rear = 0;
		
	}
	
	// 데이터를 입력
	// true 	: 데이터를 정상적으로 frame에 저장했다.
	// false 	: 데이터를 저장하지 못했다. (queue-full)
	public boolean enqueue(int data)
	{
		// queue-full 이라면 return.
		if (count == getFrameSize())
			return false;
		
		// rear위치에 데이터를 넣어준다.		
		frame[rear] = data;
				
		// rear위치를 조정한다.
		rear++;
		rear = rear % getFrameSize();	
		
		// 카운트를 증가한다.
		count++;
		return true;
	}
	
	// frame에서 데이터를 출력
	// 에러발생시 정수형의 최소값을 리턴한다.
	public int dequeue()
	{
		int returnValue;
		
		// queue-empty면 return
		if (count == 0)
			return Integer.MIN_VALUE;
		
		// front 위치의 데이터를 리턴한다.
		returnValue = frame[front];
		
		// front값을 조정한다.		
		front++;
		front = front % getFrameSize();	
		
		// count값을 줄인다.
		count--;
		return returnValue;
	
	}
	
	public int getFrameSize()
	{
		return frame.length;		
		
	}
	
	public int getCount()
	{
		return count;
		
	}
	
	public void print()
	{
		int index = front;
		
		for (int i = 0; i < count; i++)
		{
			System.out.println("index = " + index + ", value = " + frame[index]);
			
			index++;
			index = index % getFrameSize();
			
			
		}
		
		
	}
	

}
