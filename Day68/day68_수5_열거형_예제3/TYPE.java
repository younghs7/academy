package day68_수5_열거형_예제3;

public enum TYPE {

	NORMAL,
	VIP;
	
	int t;			// 내부적으로는 클래스이기 때문에, 이렇게도 할 수 있지만 이렇게 안 쓴다.
	
	private TYPE()
	{
		System.out.println("TYPE constuctor");	// ▶ 2번 호출된다. 
												// 이너머레이션도 결국 내부적으로는 클래스이다.
		
		t = 1;		// 이렇게 초기화도 할 수 있지만, 실무적으로 쓸 일은 없다.
	}
	
}
