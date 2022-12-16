package day62_수1_제네릭_클래스_복습;


class Box <T>
{
	private T obj;
	
	public void set(T obj)
	{
		this.obj = obj;

	}
	public T get()
	{
		return obj;
	}
	
	
}


public class Main1 {

	public static void main(String[] args) {
	
		Integer i = 5;
		
		Box<Integer> iBox = new Box<>();
		iBox.set(i);
		
		Box<Box<Integer>> iiBox = new Box<>();
		iiBox.set(iBox);
		
		Box<Box<Box<Integer>>> iiiBox = new Box<>();
		iiiBox.set(iiBox);
		
		
		int k = iiiBox.get().get().get();
		System.out.println(k);

	}

}
