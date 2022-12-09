package day57_자바정리_수4_static_예제;





public class Main {

	public static void main(String[] args) {
														// 그러나 아무것도 없는 상태에서는 static {} 호출 안 됨. 
										
		System.out.println(Counter.getCount());			// 한번만 static {} 이 호출된다.  --> 객체 생성이 트리거가 아니라 static 변수 접근할 때 트리거가 되나 보다.
														
//		Counter c = new Counter();          		    
//		Counter c1 = new Counter();
//		Counter c2 = new Counter();
		
		

	}

}
