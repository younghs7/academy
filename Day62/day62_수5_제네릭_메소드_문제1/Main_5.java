package day62_수5_제네릭_메소드_문제1;


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




public class Main_5 {

	public static <T extends Number> void swapBox(Box<T> b1, Box<T> b2)
	{
		T temp;
		
		temp = b1.get();
		b1.set(b2.get()); 
		b2.set(temp);
		
	}
	
	public static void main(String[] args) {

		Box<Integer> box1 = new Box<>();
		Box<Integer> box2 = new Box<>();
		Box<Double> box3 = new Box<>();
		
		box1.set(11);
		box2.set(22);
		
		System.out.println(box1.get());
		System.out.println(box2.get());
		
// 문제 아래 결과처럼 만들도록 swapBox() 만들기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		swapBox(box1, box2);  // 호출부에 <Integer>swapBox를 쓰면, 오류가 생긴다. ▶ 파라미터를 보고 판단하기 때문이다!
		
		System.out.println(box1.get());		// 22
		System.out.println(box2.get());		// 11
		
		
	}

}
