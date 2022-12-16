package day59_자바정리_수2_상속_업캐스팅;


// 인맥관리 sw를 구현하고자 한다.
// 대학 동창 : 이름, 전공, 전화번호
// 직장 동료 : 이름, 부서, 전화번호
//​
// 인맥 즉 대학동창과 직장동료를 추가하고 출력하는 프로그램을 구현하시오.





// 대학 동창 클래스 : UnivFriend
// 직장 동료 클래스 : CompFriend

public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. UnivFriend 또는 CompFriend 객체를 생성한다. (조건: 여러개 생성될 수 있다)
		
		// 대학동창 : 이름, 전공, 전화번호 ==> System.out.println 등으로 출력.
		// 직장동창 : 이름, 부서, 전화번호 ==> System.out.println 등으로 출력.
		
		// 위와 같은 요구사항을 만족하는 코드를 작성. 단, 확장성 있게 작성.
		
		UnivFriend[] univf = new UnivFriend[3];
		CompFriend[] compf = new CompFriend[2];
		
		univf[0] = new UnivFriend("산체스","010-1111-1111","경영");
		univf[1] = new UnivFriend("로드리게스","010-2222-2222","스페인어");
		univf[2] = new UnivFriend("후코","010-3333-3333", "페루어");
		 
		compf[0] = new CompFriend("이재용","123-456-2133","인사과");
		compf[1] = new CompFriend("이건희","123-456-2133","인사과");
		
		for(int i = 0; i < univf.length; i++)
		{
			univf[i].show();
		}
		
		for(int i = 0; i < compf.length; i++)
		{
			compf[i].show();
		}
		
		
		
	}

}
