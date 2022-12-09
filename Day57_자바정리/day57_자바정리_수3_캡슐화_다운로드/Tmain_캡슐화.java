package day57_자바정리_수3_캡슐화_다운로드;

class SinivalCap
{
	void take()	
	{
		System.out.println("콧물이 안나게 됩니다.");
		
	}
	
}

class SneezeCap 
{
	void take()
	{	
		System.out.println("재체기를 멈추게 됩니다.");
	}
}

class SnuffleCap
{
	void take()
	{
		System.out.println("코가 뚤리게 됩니다.");
	}
	
}



class SinusCap
{
	SinivalCap 	siCap;
	SneezeCap	snCap;
	SnuffleCap	suCap;
	
	SinusCap()
	{
		siCap = new SinivalCap();
		snCap = new SneezeCap();
		suCap = new SnuffleCap();
		
	}
	
	
	void take(int age)
	{
		if (age < 20)
		{
			siCap.take();
		}
		else
		{
			snCap.take();
		}
	}

}




class ColdPatient
{
	public int age;
	
	// 콧물용 알약을 먹는다.
	void takeSinusCap(SinusCap cap)
	{
		cap.take(age);
		
	}
	
}

class Tmain {	
	
	public static void main(String[] args) 
	{
		ColdPatient suf = new ColdPatient();
		suf.age = 20;
		
		suf.takeSinusCap(new SinusCap());
		
		


	}
}
