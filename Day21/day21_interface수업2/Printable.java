package day21_interface수업2;

// 인터페이스의 특징
// 1. 구현부가 존재하지 않는다. == 규약만을 제공한다.
// 2. 인터페이스는 모두 public이다. (생략할 시 class default와 달리)
// 3. 상속과 동일한 메카니즘 (내부적으로) 하지만 코딩은 extends(확장)가 아닌 implements(구현)라고 한다.
//    인터페이스는 "확장이 아닌 구현" 이다
 
public interface Printable {

//4. static은 선언 가능.
//	int a; 는 안된다. 
	static int a = 0; // 는 된다.
//	하지만, 인터페이스에서 전영영역 변수를 선언하지 않는다. 이점이 하나도 없으니까.
	public static String OS_VERSION = "WINDOW 10"; // 이렇게 정보를 놓는 경우는 있다.
	
	
	
	// 프린터 초기화 인터페이스
	boolean initPrinter();
	
	// 흑백 인쇄 인터페이스
	boolean printBlack(String doc);

}
