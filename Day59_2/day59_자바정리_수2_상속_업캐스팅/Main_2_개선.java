package day59_자바정리_수2_상속_업캐스팅;


// 인맥관리 sw를 구현하고자 한다.
// 대학 동창 : 이름, 전공, 전화번호
// 직장 동료 : 이름, 부서, 전화번호
//​
// 인맥 즉 대학동창과 직장동료를 추가하고 출력하는 프로그램을 구현하시오.



// 대학 동창 클래스 : UnivFriend
// 직장 동료 클래스 : CompFriend

// 1. UnivFriend 또는 CompFriend 객체를 생성한다. (조건: 여러개 생성될 수 있다)

// 대학동창 : 이름, 전공, 전화번호 ==> System.out.println 등으로 출력.
// 직장동창 : 이름, 부서, 전화번호 ==> System.out.println 등으로 출력.

// 위와 같은 요구사항을 만족하는 코드를 작성. 단, 확장성 있게 작성.



public class Main_2_개선 {

	public static void main(String[] args) {

		
		UnivFriend[] univf = new UnivFriend[3];       // ---> 확장성이 없다
		CompFriend[] compf = new CompFriend[3];  	  // ---> 확장성이 없다.
		
		Friend[] f = new Friend[6];       // 확장성 있게 하려면 --> 상위 클래스 데이터타입으로 만들어야 한다.
		
		f[0] = new UnivFriend("산체스","010-1111-1111","경영");
		f[1] = new UnivFriend("로드리게스","010-2222-2222","스페인어");
		f[2] = new UnivFriend("후코","010-3333-3333", "페루어");
		 
		
		
		f[3] = new CompFriend("이재용","123-456-2133","인사과");
		f[4] = new CompFriend("이건희","123-456-2133","인사과");
		f[5] = new CompFriend("이건희2","123-456-2133","인사과");
		
		
		for(int i = 0; i < f.length; i++)
		{
			f[i].show();									   	// 메소드는 접근이 된다. (오버라이딩하면 메소드 테이블이 상위 객체에 생기기 때문)
		}
		
		System.out.println( ( (CompFriend)f[3] ).department ); 	// 필드는 형변환하지 않으면 접근이 안 된다.
		
		
		// 인터페이스도 데이터 타입이다. --> 규약을 표현하기 위한 데이터타입을 인터페이스라고 할 수 있다.
		
		
		
	}

}
