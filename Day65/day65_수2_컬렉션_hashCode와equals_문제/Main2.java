package day65_수2_컬렉션_hashCode와equals_문제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {

		Set<Car> cset = new HashSet<>();
		
		cset.add(new Car("SONATA", "RED") );
		cset.add(new Car("SONATA", "BLACK" ));
		cset.add(new Car("SONATA", "WHITE" ));
	
		cset.add(new Car("AVANTE", "RED" ));
		cset.add(new Car("AVANTE", "BLACK" ));
		cset.add(new Car("AVANTE", "WHITE" ));
	
		
		// 아래 두행은 들어가면 안 됨!!
		cset.add(new Car("SONATA", "WHITE" ));
		cset.add(new Car("AVANTE", "RED" ));
		
		
		//cset.size();도 구하시고
		System.out.println(cset.size());
		//반복자를 이용하여 cset을 출력하는 (println)코드를 작성하세요.
		for(Iterator<Car> iter =  cset.iterator(); iter.hasNext(); )
		{
			System.out.println(iter.next().hashCode());
		}
		
		
		
		
		
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
		int total = 0;
		for(int i = 0; i < model.length(); i++)
		{
			total = total + model.charAt(i);
		}
		
		return total;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
	

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Car == false)
			return false;
		
		if(this.model != ((Car)obj).model)
			return false;
		
		if(this.color != ((Car)obj).color)
			return false;
		
		return true;
		
	}
	
	
	
}

	

class Num
{
	private int number;
	
	public Num() {
		number = 0;
	}
	public Num(int number)
	{
		this.number = number;
	}
	public int getNumber()
	{
		return number;
	}
	
	@Override
	public String toString() {
		return String.valueOf(number);
	}
	
	@Override
	public int hashCode()
	{
		return number % 3;			// 뭔가를 추가할 적에 hashCode를 가지고 분류를 하고 나서 
	}								// equals()로 데이터 비교를 한다.

	
	
	@Override
	public boolean equals(Object obj)
	{
		// 문제1. object가 Num object이고, number값이 같으면 true 으로 equals를 구현해보자
		if(obj instanceof Num == false)
			return false;
													  // 막혔던 부분
		if(this.number != ((Num)obj).getNumber() )    // (Num)obj.getNumber() 이렇게 있으면 (Num)보다 .이 우선된다.
		{
			return false;
		}
		
		return true;
	}
	
	
	// 해시 알고리즘을 가져와서 쓰려면, 해시 알고리즘 개념을 확실히 이해해야 가져올 수 있다.
	// 제대로 이해 못한 상태면, 가져와서 쓴다해도 오버스펙을 가져와서 쓰면 퍼포먼스 저하가 일어나고
	// 저스펙을 가져오면 오류가 뜬다.
	
	
	
	
}
