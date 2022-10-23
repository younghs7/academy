package day18_inheritance;

public class Weapon {
	
	public int damage;
	
	Weapon(int damage)
	{
		this.damage  = damage;
		
	}
	
	
	void Shoot()
	{
		System.out.println(damage+"dadada!!");
	}
	void Shoot(int damage)
	{
		System.out.println(damage+"dadada!!");
	}
	
	

}
