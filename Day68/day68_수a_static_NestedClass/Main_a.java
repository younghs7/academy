package day68_수a_static_NestedClass;

class Outer
{
	private static int num = 0;			//  ◀ private 이지만, 같은 소속이기 때문에 Nested1이 접근할 수 있다.
	
	// static Nested Class
	static class Nested1				// ◀ 는 Outer와 상관이 없지만, Outer의 소속이다.
	{									// Outer 객체를 만들어도 Nested1은 안 만들어진다
		int a;
		void add(int n)
		{
			num = num + n;
		}
		
	}
	
	static class Nested2				// static, protected, private, public 다 선언할 수 있다. (클래스 내부에 선언하는 경우는)
	{									// default만 안 됨. (근데 아무것도 안 쓰면 원래 기본 default다)
		int get()
		{
			return num;
		}
	}
	
}


class Test
{
	
}



public class Main_a {

	public static void main(String[] args) {

		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(3);
		
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
		
		
	}

}
