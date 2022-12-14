package day60_수8_JAVA_제네릭_연습문제2_generic클래스안에generic클래스;



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

class Box <T>
{
	private T obj;	
	
	
	
	
	public Box()
	{
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
	
	
	

	@Override
	public String toString() {
		//return "Box [obj=" + obj + "]";
		return obj.toString();	// 이렇게 하면 obj의 toString을 호출한다.
	}
	
	
	
}

class DoubleBox<L, R>
{
	private L left;
	private R right;
	
	public DoubleBox()
	{
		left = null;
		right = null;
	}
	
	public DoubleBox(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	public L getLeft()
	{
		return left;
	}
	public void setLeft(L left)
	{
		this.left = left;
	}
	
	
	public R getRight()
	{
		return right;
	}
	public void setRight(R right)
	{
		this.right = right;
	}
	
	@Override
	public String toString()
	{
		return "left = "+left.toString() + ", right = "+ right.toString();
	}
}




public class Main8 {

	public static void main(String[] args) {

// 풀이 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		Box<Apple> aBox = new Box<Apple>( new Apple() );
		Box<Orange> oBox = new Box<Orange>( new Orange() );
		// 가르킬 때, 실체가 없는 Box<T>에서 실체가 있는 Box<Apple>, Box<Orange> 로 만든다는 표현을 쓰심.
		
//		DoubleBox<Box<Apple>, Box<Orange>> dBox = new DoubleBox<Box<Apple>, Box<Orange>> (aBox, oBox);
		DoubleBox<Box<Apple>, Box<Orange>> dBox = new DoubleBox(aBox, oBox);   // 슈거코드1 
		
//		DoubleBox dBox = new DoubleBox<Box<Apple>, Box<Orange>> (aBox, oBox);  // 슈거코드2
																			   // <-- 정상 작동 안 한다.
																			   // 자바 신버젼이라 그렇다. 슈거코드는 버젼마다 정책을 달리한다.
																			   // JAVA 9에서는 정상적으로 돈다고 하신다.
																			   // 따라서, 슈거코드에서 <>는 앞에 붙이도록 하자.
		
		System.out.println(dBox);
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 1-1. AppleBox를 끄집어낸다.
		Box<Apple> AppleBox = dBox.getLeft();
		System.out.println( AppleBox );
			
		// 1-2. Apple을 끄집어낸다
		System.out.println(dBox.getLeft().get() );
		
		// 2-1. OrageBox를 끄집어낸다.
		System.out.println(dBox.getRight().get() );
		
		// 2-2. Orange를 끄집어낸다
		System.out.println(dBox.getRight().get() );
		
		
		
		
		
	}

}
