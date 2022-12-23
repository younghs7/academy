package day67_수test_제네릭extends_set되는지;

public class Main9 {

	public static <T extends Number> /*◀ 실수한 부분 : extends Number(설명하는 부분)은 앞에 놓아야 한다.*/  
	void test(Box<T> box)		
	{
		box.get();
//		box.set(new Box<Number>());      	// ◀ 와일드 카드와 마찬가지로 
											// 파라미터 들어온 
											//box 객체의 set 계열을 쓰면 오류가 생긴다.
		
		
	}
	
	public static void main(String[] args) {

		
		

	}

}


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


