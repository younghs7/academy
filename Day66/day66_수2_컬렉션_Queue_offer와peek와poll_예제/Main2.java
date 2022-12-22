package day66_수2_컬렉션_Queue_offer와peek와poll_예제;

import java.util.LinkedList;
import java.util.Queue;

public class Main2 {

		// offer() 
		// peek()
		// poll() 
		// --> 예외가 발생하지 않는다.
	
		// 영어사전 poll : 개표
		// 영어사전 peek : 훔쳐보다.

		// add, element, remove() 와 혼용 가능하다.
	
	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("a");
		queue.offer("ab");
		queue.offer("abc");
		
		System.out.println("queue.peek(): "+ queue.peek()); 	// a
		System.out.println(queue.remove()); 					// a
		System.out.println(queue.poll()); 						// ab 
		System.out.println(queue.poll()); 						// abc
		System.out.println(queue.poll()); 						// null
		
		
	}

}
