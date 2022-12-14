package day60_test_toString;


class Test 
{
	public int a;

	public Test() {
		a = 1;
	}
	
	
}

public class Main_test {
	
	public static void main(String[] args)
	{
		Test t = new Test();
		
		System.out.println(t.toString());
		
		String s1 = new String("test1");
		
		System.out.println(s1.toString());		// test1
		System.out.println(s1);					// test1
		
		
		String s2 = new String("test2");
		
		System.out.println(s2.toString());		// test2
		System.out.println(s2);					// test2
		
		if(s1 == s2)
		{
			System.out.println("같아요");
		}
		else
		{
			System.out.println("달라요");
		}
		
		
		
		
		// 깨달음: 
		
		// 일반적인 다른 클래스도 toString을 오버라이딩하면 참조값이 아닌 오버라이딩한 toString에 정의되어 있는 값이 뜬다.
		
		// 즉, String 클래스도 마찬가지로 toString이 오버라이딩 되어 있다. 
		// 그래서 참조값을 호출하면 println 에서 참조값이 아닌 문자열이 호출되었던 것이다.
		
		// 그런데, toString은 print 전용인 듯? 하다.
		// println() 내부에 들어온 값이 참조값이면 toString을 호출하게끔 되어 있는 것이 아닐까하고 추측한다.
		
		
		
	}
	
	
}
