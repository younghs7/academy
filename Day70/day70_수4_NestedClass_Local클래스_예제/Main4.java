package day70_수4_NestedClass_Local클래스_예제;

public class Main4 {

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
		// Local class는
		// member class와 비교하여 기능적으로 바뀌는 게 없다.
		// 단순히 클래스 안에서 메소드 안으로 위치만 바뀜.
		class Printer implements Printable	 
		{
			@Override
			public void print() {
				System.out.println(doc);
			}
		}

			
		return new Printer();	
		
		
	}
	


}






