package day62_수9_와일드카드_예제;

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
	
	public static void peekBox(Box<?> box)			
	{
		System.out.println(box);
	}
}







public class Main9 {
	
	
	public static void main(String[] args)
	{
		Box<String> sBox = new Box<>();
		Box<Integer> iBox = new Box<>(5);
		sBox.set(new String("Hello"));
		
		String str = Unboxer.<String>openBox(sBox);
		System.out.println(str);		// Hello
	
		
		Unboxer.peekBox(sBox);			// Hello
		Unboxer.peekBox(iBox);			// 5
		

	
	}
}
