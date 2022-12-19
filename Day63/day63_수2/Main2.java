package day63_수2;



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

class Toy
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
	// 박스에 있는 내용을 끄집어내겠다. 라고 하는 의도가 있고.. 그 기능이 분명.
	public static void outBox(Box<? extends RobotToy> box)
	{
//		box.set(new Toy());
		System.out.println(box.get().getClass());
		Toy t = box.get();
		System.out.println(t);
		
	}

	
	
	public static void inBox(Box<Toy> box, Toy t)
	{
	
		box.set(t);
	}
		
	
}



public class Main2 {
	
	public static void main(String[] args)
	{
		
		Box<RobotToy> rBox = new Box<>( new RobotToy() );
		
		BoxHandler.outBox(rBox);
		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	

		
	}
	
}
