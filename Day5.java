
public class Day5 {

	public static void main(String[] args) {
		
		
//		int result = 0;
//		// 자바는 타입만 정하는 걸 싫어한다.
//		
//		
//		//4+10+20
//		result = 4 + 10 + 20;
//		result = result + 20;
//		
//		System.out.println(result);

		
		
//		int a = 10;
//		int b = 20;
//	
//     	boolean result = a + b < 40;
		
		/*
		가독성이 엉망
		연산자 우선순위는 하나도 안 중요하고 가독성이 중요하다.
		연산자 우선순위를 알 필요가 없게 코드를 짜야한다.
		 */
		
		
	
		
     	
		

//		boolean result = (a + b) < 40;
//		
//		System.out.println(result);
     	
		/*
		100*2/3%5 -> (100*2) / (3%5) 으로 바꿔줘야한다.
		
		lex, yacc같은 거로 컴파일할 때나 연산자 우선순위가 필요하지만 지금은 필요하지 않다.
		최근에는 개발자 인권비때문에 가독성을 강조한다. I/O 를 최대한 뽑아내야기 때문 
		 */
     	

		
//		float a = 5/3; //1.0
//		float b = 5.0f/3.0f; //1.6666666
//		float c = 5/3.0f;    //1.6666666
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		/*
		 a - 정수타입끼리 나누면 결과도 정수타입으로 생각하므로 소수점 자리 데이터를 버리고 1.0으로 변환되어서 나온다.
		 b - 실수타입끼리 나누면 결과도 5/3 의 근사치로 나온다
		 c - 정수, 실수 타입 혼합은 정수 타입을 실수타입으로 변환 후에 연산하기 때문에 5/3 근사치로 나온다.
		 */
		
		
		
		
//		int a = 0;
//		a = 1 % 5;
//		System.out.println(a);
//		a = 2 % 5;
//		System.out.println(a);
//		a = 3 % 5;
//		System.out.println(a);
//		a = 4 % 5;
//		System.out.println(a);
//		a = 5 % 5;
//		System.out.println(a);
//		a = 6 % 5;
//		System.out.println(a);
//		a = 7 % 5;
//		System.out.println(a);
//		a = 8 % 5;
//		System.out.println(a);
//		a = 9 % 5;
//		System.out.println(a);
//		a = 10 % 5;
		
		/*
		  % (나머지 연산자)
		  특징
		 1. 양수로만 계산
		 2. 반복된다.
		 3. 결과값이 연산자 뒤에 숫자보다 작다.
		 */
		
		
		
//		int a = 10;
//		int b = a++; //  대입 후 a증가
//		
//		System.out.println(a); //11
//		System.out.println(b); //10
	
		/*
		a++;
		++a; // 대입에서만 의미가 있다.
		(++a)++; // c++은 되는데, 자바에서는 안 된다. 된다 하더라도 가독성이 안 좋아서 별로다.
		
		a++; //풀이
		a = a + 1;
		*/
		
//		int age = 19;
//		if (age <= 20) // 비교연산자 <, >, !=, ==, <=, >=
//		{
//			System.out.println("A백신 접종");
//		}
//		
//		else if ((age >= 21) && (age <= 50)) 
//		{
//			System.out.println("B백신 접종");
//		}
//		
//		else 
//		{
//			System.out.println("C백신 접종");
//		}
//		
//		System.out.println("프로그램 끝");
		
		/*
		 신박하게 짜는 것보다 지극히 상식적으로 가독성 좋게 짜야한다.
		 요즘에는 하드웨어 성능이 좋아져서 유지/보수에 드는 자원을 줄이는 게 훨씬 중요한 이슈가 된다.
		>, <를 쓰는 것보다는 >=, <= 쓰는 것이 좋다. 
		*/
		
//		int score = 100;
//		
//		if (score <= 20) {
//			System.out.println("F학점");
//		}
//		else if ( score <= 40) {
//			System.out.println("D학점");
//		}
//		else if ( score <= 60) {
//			System.out.println("C학점");
//		}
//		else if ( score <= 80) {
//			System.out.println("B학점");
//		}
//		else if ( score <= 99) {
//			System.out.println("A학점");
//		}
//		else if ( score == 100) {
//			System.out.println("A+학점");
//		}
		
		/*
		 내가 짠 것
		 */
		
		
//		int score = 100;
//		
//		if ( (score >= 0 ) && (score <= 20) ) {
//			System.out.println("F학점");
//		}
//		else if ( (score >= 21 ) && (score <= 40) ) {
//			System.out.println("D학점");
//		}
//		else if ( (score >= 41 ) && (score <= 60) ) {
//			System.out.println("C학점");
//		}
//		else if ( (score >= 61 ) && (score <= 80) ) {
//			System.out.println("B학점");
//		}
//		else if ( (score >= 81 ) && (score <= 100) ) 
//		{
//			if ((score <= 99)) 
//			{
//				System.out.println("A학점");
//			}
//			else if  ((score == 100))
//			{
//				System.out.println("A+학점");
//			}	
//		}
		
		/*
		 강사님이 짠 것
		 
		 나중에 어떻게 변경할지 모르니 문제 그대로 코딩해주는 게 좋다고 하신다.
		 그게 유지/보수가 편하다고
		 특히 처음 코딩할 때는 연습을 이렇게 해야한다고 하셨다.
		 1. 결과가 같더라도 문제를 잘 보고 그대로 코딩하기
		 2. 나중에 변경할 때를 생각하고 코딩하기
		 */

			
			
		int year = 1990;
		
		switch(year)
		{
		case 1980:
			System.out.println("1980년생이시네요.");
			System.out.println("축하합니다. 당첨!!");
			break;
		
		case 1990:
			System.out.println("1990년생이시네요.");
			System.out.println("축하합니다. 당첨!!");
			break;
		
		case 2000:
			System.out.println("2000년생이시네요.");
			System.out.println("축하합니다. 당첨!!");
			break;
		
		default :
			System.out.println("탈락");
		}
		
		/*
		 switch문을 쓰는 이유는 if문보다 가독성이 좋아서 쓰는 게 아니라
		 1. 그 보다 중요한 이유는 switch문을 보면 바로 코드 해석시 스팟성이라는 바로 인지할 수 있기 때문이라고 함.
		 2. 수정 용이성이 훨씬 switch문이 좋다고 함
		 if-switch문에서 문법은 1도 안 중요하고 이러한 부분이 핵심이라고 한다.
		 
		 switch문에서 break문은 switch에서 빠져나가기 위한 것이고 break문은 어떤 문법에서 빠져나오기 위한 문법이다.
		 */
		
			
		

			
		
		
		
	}

}
