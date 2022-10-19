package day20시험;

public class 손영호_testmain {

	public static void main(String[] args) {
		
		
//		2.Queue 객체생성
		손영호_queue qu = new 손영호_queue(5);
		
//		3.enqueue() 호출
		
		boolean tf;
		tf = qu.enqueue(1);
		tf = qu.enqueue(2);
		tf = qu.enqueue(3);
		tf = qu.enqueue(4);
		tf = qu.enqueue(5);
		
		
//		4.dequeue() 호출
		tf = qu.dequeue();
		tf = qu.dequeue();
		tf = qu.dequeue();
		
		tf = qu.enqueue(6);
		tf = qu.enqueue(7);
		tf = qu.enqueue(8);
		tf = qu.enqueue(9);
		tf = qu.enqueue(10);
		
		tf = qu.dequeue();
		tf = qu.dequeue();
		
		tf = qu.enqueue(11);
		tf = qu.enqueue(12);

//		5.printQueue() 호출
		qu.printQueue();

		

	}

}
