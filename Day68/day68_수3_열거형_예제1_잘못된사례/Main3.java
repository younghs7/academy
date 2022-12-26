package day68_수3_열거형_예제1_잘못된사례;

interface DAYS
{
//	public static int SUNDAY = 0; 생략해서 아래와 같이 쓸 수 있다.
//	이유: 인터페이스는 static만 되고, public이 기본이기 때문
	
	int SUNDAY = 0;		// 일
	int MONDAY = 1;		// 월
	int TUESDAY = 2;	// 화
	int WEDNESDAY = 3;	// 수
	int THURSDAY = 4;	// 목
	int FRIDAY = 5; 	// 금
	int SATUERDAY = 6;	// 토

	// 문제점1. 인터페이스의 오용 - 인터페이스의 원래 용도와 동떨어진 사용
	// 문제점2. 변수값의 범위에 대해 제한을 둘 수 없다. (day는 7개의 값 이외에 다른값이 들어갈 수 있음) 
	// 문제점3. 실제값은 정수이기 때문에 다른 값과 겹치는 경우 이를 오류로 판단할 수 없음
	
}





interface SCALE
{
	int DO = 0;
	int RE = 1;
	int MI = 2;
	int FA = 3;
	int SO = 4;
	int RA = 5;
	int TI = 6;

}






public class Main3 {

	public static void main(String[] args) {

		printDay(DAYS.TUESDAY);	
		printDay(SCALE.MI);			// 오류가 생기지 않는다.
		
		
	}
	
	public static void printDay(int days)
	{

		switch(days)
		{
			case DAYS.SUNDAY: 
				System.out.println("오늘은 일요일");
				break;
				
			case DAYS.MONDAY: 
				System.out.println("오늘은 월요일");
				break;
				
			case DAYS.TUESDAY: 
				System.out.println("오늘은 화요일");
				break;
				
			case DAYS.WEDNESDAY: 
				System.out.println("오늘은 수요일");
				break;
				
			case DAYS.THURSDAY: 
				System.out.println("오늘은 목요일");
				break;
			
			case DAYS.FRIDAY: 
				System.out.println("오늘은 목요일");
				break;
				
			case DAYS.SATUERDAY: 
				System.out.println("오늘은 목요일");
				break;
				
		}	
	}
}





