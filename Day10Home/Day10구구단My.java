package day10;


//MultiplicationTable - 구구단
public class Day10구구단My {

	public static void main(String[] args) {
		
		
		
		//T2
		//- 이중for문을 이용하여 2단부터 9단까지 출력하는 코드를 작성하시오.
		
		//0. 변수 설정
		int firstDan = 2; //몇단부터 시작할지
		int maxDan = 9; //몇단까지 실행할지
		
		//2. 1번 코드를 8번 반복
		for(int j = 0; j < maxDan-1; j++) {
			
			//1. dan단 x1~x9까지 출력하는 코드
			
			System.out.println(firstDan+"단을 실행하겠습니다.");
			
			int count = 1; 
			for(int i=0; i<9; i++) {
				System.out.println(firstDan+" x "+count+" = "+ (firstDan*count) );
				count = count + 1;
			}
			
			firstDan = firstDan + 1;
			
		}
		
		
		


		
		
		System.out.println("오류 발생 더미");
	}

}
