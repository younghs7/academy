package day68_수1_Day67Collects종합문제_풀이1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main1 {
	
	// 이 예제 목적:
	// 주의사항: 이 코드를 짜는 것에 목적이 있지 않고 과정에 목적이 있다. 
	// reference를 왜 보고 짜야하는지, 인터페이스가 왜 필요한지를 느끼기 위해서이다.

	public static void main(String[] args) {

		MyQueue<String> myq = new MyQueue<>();
		MyQueue<Integer> myq2 = new MyQueue<>();
		
		myq.enqueue("A1");
		myq.enqueue("A2");
		myq.enqueue("A3");
	
		System.out.println(myq.dequeue() );
		System.out.println(myq.dequeue() );
		System.out.println(myq.dequeue() );
		
		System.out.println(myq.getSize());
	
	}

}


interface IQueue<E>
{
	public boolean enqueue(E item);		// Queue에 데이터를 넣는다.
	public E dequeue();					// Queue에서 데이터를 빼낸다.
	public int getSize();				// Queue에 데이터가 몇개 있는지 알아본다.
	
	// 이렇게 써놓으면 사용자는 인터페이스만 보지.
	// MyQueue<E> 구현부를 보지 않는다. 볼 필요가 없다.
	
}



class MyQueue<E> implements IQueue<E>
{
	private Deque<E> frame;

	public MyQueue() {
	
		frame = new ArrayDeque<>();
	}
	
	public MyQueue(Deque<E> frame) {
		this.frame = frame;
	}
	
	
	@Override
	public boolean enqueue(E item) {
		
		return frame.offerFirst(item);
	}

	@Override
	public E dequeue() {
		
		return frame.pollLast();
	}

	@Override
	public int getSize() {
		
		return frame.size();
	}
	
	
	
}


