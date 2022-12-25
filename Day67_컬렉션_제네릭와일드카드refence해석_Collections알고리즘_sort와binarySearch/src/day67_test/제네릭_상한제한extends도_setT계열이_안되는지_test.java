package day67_test;

public class 제네릭_상한제한extends도_setT계열이_안되는지_test {

	public static <T extends Number> /*◀ 실수한 부분 : extends Number(설명하는 부분)은 앞에 놓아야 한다.*/  
	void test(Box<T> box)													// 파라미터 안이 아니라
	{
		box.get();
//		box.set(new Box<Number>());      	// ◀ 와일드 카드와 마찬가지로 
											// 파라미터 들어온 
											//box.setT() 계열을 쓰면 오류가 생긴다.
		
		// 결론: 와일드카드 상한제한과 마찬기지로 제네릭 상한제한도 메소드내에서 box.setT()계열을 쓸 수 없다.
	}
	
	
	public static void main(String[] args) {

	}

}


class Box<T>
{
	private T obj;
	
	public Box() 				{	obj = null;	}
	public Box(T obj)			{	this.obj = obj;	}	
	
	
	public void set(T obj)		{	this.obj = obj;	}
	public T get()				{	return obj;	}
	
	
	@Override
	public String toString()	{	return obj.toString();	}
	
}


