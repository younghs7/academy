package day66_수1_컬렉션_Queue_add와element와remove_예제;

import java.util.LinkedList;
import java.util.Queue;

public class Main1 {

	
	// queue는 저장 자료구조가 아니라 자료의 운영방식이다.
	// add(), element(), remove()
	
	// --> 예외가 발생한다. (underflow, overflow)
	
	public static void main(String[] args) 
	{
		Queue<String> queue = new LinkedList<>();
		
		queue.add("a1");
		queue.add("a2");
		queue.add("a3");
		
		System.out.println(queue.size());	// 3
		
		System.out.println(queue.element());	// element(): 꺼내는 거는 아니고 다음에 무엇이 나올지 확인해봄
		
		System.out.println(queue.remove());		// remove(): 확인이 아니라 꺼내보자.
			System.out.println(queue.size());	// 2
	
			
		System.out.println(queue.remove());		
		System.out.println(queue.remove());		
		
		// System.out.println(queue.remove());		//	java.util.NoSuchElementException 예외 발생
		System.out.println(queue.poll());			// 예외 발생하지 않음.
		
		
		
		
		
	}

}
