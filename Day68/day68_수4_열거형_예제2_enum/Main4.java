package day68_수4_열거형_예제2_enum;

// enum : enumeration 열거형 데이터타입
// 열거형 데이터타입은 데이터의 범위를 열거시킨 데이터로 한정시키는 데이터타입
// (열거형은 열거시킨 데이터로 데이터를 한정시키는 데이터 타입)

enum DAYS 
{
	SUNDAY,		// 일
	MONDAY,		// 월
	TUESDAY,	// 화
	WEDNESDAY,	// 수
	THURSDAY,	// 목
	FRIDAY, 	// 금
	SATUERDAY	// 토

}

enum DAYS1
{
	SUNDAY,		// 일
	MONDAY,		// 월
	TUESDAY,	// 화
	WEDNESDAY,	// 수
	THURSDAY,	// 목
	FRIDAY, 	// 금
	SATUERDAY	// 토

}


public class Main4 {

	public static void main(String[] args)
	{
		DAYS d = DAYS.FRIDAY;
		printDay(d);
		
		DAYS1 d2 = DAYS1.FRIDAY;
//		printDay(d2); 	// ◀ 오류 생긴다. 둘다 FRIDAY이지만, DAYS1과 DAYS는 서로다른 데이터타입이기 때문
		
	}
	
	public static void printDay(DAYS d)
	{

		switch(d)
		{
			case SUNDAY: 
				System.out.println("오늘은 일요일");
				break;
				
			case MONDAY: 
				System.out.println("오늘은 월요일");
				break;
				
			case TUESDAY: 
				System.out.println("오늘은 화요일");
				break;
				
			case WEDNESDAY: 
				System.out.println("오늘은 수요일");
				break;
				
			case THURSDAY: 
				System.out.println("오늘은 목요일");
				break;
			
			case FRIDAY: 
				System.out.println("오늘은 목요일");
				break;
				
			case SATUERDAY: 
				System.out.println("오늘은 목요일");
				break;
				
		}	
	}
}
