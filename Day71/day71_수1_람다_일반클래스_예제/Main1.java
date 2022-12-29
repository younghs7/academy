package day71_수1_람다_일반클래스_예제;

public class Main1 {

	public static void main(String[] args) {

		Printable prn = new Printer();
		prn.print("hello");
	
	
	}

}

// 일반적인 인터페이스와 이를 구현한 클래스
// 수2예제에서 익명클래스로 바꿈.

// 인터페이스에 메소드가 하나만 있는 경우 --> 함수형 인터페이스라고 표현
interface Printable
{
	public void print(String s);
}

class Printer implements Printable
{
	@Override
	public void print(String s) 
	{
		System.out.println(s);
	}
}
