package day71_수3_람다_수2에서_람다식으로바꾸기;


// 이너 클래스와 람다는 내부 메커니즘은 다르지만 
// 이너 클래스의 구조를 그대로 가져와서 람다를 만듬.
// --> 익명 이너 클래스에서 걷어내기만 하면 람다가 완성됨.

public class Main3 {

	public static void main(String[] args) {

		
		// 익명 클래스 코드
		Printable prn0 = new Printable()
		{
			@Override
			public void print(String s) 
			{
				System.out.println(s);
			}
		};
		
		
		// 익명 클래스(? 람다가 더 맞지 않나)를 구현한 전제는 1. 클래스 1개  2. 함수형 인터페이스 에만 쓸 수 있다.
		Printable prn1 = (String s) ->
		{
				System.out.println(s);
		};
		
		// 람다는 인터페이스 정보를 보고 타입추론 등을 이용해서 심플한 코드를 만들어내는 기법
		// (정보의 중복을 제거하는 기법)
		
		
		
		// 최종 람다식
		Printable prn2 = (s) -> { System.out.println(s); };
		
		// => 자바스크립트의 함수 객체와 동일하다. 
		
		
		prn2.print("hello");
	}

}


interface Printable
{
	public void print(String s);
	
	// 두 개 이상 메소드를 넣으면 생기는 오류
	// The target type of this expression must be a functional interface
}