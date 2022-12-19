package day63_수3;



class Box<T>
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
	public String toString()
	{
		return obj.toString();
	}
	
}

class Unboxer
{
	public static <T> T openBox(Box<T> box)
	{
		return box.get();
	}
	
	
	// 상한 제한
	public static void peekBox(Box<? extends Number> box)			
	{
		System.out.println(box);
	}
	
	// 하한 제한
	public static void peekBox2(Box<? super Number> box)
	{
		System.out.println(box);
		
	}
	
	
}

class Toy extends Plastic
{
//	private int a;
	
	@Override
	public String toString()
	{
		return "Toy";
	}
	
//	public void setA(int a) {this.a = a;}
	
}

class RobotToy extends Toy
{
	@Override
	public String toString()
	{
		return "RobotToy";
	}
	
	
}



class BoxHandler
{	
	
	// 정리: Box<? extends Toy>
	// ==> box가 참조하는 인스턴스(Type)를 대상으로 get(출력)만 허용한다.
	// public static void outBox(Box<? extends RobotToy> box)
	
	// Box<? super Toy>
	// ==> box가 참조하는 인스턴스(Type)를 대상으로 set(입력)만 허용한다.
	// public static void inBox(Box<? super Toy> box, Toy n)
	// --> 문제는 
	
	// 깨달음: 아! super는 - 제네릭 클래스를 object로 만들고 
	//           extends N 은 제네릭 클래스를 N으로 만드네. 
	
	
	
	
	// 박스에 있는 내용을 끄집어내겠다. 라고 하는 의도가 있고.. 그 기능이 분명.
	public static void outBox(Box<? extends RobotToy> box)
	{
//		box.set(new Toy());
		System.out.println(box.get().getClass());
		Toy t = box.get();
		System.out.println(t);
		
	}

	
	// box에 t를 설정한다.(입력)
	// 즉 inBox()의 용도는 box에 어떤값을 설정하려는 것이다.
	
	// 목표: 실행시간이 아닌 컴파일 때 오류가 나오게 하는 것
	public static void inBox(Box<? super Toy> box, Toy n)
	{
		box.set(n);
		
//		Toy t = box.get();
		Object o = box.get();
		
//		System.out.println(a);
		
	}
		
	
	
}

class Plastic
{
	
}



public class Main3 {
	
	public static void main(String[] args)
	{
		
//		Box<RobotToy> rBox = new Box<>( new RobotToy() );
//		
//		BoxHandler.outBox(rBox);
//		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		Box<Plastic> box = new Box<>();
		
		BoxHandler.inBox(null, null);
		
		
	}
	
}
