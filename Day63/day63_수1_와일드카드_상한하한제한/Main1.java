package day63_수1_와일드카드_상한하한제한;



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









public class Main1 {
	
	// T (제네릭) ==> 어떤 데이터타입도 올 수 있다.
	// ? (와일드카드) ==> 무슨 데이터타입이 올 지 모른다. + 제약조건
	public static void main(String[] args)
	{
		// 상한제한 extends
		Unboxer.peekBox(new Box<Number>(6));
		
		// 하한제한 super
		Unboxer.peekBox2(new Box<Object>(5));		// <-- 5가 랩퍼 클래스로 변함.
		
		
		
	}
}
