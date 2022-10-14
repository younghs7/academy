package day17풀이;

public class Queue {
	
	
	/*
	 expression - this
	 init 안 쓰면 heap에서 가비지 컬렉터가 삭제
	 확인 할 때 디버그를 쓰기도 하지만, print 함수로 찍어서 확인하기도 한다.
	 */
	
	//Atrribute
	private int[] frame;  // queue data
	private int count;     // queue size
	
	private int front; //dequeue(출력)에서 사용하는 위치값
	private int rear; // enqueue(입력)에서 사용하는 위치값
	
	
	//Constructor
	public Queue()
	{
		  frame = null;  // queue data
		  count = 0;     // queue size
		
		  front =0; //dequeue(출력)에서 사용하는 위치값
		  rear =0; // enqueue(입력)에서 사용하는 위치값
		
	}
	
	public Queue(int size)
	{
		
		
		  frame = new int[size];  // queue data
		  count = 0;     // queue size
		
		  front =0; //dequeue(출력)에서 사용하는 위치값
		  rear =0; // enqueue(입력)에서 사용하는 위치값
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////
	// Method
	
	
	//queue를 초기화
	public void init(int size)
	{
		  frame = new int[size];  // queue data
		  this.count = size;     // queue size
		
		  front =0; //dequeue(출력)에서 사용하는 위치값
		  rear =0; // enqueue(입력)에서 사용하는 위치값
	}
	
	//데이터를 입력하는 메소드
	//ture : 데이터를 정상적으로 frame에 저장했다.
	//false: 데이터를 정상적으로 frame에 저장하지 못했다.
	public boolean enqueue(int data)
	{
		//queue-full
		if(count == getFrameSize())
			return false;
		
		//rear위치에 데이터를 넣어준다.
		frame[rear] = data;
		
		//rear위치를 조정한다.
		rear++;
		rear = rear%getFrameSize();
		//카운트 증가
		count++;
		
		return true;
	}
	
	
	// frame에서 데이터를 출력하는 메소드
	// 에러 발생시 정수형의 최소값을 리턴한다.
	public int dequeue()
	{	
		int returnValue;
		// queue-empty면 return
		if(count == 0)
			return Integer.MIN_VALUE;
		
		// front 위치의 데이터를 리턴한다.
		returnValue = frame[front];
		
		// front값을 조정한다.
		
		front++;
		front = front%getFrameSize();
		//카운트 감소
		count--;
		
		return 1;
	}
	
	public int getFrameSize()
	{
		return frame.length;
	}
	
	public int getCount()
	{
		return count;
	}

}
