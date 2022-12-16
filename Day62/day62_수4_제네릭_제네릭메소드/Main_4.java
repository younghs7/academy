package day62_수4_제네릭_제네릭메소드;

class Box<T>
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

class BoxFactory
{
	public static <T extends String> Box<T> makeBox(T obj)  // 메소드는 리턴형 앞에 <T>를 붙인다. or 지정자 뒤
	{														// 제네릭 클래스와 마찬가지로 extends String 같이 제한을 걸 수 있다.
		Box<T> box = new Box<>();							
		box.set(obj);
		
		System.out.println("makeBox 호출");
		
		return box;
	}
	
}

public class Main_4 
{

	public static void main(String[] args) 
	{
		Box<String> sBox = BoxFactory.<String>makeBox(new String("Hello"));  // 제네릭 메소드 호출에서 <>는 함수명 앞에 온다.
		Box<String> sBox2 = BoxFactory.makeBox(new String("Hello"));  		 // <> 를 생략하는 슈거코드가 가능하다. 
		
	}

}
