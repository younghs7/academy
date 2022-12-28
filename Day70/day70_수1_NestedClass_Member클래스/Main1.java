package day70_수1_NestedClass_Member클래스;

public class Main1 {

	public static void main(String[] args) {

		Outer out1 = new Outer();
		
		Outer.MemberInner mem1 = out1.new MemberInner();
			
		new Outer();	// 	◀ 오류 생기지 않는다. 
		//	MemberInner();	//	◀ 오류 생긴다.	  Member Class는 혼자서 둥둥 떠있을 수 없기 때문이다.
		out1.new MemberInner();
		// ▲ 개념적인 것이다. 객체를 생성해야지만, Member Class를 만들 수 있게 해주겠다.
		
		// Outer의 객체를 전제로 하여  MemberInner객체를 생성할 수 있다.
		// 객체를 생성했으니 참조값이 리턴됨.
		Outer.MemberInner mem2 = out1.new MemberInner();	
		// ▲ 왜 이렇게 문법을 만들었을까 생각하면,
		// 이렇게 .을 표현하게끔 문법을 만들어야 이너클래스와 일반클래스를 구분하기 쉽긴 하다.
		
		Outer.MemberInner out1mem1 = out1.new MemberInner();
		Outer.MemberInner out1mem2 = out1.new MemberInner();
		// 여러개 만들 수 있다.
		
		out1mem1.add(3);

		System.out.println(out1mem1.get() );		// 3
		System.out.println(out1mem2.get() );		// 3	▶	member클래스 객체는 Outer 객체의 속성을 공유하기  때문
		
		
		
		// 네스티드 클래스 용도
		// 외부의 어떤 얘가 접근하는 게 싫어서 데이터타입 자체를 노출시키지 않기 위해서 쓴다. 
		// (클래스를 감추고 싶을 때)
		
		// 이런 경우가 별로 없을 것 같지만, 생각보다 많이 쓴다.
		
		// IT에서 숨긴다는 것은 이건 나만 쓸거야. 이런 의미가 아니다.
		// IT에서 숨긴다는 것은 쓰는 사람이 간단하게 쓸 수 있다는 의미로써 사용된다.
		// (사용자가 편하게 쓰기 위해서 네스티드를 쓴다)
		
		
		
	}

}


class Outer
{
	private int num = 0;
	
	class MemberInner	// Outer없이 MemberInner 객체를 만드는 것은 말이 안 된다.
	{
		void add(int a)
		{
			num += a;
			
		}
		int get()
		{
			return num;
		}
	}
	
}
