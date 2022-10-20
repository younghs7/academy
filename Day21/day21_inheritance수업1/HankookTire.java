package day21_inheritance수업1;

public class HankookTire extends Tire{
	


	
//	------------------------------------
	
	public HankookTire(String location, int maxRotation) 
	{	
		super(location, maxRotation);
	}
	
	
//	------------------------------------
	
	@Override
	public boolean roll()
	{
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation)
		{
			System.out.println(location + "HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else
		{
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
		
	}
	
	
	
//	-강사님 새로 추가------------------------
	
	void H()
	{
		System.out.println("h");
	}
	
	
	@Override
	public void goodFunction()
	{
		H();
	}
	
	

}
