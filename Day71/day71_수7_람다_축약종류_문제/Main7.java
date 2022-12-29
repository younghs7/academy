package day71_수7_람다_축약종류_문제;


public class Main7 {

	public static void main(String[] args) {

		
		Addable add = null;
		// 가장 긴 타입의 람다식
		add = (int a, int b) -> {	System.out.println(a+b);	};
		add.printSum(1, 2);
		
		// 중괄호를 생략 (한줄인 경우)
		add = (int a, int b) -> 	System.out.println(a+b);
		add.printSum(3, 4);
		
		// 파라미터의 타입을 생략 (많이 사용함)
		add = (a, b) -> System.out.println(a+b);
		add.printSum(5, 6);
		
		
		
		
		
	}

}

@FunctionalInterface
interface Addable
{
	void printSum(int a, int b);
}