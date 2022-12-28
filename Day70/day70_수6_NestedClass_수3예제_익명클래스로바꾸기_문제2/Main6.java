package day70_수6_NestedClass_수3예제_익명클래스로바꾸기_문제2;

public class Main6 {

	public static void main(String[] args) {
		
		Computer com = new Computer("String 문자열");
		
		// 인터페이스 참조형 = 클래스의 객체가 오는 것이 정상인데
		// 겉으로 보기에 어떻게 만들어졌냐면
		// 인터페이스 참조형 = 인터페이스의 객체로 보이게끔 코딩되었다. 
		Readable read = com.getSoundCard();
		
		read.PrintString();
		
		
//		주의사항
//		Soundable sound = new 인터페이스명() { ...... };
//		는 인터페이스를 객체화시킨 것이 아니라 (인터페이스명을 구현하는)익명클래스를 객체화 시킨 것이다.
		
		
	}

}


interface Readable 	// ◀ 이것만 보고, 사용자는 쓸 수 있다. SoundCard 내부를 볼 필요없이
{
	public void PrintString();
}


class Computer 
{
	private String str;
	
	public Computer(String str) {
		this.str = str;
	}
	
	public Readable getSoundCard()
	{
		return new Readable()
		{
			@Override
			public void PrintString() {
				System.out.println(str);
			}
		};
	}
	

	
}

