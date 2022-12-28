package day70_수5_NestedClass_Local클래스_슈거코드_익명클래스화;

public class Main5 {

	public static void main(String[] args) {

		OfficeMachine om = new OfficeMachine("제안서 서류");
		
		// 이 상황은 프린터클래스도 감춰진 상황 + 프린터 객체도 감춰진 상황.
		Printable prn = om.getPrinter();
		prn.print();
		
	}

}

interface Printable
{
	public void print();
}

class OfficeMachine
{
	private String doc;
	
	public OfficeMachine() {
		doc = null;
	}
	
	public OfficeMachine(String doc) {
		this.doc = doc;
	}
	
	public Printable getPrinter()
	{
		
		//Local class 슈거코드
		
//		 class 클래스명 implements 인터페이스명
//		 {
//				구현부
//		 }
//		▼ 
//		0. return 에 클래스 정의부를 넣고 싶다.
//		1. class 제거
//		2. 클래스명
//		3. implements 제거
//		▼
//		 슈거코드	▶ 	스토리: Member Class 
//		                  	--> Local Class 
//							--> return 안에 class 정의부를 넣고 싶다.
//							--> return 안에 넣어봤더니 굳이 클래스명과 implements가 필요없다
		
		return new Printable()	 // 클래스명과 implements가 생략되어 있다. --> new 생성자(); 와 형태가 같다.	
					{
						int a;
						
						public void print() {
							System.out.println(doc);
						}
					};
		
//		return new 인터페이스() {구현부}; 형태를 가진다.
	}
	
//	자바 8버젼부터 이런 코드가 가능해졌다.
	
// 	Member클래스 -> Local클래스 -> Anonymous클래스 과정을 거치면서 만들어진다.
//	결과물을 외우는 게 중요한 게 아니라 이 스토리를 아는 것이 이 예제의 목표이다.
	

}






