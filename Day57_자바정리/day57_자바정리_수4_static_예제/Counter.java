package day57_자바정리_수4_static_예제;

public class Counter {
	
	
	private static int count;    //  public으로 둔다는 것은 아무나 접근해도 상관없다는 것은 물론이고,
								 //  변수를 막 접근해서 수정해도 된다는 것이다. 
								 //  static도 마찬가지로 private으로 막아서 getter, setter를 설정할 수 있다.
								  
	
	static {
		count = 1;
		System.out.println("static 호출!");   // 제일 먼저 호출된다.
	}
	
	
	// 고급지게 만들면 이렇게 만들 수 있다. 
	private static void plusCount()   
	{
		Counter.count = Counter.count + 1;   // 안해도 되지만 명시적으로 Counter를 붙여주는 것이 좋다.
	}
	
	
	Counter()
	{
		 Counter.plusCount();
	}
	
	
	
	public static int getCount()
	{
		return Counter.count;
	}
	
	//setter는 필요하지 않다. 아니 setter가 있으면 안 된다.
	
	
}
