package day62_수2_제네릭_타입제한하는이유;



class Box <T extends Number>
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
	

//	▼ extends Number를 안 하면 컴파일이 안 된다. 빨간줄 뜸.
	public int getIntValue()
	{
		return obj.intValue();
	}
	
	
}


public class Main2 {
	
	public static void main(String[] args)
	{
		
// 타입을 제한하는 이유 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
//		Integer i = 5;
//		Double d = 2.3;
//		
//		System.out.println(i);			// 5
//		System.out.println(d);			// 2.3
//		
//		int ii = i.intValue();			
//		int dd = i.intValue():		
//		
//		System.out.println(ii);			// 5
//		System.out.println(dd);			// 2
//		
//	====================================================	
	
// 제네릭 - 타입제한 extends 클래스 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		Box<Integer> iBox = new Box<>();
		Integer i = 5;
		iBox.set(i);
		
		Box<Double> dBox = new Box<>();
		Double d = 2.3;
		dBox.set(d);
		
		System.out.println(iBox.getIntValue());		// ◀ extends Number 하지 않으면 오류 뜬다.
		System.out.println(dBox.getIntValue());		// ◀ extends Number 하지 않으면 오류 뜬다.
		
// ======================================================
	
	}
}
