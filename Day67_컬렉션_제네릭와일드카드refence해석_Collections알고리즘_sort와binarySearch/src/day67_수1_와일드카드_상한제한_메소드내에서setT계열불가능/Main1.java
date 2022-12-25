package day67_수1_와일드카드_상한제한_메소드내에서setT계열불가능;

public class Main1 {

	public static void outBox(Box<? extends Toy> box)
	{
		Toy t = box.get();
//		box.set( new Box<Toy>() );  // ◀ 오류 난다. box.set()을 쓸 수 없다.
									// Toy ~ 최하위 클래스 범위를 만족하는 new Box<?> argument가 존재할 수 없기 때문이다.
									// 그래서 메소드 구현부에서 box.set() 을 쓸 수 없다.
		
		
		// 주의사항 <T or ?>로 들어온 parameter만 setT()을 쓸 수 없는 것이다.
		// ▼ 는 정상적으로 오류없이 돌아가진다.
		Box<Toy> box2 = new Box<Toy>(new Toy());
		box2.set(new Toy());		
		
		
		// 파라미터가 ( Box<? extends Toy> box ) 같이 되어 있으면, 
		// sort() 같이 참조값으로 위치를 바꿔주는 로직은 구현이 가능해도 
		// 이 메소드 안에서는 box객체가 T타입으로 되어 있는 속성을 가지고 있다면, 그 속성(T 데이터 타입)의 수정이 불가능하다는 것을 가르킨다.
		// 즉, T를 바꾸고 싶다면, 아예 Box<T> 객체 자체를 버리고 Box<T> 객체를 다시 만드는 수 밖에 없다.
		
	}

	
	// 이것은 와일드 카드 뿐만 아니라  <T extends Toy> 또한 마찬가지이다.
	// 제네릭도 마찬가지로 extends(상한제한)을 하면 setT계열이 안 된다.
	
	public static void main(String[] args) 
	{	
		
	}
	
	
}





class Box<T>
{
	private T obj;
	
	public Box() 				{	obj = null;	}
	public Box(T obj)			{	this.obj = obj;	}	
	
	
	public void set(T obj)		{	this.obj = obj;	}
	public T get()				{	return obj;	}
	
	
}




class Toy {	}
