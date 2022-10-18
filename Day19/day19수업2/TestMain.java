package day19수업2;

public class TestMain {
	
	
	
	public static void EntireAttack(CombatUnit[] cus)
	{
		for(int i = 0; i < cus.length; i++)
		cus[i].Attack();
	}

	public static void main(String[] args) {
		
		
//		CombatUnit ex = new Fighter();
//		
//		System.out.println(ex.a); // 상위 클래스 소속 a 호출
//		ex.Attack();              // 하위 클래스 소속 함수 Attack() 호출
//		
//		/*
//		 메소드, 변수가 호출 메커니즘이 다름
//		 */
		
		
		CombatUnit [] cu = new CombatUnit[10];
		
		cu[0] = new Fighter(); 
		cu[1] = new Fighter(); 
		cu[2] = new Fighter(); 
		cu[3] = new Tank(); 
		cu[4] = new Tank(); 
		cu[5] = new Tank(); 
		cu[6] = new Fighter(); 
		cu[7] = new Footman(); 
		cu[8] = new Footman(); 
		cu[9] = new Fighter(); 
			
		EntireAttack(cu);
		
		/*
		 게임 제작하는 사람들은 다형성이 없으면 제작이 어렵다.
		 overriding이 없으면 유닛 가짓수가 늘 때마다 메소드를 overloading 하며 추가해줘야 한다.
		 overriding으로 짜면 함수를 여러개 제작할 필요가 없어 편하다.
		 */
		
//		Fighter[] fs = new Fighter[20];
//		Tank[] ts = new Tank[10];
//		Footman[] ms = new Footman[30];
//		
//		for(int i =0; i < fs.length; i++)
//			fs[i] = new Fighter();
//		
//		for(int i =0; i < ts.length; i++)
//			ts[i] = new Tank();
//		
//		for(int i =0; i < fs.length; i++)
//			ms[i] = new Footman();
//		
		
		
	

	}

}
