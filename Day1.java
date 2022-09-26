
public class Day1 {

	public static void main(String[] args) {
		// 결과 함수이름 원인
		short value = 0x100;
		System.out.println(value);
		
		value = 200;
		System.out.println(value);
		
		System.out.println("value값은" + value);
		
		boolean soju = true;
		boolean soonde = false;
		boolean happy;
		boolean happy1;
		
		happy = soju && soonde;
		happy1 = soju || soonde;
		
		System.out.println(happy);
		System.out.println(happy1);
		
//		int a = 10000000;
//		short k = (short)a;
		
//		float a = 12.34f;
//		int k = (int)a;
		
//		char a = 65;
//		char b = 0x41;
//		
		char a = 0x1141;
		
		System.out.println(a);
		
		

// 3가지 부분
// class 안에는 데이터와 명렁어(로직) 2개만 있다.
// class = data + 함수
		

	}

}
