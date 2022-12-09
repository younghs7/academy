package day57_자바정리_수1_캡슐화_안좋은예;


//콧물 처지용 알약
class SinivalCap {
	
	
	// 콧물용 알약을 먹는다.
	void take()
	{
		System.out.println("콧물이 안나게 됩니다.");
		
	}
	
}


// 제체기용 알약
class SneezeCap {
	
	// 재체기용 알약을 먹는다.
	void take()
	{
		System.out.println("재체기가 안나게 됩니다.");
		
	}
	
}


//코막힘용 알약
class snuffleCap {
	
	// 코막힘용 알약을 먹는다.
	void take()
	{
		System.out.println("코막힘이 뚫리게 됩니다.");
		
	}
	
}

class ColdPatient 
{
	void takeSinivelCap(SinivalCap cap)
	{
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap)
	{
		cap.take();
	}
	void takesnuffleCap(snuffleCap cap)
	{
		cap.take();
	}
}





public class Main_수1 {

	public static void main(String[] args) {

		ColdPatient suf = new ColdPatient();
		
		suf.takeSneezeCap(new SneezeCap());

		suf.takeSinivelCap(new SinivalCap());
		
		suf.takesnuffleCap(new snuffleCap());
		
//		클래스를 따로따로 만들면 메인에서 조합해야 한다.
		
		
		
		
	}

}
