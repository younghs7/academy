package day19_inheritance개인과제;


public class TestMain {

	public static void main(String[] args) {
		
			
		
//	CombatUnit [] cu = new CombatUnit[10];
//		
//		cu[0] = new Fighter(); 
//		cu[1] = new Fighter(); 
//		cu[2] = new Fighter(); 
//		cu[3] = new Tank(); 
//		cu[4] = new Tank(); 
//		cu[5] = new Tank(); 
//		cu[6] = new Fighter(); 
//		cu[7] = new Footman(); 
//		cu[8] = new Footman(); 
//		cu[9] = new Fighter(); 
//		
		/*
		 * 	상속을 안 쓰니까. 이렇게 안 되네 
		 */
	
		
//		유닛 생산
		Fighter fi1 = new Fighter();
		Fighter fi2 = new Fighter();
		
		Footman fo1 = new Footman();
		Footman fo2 = new Footman();
		
		Tank ta1 = new Tank();
		Tank ta2 = new Tank();
		
		SCV sc1 = new SCV();
		SCV sc2 = new SCV();
		
		
		
		Fighter[] fighters = {fi1, fi2};
		
		Footman[] footmans = {fo1, fo2};
		
		Tank[] tanks = {ta1, ta2};
		
		SCV[] scvs = {sc1, sc2};
		
//		Fighter[] fi = new Fighter[1];
//		fi[0] = new Fighter();
//		Footman[] fo = new Footman[1];
//		fo[0] = new Footman();
//		Tank[] ta = new Tank[1];
//		ta[0] = new Tank();
//		SCV[] scvs = new SCV[1];
//		scvs[0] = new SCV();
		

//		1번 부대 생성
		CombatUnit cu1 =  new CombatUnit();
		
//		1번 부대 등록	
		cu1.setCombatUnit(fighters, footmans, tanks, scvs);
		
//		1번 부대 공격
		cu1.EntireAttack();
		
		
		
		
		
	
	

	}

}
