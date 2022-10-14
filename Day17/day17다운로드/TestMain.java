package day17다운로드;

public class TestMain {
	
	
	/*
	 메세지로 확인을 하는 게 아니라 메인단에서 리턴 받아서 결과 보네.
	 */
	
	public static void main(String[] args) {
		
		Queue que1 = new Queue(5);
		
		boolean bResult;
		int data;
		
		bResult = que1.enqueue(11);
		bResult = que1.enqueue(22);
		bResult = que1.enqueue(33);
		
		data = que1.dequeue(); //11
		data = que1.dequeue(); //22
		
		bResult = que1.enqueue(44); 
		bResult = que1.enqueue(55);
		bResult = que1.enqueue(66);
		bResult = que1.enqueue(77);
		
		data = que1.dequeue(); ///33
		data = que1.dequeue(); //44
		
		bResult = que1.enqueue(77);
		bResult = que1.enqueue(77);
		bResult = que1.enqueue(77);
		
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		data = que1.dequeue();
		
		
	
		
		que1.print();
		
		
//		Queue que2 = new Queue(5);
//		
//		que2.init(5);
//		
//		//init는 queue를 초기화하는 함수
//		que1.init(5);
//		
//		que1.enqueue(10);
//		que1.enqueue(22);
//		
////		int data = que1.dequeue(); //11
//		
//		System.out.println();
//		
		
	}
	


}
