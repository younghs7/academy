package day60_수4_JAVA_제네릭_필요성_예제1;

// 제네릭을 쓰지 않을 경우에는 AppleBox, OrangeBox 등등. 새로운 것을 추가할 때마다 Box를 추가해주어야 된다는 것이 핵심
// 딱히 코드를 볼 필요는 없다.

class Apple
{
	public String toString()	// system.out.println(참조값)을 찍으면 toString 내용이 출력된다.
	{
		return "apple";
	}
}

// 사과를 담을 수 있는 (사과 객체를 포함하는) 사과 박스 클래스
class AppleBox
{
	private Apple apple;
	
	
	
	public void setApple(Apple apple)
	{
		this.apple = apple;
	}
	
	public Apple getApple()
	{
		return apple;
	}
	
}

//오렌지를 담을 수 있는 (오렌지 객체를 포함하는) 오렌지 박스 클래스
class OrangeBox
{
	private Orange orange;
	
	
	
	public void setOrange(Orange orange)
	{
		this.orange = orange;
	}
	
	public Orange getOrange()
	{
		return orange;
	}
	
}

class Orange
{
	public String toString()	// system.out.println(참조값)을 찍으면 toString 내용이 출력된다.
	{
		return "Orange";
	}
}



public class Main4 {
	
	public static void main(String args[])
	{
		
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.setApple(new Apple());
		oBox.setOrange(new Orange());
		
		Apple app = aBox.getApple();
		Orange org = oBox.getOrange();
		
		System.out.println(app);
		System.out.println(org);
	
	
	
	
	}
}
