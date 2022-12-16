package day62_수3_제네릭_타입제한_인터페이스;



interface Eatable
{
	public String eat();
	
}

class Apple implements Eatable, Showable {
	
	public String eat()
	{
		return "사과는 맛있어!";
	}
	
	public String show()
	{
		return "사과는 멋져";
	}
	
}
class Orange implements Eatable, Showable {
	
	public String eat()
	{
		return "오렌지는 맛있어!";
	}
	
	public String show()
	{
		return "오렌지는 멋져";
	}
	
}

interface Showable
{
	public String show();
	
}




class Box <T extends Eatable & Showable> // < Eatable, Showable > 라고 표기 하면 오류난다. &를 써야한다.
{
	private T obj;
	
	
	
	public void set(T obj)
	{
		this.obj = obj;

	}
	public T get()
	{	
		System.out.println(obj.eat());
		return obj;
	
	}
}



public class Main_3인터페이스 
{
	
	public static void main(String[] args)
	{
		
		Apple ap = new Apple();
		System.out.println(ap.show() );
		
		Box<Orange> oBox = new Box<>();
		
		oBox.set(new Orange());
		
		System.out.println(oBox.get());
		
	
	}
}

