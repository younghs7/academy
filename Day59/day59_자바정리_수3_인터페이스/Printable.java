package day59_자바정리_수3_인터페이스;

public interface Printable { // 내부적으로는 클래스와 같으나 인터페이스 규약을 담기 위한 새로운 데이터 타입이다. 

	static String OS_VERSION = "10.5.4"; //int a = 0 는 안 되지만 전역변수는 된다. 인터페이스에 이렇게 전역변수를 넣기도 한다.
	
	public boolean init();    		// 초기화는 이 원형을 무조건 지켜라.
	public void print(String doc);	// 인쇄를 하려면 이 원형을 무조건 지켜라. 
									// --> 실무적으로는 그냥 이 요소 하나하나를 인터페이스라고 부르기도 한다.
	
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	


	
}
