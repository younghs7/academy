package day60_수6_JAVA_제네릭_필요성_예제3_T로만들기;

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


// 컴파일러야.. T라는 게 있는데 이건 "어떤 테이터타입"이란다. 그러니 이걸 "어떤 데이터 타입"으로 해석하렴 ==> <T>
class Box <T>
{
	private T obj;		// Box<Apple> 이라고 치면 T가 다 Apple로 바뀐다.
						// 실제로도 Box<Apple> 과 Box<Orange> class는 컴파일러가 내부적으로 각각 따로 만든다.
	
						// 지금 컴파일러책을 보면 마지막에 제네릭 기술이 나온다. 컴파일 기술의 꽃이 제네릭이다.
						// 과도한 제네릭을 쓰면 컴파일 속도가 느리다. 라는 게 있었는데 그것도 옛말이다. --> 최적화가 되었기 때문에
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
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



public class Main6 {
	
	public static void main(String args[])
	{	
		
	// Object로 Box를 구현했을 때와 차이라면, Box<T>는 형변환을 할 필요가 없다는 것이다.
		
		// 사과 박스를 만들고 싶다.
		Box<Apple> aBox = new Box<Apple>();
		
		aBox.set(new Apple());
		
		Apple app = aBox.get();
			System.out.println(app);
			
		
		// 오렌지 박스 만들기
			
		Box<Orange> oBox = new Box<Orange>();
		
		oBox.set(new Orange());
		
		Orange ora = oBox.get();
			System.err.println(ora);
	
		// 여태까지는 클래스를 만들고 오브젝트를 만들었다면	
		// 제네릭은 오브젝트를 만들 때, 클래스를 만든다.
		// <T> 의 의미는 지금 데이터 타입을 결정하지 않고, 나중에 컴파일할 때 결정하겠다는 것.
			
		// 그니까. Box<Apple> aBox = new Box<Apple>();는 미리 만들어놓는 게 아니라 이 라인을 컴파일러가 해석하는 시점에 클래스를 만든다.
			
			
	}
}
