package day17풀이;

public class TestMain {
	
	
	
	public static void main(String[] args) {
		
		Queue que1 = new Queue(5);
		
		boolean bResult;
		int data;
		
		bResult = que1.enqueue(11);
		bResult = que1.enqueue(22);
		bResult = que1.enqueue(33);
		bResult = que1.enqueue(44);
		bResult = que1.enqueue(55);
		bResult = que1.enqueue(66);
		bResult = que1.enqueue(77);
		
		data = que1.dequeue(); //11
		data = que1.dequeue(); //22

		
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
