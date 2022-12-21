package day65_수3_컬렉션_hashCode와equals_문제풀이;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class Main3 {

	public static void main(String[] args) {

		Set<Car> cset = new HashSet<>();
		
		cset.add(new Car("SONATA", "RED") );
		cset.add(new Car("SONATA", "BLACK" ));
		cset.add(new Car("SONATA", "WHITE" ));
	
		cset.add(new Car("AVANTE", "RED" ));
		cset.add(new Car("AVANTE", "BLACK" ));
		cset.add(new Car("AVANTE", "WHITE" ));
	
		
// 문제 요구 사항 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		
		// 요구조건 1. 
		// 아래 두행은 들어가면 안 됨!!
		cset.add(new Car("SONATA", "WHITE" ));
		cset.add(new Car("AVANTE", "RED" ));
		
		
		// 요구조건 2.
		// 2-1) cset.size();도 구하시고
		// 2-2) 반복자를 이용하여 cset을 출력하는 (println)코드를 작성하세요.
		
		System.out.println(cset.size());
		
		for(Iterator<Car> iter =  cset.iterator(); iter.hasNext(); )
		{
			System.out.println(iter.next().hashCode());
		}
		
		
// ㅡ 참 고 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		// 내부적으로 String도 hashCode()가 구현되어 있다.
		String a = new String("abc");
		String b = new String("abcd");
		String c = new String("abcd");
		
		System.out.println(a.hashCode());  	// 96354
		System.out.println(b.hashCode());	// 2987074
		System.out.println(c.hashCode());	// 2987074
// 참고 끝 ======================================================
		
		
	}
}

	
class Car
{
	private String model;  // 모델명
	private String color;  // 색
	
	public Car() {
		model = null;
		color = null;
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		
	}
	
	
	
	
	@Override
	public int hashCode()
	{	
		int ret = ((model.hashCode() + color.hashCode()) );
		System.out.println("ret: "+ ret);
		
		// 이렇게 짜는 것이 일반적이다.
		return (model.hashCode() + color.hashCode()) % 3;	// + 대신 *으로 바꿔도 상관없다.
	
	}
	
	
	

	@Override
	public boolean equals(Object obj)
	{
		
		String mo = null;
		String cl = null;
		if (obj instanceof Car)
		{
			mo = ((Car)obj).getModel();
			cl = ((Car)obj).getColor();
			
			if (this.model.equals(mo) && this.color.equals(cl))
			{
				return true;
			}
			
		}
		
		return false;
		
		
	}
	
	public String getModel()
	{
		return model;
	}
	
	public String getColor()
	{
		return color;
	}
	
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}

}
	
	
	
	
	
	

