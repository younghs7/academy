package day21_inheritance수업1;

public class Main {

	public static void main(String[] args) {
		
	int val = (int)(Math.random() * 2);
	
	Tire myTire;
	if (val == 0)
	{
		//한국타이어를 선택
		myTire = new HankookTire(null, val);
	}
	else
	{
		// 금호타이어를 선택
		myTire = new kumhoTire(null, val);
	}

	
//	  써도 되고 안 써도 되는 기술는 만들지 않는다. 
//	--상속을 배우는 것은 단순히 상위 클래스에 하위 객체를 담는 게 주가 아니라-----------------------
//	다형성을 쓰는 게 주다.
//	상속을 써서 override을 쓰면 코드 자체가 간결해진다.
	myTire.goodFunction();
	
	}
}
