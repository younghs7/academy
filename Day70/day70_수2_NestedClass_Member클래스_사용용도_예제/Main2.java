package day70_수2_NestedClass_Member클래스_사용용도_예제;

public class Main2 {

	public static void main(String[] args) {

		OfficeMachine om = new OfficeMachine("견적서 서류");
		
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
		return new Printer();	
	}
	
	// Member inner Class
	// Printer를 감추겠다라는 의도가 있기 때문에 이를 inner클래스로 만들었다.
	private class Printer implements Printable	
	{
		@Override
		public void print() {
			System.out.println(doc);
		}
	}
}






