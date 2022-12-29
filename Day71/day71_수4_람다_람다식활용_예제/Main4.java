package day71_수4_람다_람다식활용_예제;


// 이너 클래스와 람다는 내부 메커니즘은 다르지만 
// 이너 클래스의 구조를 그대로 가져와서 람다를 만듬.
// --> 익명 이너 클래스에서 걷어내기만 하면 람다가 완성됨.

public class Main4 {

	
	// 람다식으로 파라미터를 받고
	public static void printHello(Printable prn)
	{
		prn.print("hello" );
	}

	
	
	public static void main(String[] args) {

		
		
		Printable prn2 = (s) -> { System.out.println(s); };
		prn2.print("hello");

		// 이런 식으로 함수 객체를 사용할 수 있다.
		printHello(prn2);
		printHello( (s) -> {System.out.println(s);} );
		
		// new를 딱 보는 순간 객체라는 것을 알 수 있는 것처럼
		// ->를 딱 보는 순간 함수 객체라는 것을 떠올릴 수 있어야 한다. 
		
		// ★ .이 연산자 듯 ->도 연산자다.
		// 함수 객체 = 함수를 하나만 가지는 객체
		
	}
	
}




interface Printable
{
	public void print(String s);
	
	// 두 개 이상 메소드를 넣으면 생기는 오류
	// The target type of this expression must be a functional interface
}