package day68_수8_람다식_선행예제;

public class Main8 {

//	람다식은 네스티드 클래스를 먼저 이해해야 제대로 이해할 수 있다.
	
	public static void main(String[] args) {

		// 람다식도 제네릭과 마찬가지로 객체지향에서 살짝 틀어진 내용이다.

		
		MyFuntionalInterface fi = () -> {
			System.out.println("a");
		};
		
		fi.method();
	}

}

interface MyFuntionalInterface
{
	public void method();
	
}


// 나중에 만들어진 프레임워크일수록 더 적은 코드량으로 같은 결과물을 구현할 수 있다.

