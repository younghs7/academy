package day19개인과제;

public class CombatUnit {
	
	Fighter[] fighters;
	Footman[] footmans;
	Tank[] tanks;
	SCV[] scvs;
	
	
	public void setCombatUnit(Fighter[] fighters, Footman[] footmans, Tank[] tanks, SCV[] scvs)
	{
		this.fighters = fighters;
		this.footmans = footmans;
		this.tanks = tanks;
		this.scvs = scvs;
	}
	
	
	public void EntireAttack()
	{
		for(int i = 0; i < fighters.length; i++)
		{
			this.fighters[i].Attack();
		}
		
		for(int i = 0; i < footmans.length; i++)
		{
			this.footmans[i].Attack();
		}
		
		for(int i = 0; i < tanks.length; i++)
		{
			this.tanks[i].Attack();
		}
		
		for(int i = 0; i < tanks.length; i++)
		{
			this.scvs[i].attack();
		}
			
			
	}
			
		
	
	
	// 상위 클래스의 Attack()은 파생 클래스'들'의 Attack()을 호출하기 위한 용도이다.  
	// println("컴뱃 유닛")은 실행되지 않는다.
	public void Attack()
	{
		System.out.println("컴벳유닛");
	}

	
	
}
