package day67_수업중test_제네릭extends;



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


class Toy
{
//	private int a;
	
	@Override
	public String toString()
	{
		return "Toy";
	}
	
	
}

class RobotToy extends Toy
{
	@Override
	public String toString()
	{
		return "RobotToy";
	}
	
	
}


class Plastic
{
	
}



public class Main_test_제네릭extends_set계열안되는지 {
	
	public static void main(String[] args)
	{
		
//		Box<RobotToy> rBox = new Box<>( new RobotToy() );
//		
//		BoxHandler.outBox(rBox);
//		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		Box<Plastic> box = new Box<>();
		

		
		
	}
	

	public static <T extends RobotToy>void outBox(Box<T> box)
	{
//		box.set(new Toy());
		System.out.println(box.get().getClass());
		Toy t = box.get();
		System.out.println(t);
		
	}

	
	public static void inBox(Box<? super Toy> box, Toy n)
	{
		box.set(n);
		
//		Toy t = box.get();
		Object o = box.get();
		
//		System.out.println(a);
		
	}
			
	
}
