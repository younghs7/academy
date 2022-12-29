package day71_수8_람다_리턴형있는경우_축약_예제;

public class Main8 {

	public static void main(String[] args) {

		Calculate<Integer> cal = (a, b) -> {	return a + b;	};	
		Calculate<Integer> cal2 = (a, b) ->  a + b;					// 이렇게 생략해줄 수도 있다.	{}만 생략할 수 없다
																	// return 도 같이 생략해주어야 함.
		
		System.out.println(cal.add(1, 2) );
	
	
	}
}

@FunctionalInterface
interface Calculate<T extends Number>
{
	T add(T t1, T t2);
}