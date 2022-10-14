package day17My;


public class Day16Queue_문제My {
		

	public static void main(String[] args) {
		
		//1. 배열 만들기
		int[] array = new int[7]; 
		
		//객체 생성
		CircleQueue qu = new CircleQueue(array);
		
		
		//2. inqueue = push 구현
		qu.enqueue(1);
		qu.enqueue(2);
		qu.enqueue(3);
		qu.enqueue(4);
		qu.enqueue(5);
		qu.enqueue(6);
		qu.enqueue(7);
	
		
		//3. dequeue = pop 구현
		qu.dequeue();
		qu.dequeue();


		
	
//		dequeue 실행하고 pop한 데이터 출력
		System.out.println(qu.dequeue());
		
		
		//4. 현재 queue 상태 프린트
		qu.printQueue();
	}

	
	
}
