package day18_inheritance;

public class SCV  {
	
	/*
	 클래스 간 has a 관계는 
	 상속보다는 필드에서 객체 선언하고, 생성자에서 초기화해주는 방식으로 코드를 재활용한다.
	 */
	
	Weapon weapon;
	
	public SCV()
	{
		weapon = new Weapon(10);
	}
	
	void Shoot()
	{
		weapon.Shoot();
	}
	
	void upgradeWeapon(int value)
	{
		weapon.damage = weapon.damage + value;
	}
	
	
}
