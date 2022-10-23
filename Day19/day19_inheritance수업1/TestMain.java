package day19_inheritance수업1;

public class TestMain {
	
	
	public static void main(String[] args)
	{
		
// -----둘 다 SmartTV(하위) 클래스 소속 Show()가 호출된다.	
//		TV tv = new SmartTV("198,168.0.2", 11);
//		tv.Show();
//		
//		SmartTV stv = (SmartTV) tv;
//		stv.Show();
		
		 
		
		
//	----클래스 데이터 타입이 참조범위를 의미한다고 생각하면 이해가 쉽다. -----
//		
//		//부모클래스의 참조변수로 자식클래스를 접근
//		TV tv = new SmartTV();	
//		
//		//에러!! 자식클래스의 참조변수로 부모클래스를 접근 X
//		SmartTV stv = (SmartTV) new TV();
		
		
		
//------에러 생기네. java.lang.ClassCastException ------
//		SmartTV stv =  (SmartTV) new TV();
//		System.out.println(stv.ipAddress);
		 
		
		
//	----상위 객체 데이터타입 참조변수로는 
//		하위객체에만 존재하는(메소드,데이터)는 접근이 불가능하다 ---------
//		SmartTV stv = new SmartTV("111.1221.33", 11);
//		TV tv;
//		tv = stv;
//		
//		System.out.println(stv.channel);
//		System.out.println(stv.channelName);
//		System.out.println(stv.ipAddress);
//		stv.Browsing();
//		
//		System.out.println(tv.channel);
//		System.out.println(tv.channelName);
//		System.out.println(tv.ipAddress);
//		tv.Browsing();

	

		
//  -----자식 객체를 heap에 올리면 
//		 (자식, 부모 클래스 데이터 타입)에 모두 참조값 대입 가능. ------	
//		TV tv;
//		TV tv2;
//		SmartTV stv;
//		SmartTV stv2;
//	
//		tv = new TV();
//		stv = new SmartTV();
//		
//		stv2 = tv; // 코드 실행 안됨.(heap 상위객체 메모리만 되어 있기 때문)
//		tv2 = stv;
		
////////////////////////////////////////
//		TV tv = new SmartTV();
//		1.--이걸 해석하면-------------
//		SmartTV 임시변수 = new SmartTV();
//		TV tv = 임시변수;
//		2.--이걸 해석하면-
//		TV tv;
//		tv = 임시변수;
//	 	1. 2.번 모두 정상적으로 작동하는 코드
		

		
		
//		
//		SmartTV stv = new SmartTV("192.168.0.2", 11);
//		TV tv = stv;
//		SmartTV ss;
//		ss = (SmartTV) tv;
//		
//		tv.changeChannle(4);
//		ss.Browsing();
//		
//		System.out.println(ss.ipAddress);
	
		
		
		
	}
}
