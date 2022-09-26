import java.util.Scanner;


public class Day6 {

	public static void main(String[] args) {
		
//		for(int i = 0; i < 12; i++)
//		{
//			System.out.println(i  +" hello");	
//		}
//		
//		System.out.println("끝났어");
		
		/*
		 개발자 간의 for문의 가장 일반적인 형태
		 초기화는 int i = 0; 비교는 i < , 증감 연산자는 i++
		 이유: 두번째만 보면 바로 반복 횟수를 알 수 있기 때문
		 */
		
		
		
//		int tatal = 0;
//		int mutiply = 0;
//		for (int i = 0; i < 9; i++ )
//		{
//			mutiply = i + 1;
//			tatal = 3 * mutiply;
//			
//			System.out.println("3 x " + mutiply + " = " + tatal );
			
			
			
//		int kor = 30;
//		int eng = 40;
//		int math = 50;
//		
//		int eng = (kor+eng+math)/3;
////		int avg = (kor+eng+math)/3; O
//		
//		System.out.println("평균 = " + eng);
////		System.out.println("평균 = " + avg); O
		
		/*
		 딱 봐도 이상하다. 
		 데이터 타입을 할당할 때는 크기와 비트룰만 설정하는 것이 아니라 명칭이 추상화가 잘 되어야한다.
		 가독성이 좋아야 한다
		 */
			
			
		
		
//		int cnt = 1;
//		for ( int i = 0; i < 9; i++ )
//		{
//			System.out.println("3 x " + cnt + " = " + (3 * cnt) );
//			cnt = cnt + 1;
//		}
		
		/*
		 강사님이 짠 코드
		 ★★★
		 for문의 i 루프 카운터다. i로 루프 용도말고 쓰려고 하지를 마라.
		 새로운 변수를 만들어서 써라.
		 객체지향 SOLID 원칙 - SRP 단일 책임 원칙
		 */
			
		
		
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		// 콘솔로 값을 입력받을 수 있는 코드
//	
//		System.out.println("입력값 = " + value);
//		
//		int i = 0;
//		while( i < value )
//		{
//			System.out.println("Hello");
//			i++;
//		}
		
		/*
		 반복 횟수가 run-time에서 정해지는 반복문은 while문으로 쓰는 것이 좋다.
		 for문, while문은 단순히 코드만 다른 게 아니라 프로그래머가 읽을 때 의미론적으로 다르다.
		
		 for문은 compile-time에 반복횟수가 정해지는 코드를 짤 때
		 while문은 run-time에 반복횟수가 정해지는 코드를 짤 때
		 */
		 
		

//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		// 콘솔로 값을 입력받을 수 있는 코드
//	
//		System.out.println("입력값 = " + value);
//		
//		
//		int i = 1;
//		System.out.print(i);
//		while( i < value )
//		{   
//			i++;
//			System.out.print("+" + i);
//		}
		
		/*
		 <풀제 풀이>(문제를 잘못 이해함) <내가 짠 것>
		 <1+2+3+....+입력값> 출력 코드
		 코드를 짜는 건 중요하지 않다. 순서도 그리는 게 훨씬 가치있는 일이고, 연봉에 직결된다.
		 */

		
		
		
//		Scanner sc = new Scanner(System.in);
//		int value = sc.nextInt();
//		// 콘솔로 값을 입력받을 수 있는 코드
//	
//		System.out.println("입력값 = " + value);
//		
//		int i = 0;
//		int tatal = 0;
//		int number = 0;
//		
//		
//		while( i < value )
//		{
//			number =  number + 1 ;
//			tatal = tatal + number ;
//		
//			i++;
//		}
//		
//		System.out.println("합계: " + tatal);
		
		/*
		<문제 풀이> <내가 짠 것>
		1+2+3+...+입력값 = 합계 구하기 
		*/
	
		

		
//		for(int i = 0; i < 10; i++)
//		{
//			for(int j = 0; j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			
//		System.out.println("");
//		}
		/*
		 문제를 분해해서 
		 1. * 찍기 반복 
		 2. 줄넘김
		 으로 해석한 것까지는 좋았는데, 
		 제한 시간까지 변수를 따로 못 만든 게 좀 아쉽다.
		 */
		
		int theNumberOfStar = 0;
		
		for(int i = 0; i < 10; i++)
		{
			theNumberOfStar = theNumberOfStar + 1;
			
			for(int j = 0; j < theNumberOfStar; j++)
			{
				System.out.print("*");
			}
			
		System.out.println("");
		}
		
		/*
		 이전에 아쉬운 부분 수정
		 */
		
	}
	
}
