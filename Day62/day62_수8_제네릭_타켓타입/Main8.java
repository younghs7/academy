package day62_수8_제네릭_타켓타입;

class Box<T>
{
	private T obj;
	
	
	public Box() 		// C++같은 경우는 Box<T>를 표기한다. 하지만 자바는 생성자에 <T>를 쓰지 않는다.   
	{					// 사람의 언어와 마찬가지로 프로그래밍 언어도 사람이 만드는 것이라 불규칙적인 면이 있다.				
		obj = null;
	}
	public Box(T obj)
	{
		this.obj = obj;
	}
	
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	public T get()
	{
		return obj;
	}
}

class BoxFactory
{
	public static <T> Box<T> makeBox()
	{
		Box<T> box = new Box<>();
		return box;
	}
	
	public static <T> Box<T> makeBox(T obj)
	{
		Box<T> box = new Box<>(obj);
		return box;
	}
	
}



public class Main8 {
	
	
	public static void main(String[] args)
	{
		// Target-type이 정해지지 않는 구형 자바. (JAVA5 이하)
		Box<Integer> iBox1 = BoxFactory.<Integer>makeBox(3);
		
		// Target-type이 만들어진 자바 (JAVA7 이상)
		Box<Integer> iBox2 = BoxFactory.makeBox(3);		// 파라미터를 통해서 타켓타입을 정한다.
		
		// JAVA? 이상
		Box<Double> dBox = BoxFactory.makeBox();		// 왼쪽 밸류 타입을 통해서 타켓타입을 정한다.
		
														// 타켓타입은 여기저기를 통해서 타입을 추론한다는 것만 알면 된다.
														// 타켓타입은 공식 문서에 자주 나오기 때문에, 용어를 잘 알기만 하면 된다.
		iBox2.set(30);
		System.out.println(iBox2.get());
		
		
		// 자바문법이 완성된 버젼이 JAVA8
		// 옵티마이저가 된 버젼이 JAVA11 이라고 하신다.
	}
	
}
