package day71_수6_람다_축약종류_예제;

public class Main6 {

	public static void main(String[] args) {
		
		Printable prn = null;
		prn = (String s) -> {System.out.println(s); };	// 가장 긴 타입의 람다식
		prn.print("Hello1");
		
		prn = (String s) -> System.out.println(s);		// 중괄호를 생략 (한줄인 경우)
		prn.print("Hello");
		
		prn = (s) -> System.out.println(s);				// 파라미터의 타입을 생략 (많이 사용함)
		prn.print("Hello");
		
		prn = s -> System.out.println(s);				// 파라미터의 소괄호를 생략 (파라미터가 1개인 경우)
		prn.print("Hello");
		
		
		
		
	
	}

}


interface Printable
{
	public void print(String s);
}

