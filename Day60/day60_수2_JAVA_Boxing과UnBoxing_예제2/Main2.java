package day60_수2_JAVA_Boxing과UnBoxing_예제2;


public class Main2 {

	public static void Increment(Integer nn) // <-- 여기까지는 참조값이 변하지 않는다.
	{
		// Wrapper class는 primitive에 쓰는 연산자를 모두 쓸 수 있다.
		
		nn = nn + 1;	// nn의 참조값이 변한다 : UnBoxing 했다가 연산이 끝나면 --> 다시 Boxing한다. 
		nn++;   		// nn의 참조값이 변한다 : 같은 이유
	
		System.out.println(nn instanceof Integer); // true --> nn은 Integer객체가 맞다.
		
		// 결론: Wrapper class는 원시 타입과 마찬가지로 연산자를 쓸 수 있으나!
		// 		연산을 할 때마다 UnBoxing, Boxing 과정을 거치며, 참조값이 변한다!
		
	}
	
	public static void main(String[] args)
	{
		int a = 10;
//		System.out.println(a instanceof Integer);   // ERR: Incompatible conditional operand types int and Integer
		
		Integer n = a;
		
		Increment(n);
		System.out.println(n);
		
	}
	
}
