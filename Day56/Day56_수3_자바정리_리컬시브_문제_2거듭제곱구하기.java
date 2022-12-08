

public class Day56_수3_자바정리_리컬시브_문제_2거듭제곱구하기 {


	
	
	public static void main(String[] args) {

		
//	문제 파라미터로 정수 n을 입력받아서 2의 n승을 구하는 함수를 만들어보세요.
//	단 재귀 호출 방식으로 구현해야 합니다.	
		
	int value = involution(5);	
	System.out.println(value);	
		

	}
	
	
//	설계: 2^n = 2 * 2^n-1 
	
	public static int involution (int n)
	{
		

		if(n == 1)
			return 2;
		
		return 2 * involution(n-1);
	}
}
	

// 이미지로 이해하는 게 편하다.
// involution(n-1) 자체를 코드로 변경시키고 사각형 박스로 이미지화한다음
// 다시 또 밑에 부분을 이미지화 시키면
// 마지막 호출부 까지 이미지화됨. 거기서부터 리턴값으로 박스를 치환시키면 이해하기 편하다.



// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ






	
	
	
