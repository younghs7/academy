package day59_자바정리_수3_인터페이스;

public interface ColorPrintable extends Printable{
	
	// 인터페이스 상속을 쓰는 경우는 언제일까?
	// ▼
	// 나중에 새로운 기능이 생겼다고 가정해보자.
	// public void colorPrint(); 을 기존 Printable에 추가하면, 이 인터페이스를 implements 하는 클래스들은 전부 뻑이 난다.
	// 그래서 인터페이스를 새로 구현해야되는데, 그러한 경우에 인터페이스를 상속하여 사용할 수 있다.
	
	// 그러나 일반 개발자는 거의 쓰지 않는다.  
	
	// 거대한 라이브러리나 프레임워크를 만들 때와 같이 
	// 전체적인 구조를 설계하고나서 코딩해야되는 경우에는 쓴다.

	void printColor(String doc);
	
	
	
}
