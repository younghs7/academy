package day57_자바정리_수5_static_다운로드;


public class Counter {
	private static int count;
	
	static {
		count = 0;
	}
	
	public static int getCount()
	{
		return Counter.count;
		
	}
	
	private static void autoIncrement()
	{		
		Counter.count = Counter.count + 1;
	}
	
	
	Counter()
	{
		Counter.autoIncrement();
		
	}

}
