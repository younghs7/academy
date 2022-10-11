package day14수업enum;

import java.util.Calendar;

public class Test {
	
	public static void main(String[] args) {
			
		Calendar ca = Calendar.getInstance();
		
		int week = ca.get(Calendar.DAY_OF_WEEK);
	
		Week today = Week.SUNDAY;
		
	switch(week)
	{
	case 1:
		today = Week.SUNDAY;   break;
	case 2:
		today = Week.MONDAY;   break;
	case 3:
		today = Week.TUESDAY;   break;
	case 4:
		today = Week.WNDNESDAY;   break;
	case 5:
		today = Week.THURSDAY;   break;
	case 6:
		today = Week.FRIDAY;   break;
	case 7:
		today = Week.SATURDAY;   break;
		
	}
	
	System.out.println("오늘 :" +today);
	
	
	
	}
	
	
		

}
