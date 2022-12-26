package day68_수b_InnerClass_Member클래스;

// Inner class : Non-static nested class
// 1. member inner class
// 2. local inner class
// 3. Anonymous inner class

class Outer
{
	private int num = 0;
	
	// member inner class	--> Outer객체를 만들어도 Member 객체는 만들어지지 않는다.
	class Member
	{
		void add(int n)
		{
			num += n;
		}
		int get()
		{
			return num;
		}
	}
	
}

public class Main_b {

	public static void main(String[] args) {

		Outer out1 = new Outer();
		Outer out2 = new Outer();
		
		// out1을 기반으로 인스턴스를 생성
		// Outer.Member out1mb = new Outer.Member();	// ▶ 오류 생긴다.
		// Member는 Outer에 속해 있기 때문에, Outer없이는 존재해서는 안 되기 때문이다.
		
								

		
		Outer.Member out1mb = out1. new Member();
		Outer.Member out2mb = out2. new Member();
								//	new(Member()); 	new를 new()함수라고 생각하면 이해하기 좋다.
								// 					연산자도 결국에는 문법이 달라서 그렇지 함수랑 다를 바 없는 거다.
		out1mb.add(1);			// 					new 연산 : 객체를 만들고, 시작점을 리턴해라.
		out1mb.add(6);
		System.out.println( out1mb.get() );
		
		
		
		
		
	}

}
