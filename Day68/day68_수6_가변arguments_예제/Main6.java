package day68_수6_가변arguments_예제;

public class Main6 {

	public static void printAll(String... vars)	// 오버로딩은 아니고 내부적으로는 배열이다.
	{											// 1. 함수를 각각 만드는 것이 아니라 파라미터로 전달된 녀석들을 배열로 만든다. 
												// 2. String[] vars 참조변수에 넣어서 파라미터로 쓴다.
												
		System.out.println("Length= " + vars.length);
		
		for(String s: vars)
		{
			System.out.println(s);
		}
	}
	// 일반 개발자는 (...)가변파라미터를 거의 써서 메소드를 만들지 않는다. 
	// 하지만 이렇게 작성되어 있는 것은 많이 사용하게 된다.
	
	
	
	public static void main(String[] args) {
	
		printAll("A");
		printAll("A","B");
		printAll("A","B","C");
		
		
		
		System.out.println("문제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 문제 
		// n개의 숫자를 입력받아 더해주는 함수를 만들어보세요.
		
		int result;
		result = add(1, 2);
		System.out.println(result);
		System.out.println(add(2, 3, 4));
		
		int[] test = new int[] {1, 2, 3, 4, 5};
		int[][] test2 = new int[][] { {1, 1}, {2, 2} , {3, 3, 3} } ;
		
		System.out.println(add(test) );		// 배열 자체를 넣어도 된다!
//		System.out.println(add(test2) );	// 2차 배열은 오류나네.
		
		Integer i = new Integer(1);
		Integer i2 = 1;		// 묵시적 auto boxing
		int i3 = i2;		// 묵시적 auto unboxing 둘다 된다.
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
	}
	
	
	public static int add(int... numbers)
	{
		int total = 0;
		for(int i : numbers)
		{
			total = total + i;
		}
		
		return total;
	}

}
