package day70_수3_NestedClass_Member클래스_사용용도_문제;

// 문제
// 컴퓨터에 사운드카드가 있다.
// 사운드카드에는 문자열을 읽는 기능 (문자열 넣어주면 콘솔화면에 출력)

// 컴퓨터, 사운드카드 이것을 클래스로 구현하는 코딩을 만들어보세요.



public class Main3 {

	public static void main(String[] args) {

		Computer com = new Computer("String 문자열");
		Readable r = com.getSoundCard();
		r.PrintString();
		
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
		return new SBSoundCardX();
	}
	
	// SoundCard에서-> SBSouncardX로 클래스를 바꿔도 main() 쪽에서 수정할 필요가 없다!
	// --> 만약 백엔드를 바꿨는데 프론트엔드 전체를 다 바꿔야한다고 말하면 말이 안된다.
	// 약 결합 시스템(Loosely Coupled System) 
	// 현대에서는 통신을 할 때, 내가 바뀌어도 상대방을 안 바뀌게 하는 게 첫번째 덕목이다.
	
	// iterator가 그 예이다.
	// Iterator<String> iter = list.iterator();	
	// Iterator<String> iter = set.iterator();	
	// ▲ 모양이 같다. Iterator는 인터페이스로 받아서 다 쓰기 때문. 
	// Iterator도 내부적으로는 아래와 같은 메커니즘으로 이루어져 있다.
	private class SBSoundCardX	implements Readable
	{
		@Override
		public void PrintString() {
			System.out.println(str);
		}
	}
}

