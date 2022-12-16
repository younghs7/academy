package day62_수7_제네릭_상속;


class Box<T>
{
	protected T obj;
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
}


class SteelBox<T> extends Box<T>           // 주의 : 1. 제네릭 클래스를 상속 받으면 하위클래스 반드시 제네릭 클래스여야만 한다. --> 안 지키면 안 만들어진다.
{
	
	public SteelBox(T obj)
	{
		this.obj =obj;
	}
	
}

public class Main7 {

	public static void main(String[] args) {

	SteelBox<Integer> box1 = new SteelBox<Integer>(11);
	Box<Integer> box2 = new SteelBox<Integer>(22);
//	Box<Number> box3 = new Box<Integer>(33);   		// (X) : 안 된다. 당연하다. Box<Number> 와 Box<Integer>는 서로 상속관계가 아니기 때문이다.
	Box<Number> box4 = new SteelBox<Number>(44);   
//	Box<Number> box5 = new SteelBox<Integer>(33);	// (X) : 안 된다. 당연하다. 위와 같은 이유다.

	/*
	   Box<>를 하나의 데이터 타입으로 생각하는 것이 아니라
	   Box<Integer> 를 통째로 하나의 데이터 타입으로 생각해야 한다.
	   
	 */
	
	

	}

}
