package day21_inheritance수업1;

public class kumhoTire extends Tire{
	
	
	
//	------------------------------------
	
	public kumhoTire(String location, int maxRotation) 
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
			System.out.println(location + "KumhoTire 수명: " + (maxRotation-accumulatedRotation) + "회");
			return true;
		}
		else
		{
			System.out.println("***" + location + "KumhoTire 펑크 ***");
			return false;
		}
		
	}
	
	
	
//	-강사님 새로 추가------------------------
	
	void K()
	{
		System.out.println("K");
	}
	
	@Override
	public void goodFunction()
	{
		K();
	}
	

}
