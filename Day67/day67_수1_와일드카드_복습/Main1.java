package day67_수1_와일드카드_복습;

public class Main1 {

	
	public static void main(String[] args) {

		
		

	}
	
	

	public static void outBox(Box<? extends Toy> box)
	{
		Toy t = box.get();
//		box.set( new Box<Toy>() );  // 오류 난다. 
		
	}
	

}

class Box<T>
{
	T obj;
	
	public T get()
	{
		return obj;

	}
	public void set(T obj)
	{
		this.obj = obj;
	}
}

class Toy
{
	
}
