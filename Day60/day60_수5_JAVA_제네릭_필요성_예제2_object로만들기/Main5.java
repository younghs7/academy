package day60_수5_JAVA_제네릭_필요성_예제2_object로만들기;

// 1. 비슷한 기능(거의 99% 같은 기능)을 가진  클래스를 여러개 만드는 것을 싫어 합니다.
//			- 예) OrangeBox, AppleBox  
//
// 2. 이렇게 여러개를 만드는 원인은 (범인은) 자료형 때문입니다.
// 3. 그래서 그 자료형을 Object형으로 만들었더니 박스를 여러개 만들 필요가 없어졌습니다.
//
// => 일반화(제네릭)를 통해서 재활용이 가능해짐.

// Object형을 통한 일반화 처리는 크게 두가지 단점을 발생기킴
//		단점 1: 명시적 형변환 - 개발자의 책임 즉, 인간의 판단으로 형 변환 (이것은 잘못될 가능성을 내포)
//		단점 2: 런타임에서의 에러. - 실행 중에 에러 또는 예외가 발생하기 때문에 사전조치가 어렵다.
//							  - 컴파일 타임에 문제가 생겼다면 사전조치가 가능했겠으나 런타임에 문제가 생긴다는 것은 사전에 조치가 불가능을 의미.

// ▼ 자료형만 다르고 나머지는 다 같은 경우
// 해결: OrangeBox, AppleBox ---> Box (일반화)
// 제네릭을 번역하면 일반적인, 포괄적인 이다.


class Box
{
	private Object obj;
	
	public void set(Object obj)
	{
		this.obj = obj;
	}
	
	public Object get()
	{
		return obj;
	}
	
}

class Apple
{
	public String toString()	// system.out.println(참조값)을 찍으면 toString 내용이 출력된다.
	{
		return "I'm apple";
	}
}


class Orange
{
	public String toString()	// system.out.println(참조값)을 찍으면 toString 내용이 출력된다.
	{
		return "I'm Orange";
	}
}



public class Main5 {
	
	public static void main(String args[])
	{
		
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple app = (Apple)aBox.get();
		Orange org = (Orange)oBox.get();
		
		System.out.println(app);
		System.out.println(org);
	
	
	
	
	}
}
