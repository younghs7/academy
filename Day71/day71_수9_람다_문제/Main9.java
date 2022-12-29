package day71_수9_람다_문제;

public class Main9 {

	// 1. 아래 함수를 완성하세요.
	public static <T> T calAndprint(Calculate<T> op , T n1, T n2)
	{
		T result = op.cal(n1, n2);
		System.out.println(result);
		
		return result;
	}
	
	public static void main(String[] args) {
		// 2. 4+5를 구하는 코드를 완성하세요. (람다식)
		Calculate<Integer> cal = (a, b) -> { return a + b ;};
		int result = calAndprint(cal, 4, 5);
		
		System.out.println(result);
	}

}

interface Calculate<T>
{
	T cal(T a, T b);
}


