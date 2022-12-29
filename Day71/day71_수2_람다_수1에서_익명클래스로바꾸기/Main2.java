package day71_수2_람다_수1에서_익명클래스로바꾸기;


//수1 예제를 익명클래스로 바꿈.

public class Main2 {

	public static void main(String[] args) {

		// 기존 Printer클래스를 로컬-이너 클래스로 바꾸고 이를 다시 익명 클래스로 바꾸었다.
		Printable prn = new Printable()
		{
			@Override
			public void print(String s) 
			{
				System.out.println(s);
			}
		};
		
		prn.print("hello");
	
	}
}

interface Printable
{
	public void print(String s);
}