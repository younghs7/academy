package day67_수4_컬렉션_Collections_sort의reference해석_예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main4 {

	public static void main(String[] args) {
		
		// 이 예제 목적: <T extends Comparable<? super T>> 에서 <? super T>의 의미를 제대로 파악하기 위함.
		
		// 상속받은 HybridCar에는 Comparable<>이 구현되어 있지 않지만, 
		// Car를 상속받았기 때문에 HybridCar도 Collections.sort()를 이용할 수 있고, 정상적으로 소트된다.
		
		
		List<HybridCar> carlist = new LinkedList<>();
		
		carlist.add(new HybridCar(1000, 11));
		carlist.add(new HybridCar(3000, 22));
		carlist.add(new HybridCar(3000, 33));
		carlist.add(new HybridCar(2000, 44));
		carlist.add(new HybridCar(5000, 55));
				
		Collections.sort(carlist);
		
		// 소트된 결과 출력
		for(Car c: carlist)
		{
			System.out.println(c);
		}

		
		
		
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		// ▲ 를 분석하는 게 이 예제의 목적이다.

		// T가 Car 라면,
		// < Car extends Comparable<? super Car> >   
		// 해석 ==> 1. Car 클래스는 Comparable<> 을 구현해야(상속받아야) 하고,
		// 		   2. Comparable<Car> 뿐만 아니라 Comparable<Car의 상위클래스>도 괜찮다는 것이다. 
		
		// 결론은 Comparable<T>가 아니라 Comparable<? super T> 로 표현함으로써
		// T가 Comparable<T> 구현하지 않아도
		// Comparable<T의 부모클래스>만 구현해도 쓸 수 있게 해준다.
		
		// T extends Comparable<T> 로 되어 있으면, 
		// Comparable<T>를 무조건 구현해야지만 된다.
		
		
		
		// 강사님 설명 1
		// --> ★★★ <? super T> 는 상속때문에 있는 것이다. (누군가 <? super T>가 왜 있는 것이냐고 묻는다면 상속때문에 있는 것이라고 말할 수 있어야 하지 않을까. 핵심을 찌르는 말인 것 같다)
		// HybridCar 가 Car를 상속받았기 때문에, compareTo() 또한 정의되어 있다.
		
		// 하지만, Collections.sort()가 
		// < T extends Comparable<? super T> > 가 아니라 
		// < T extends Comparable<T> > 원형으로 되어 있다면, 
		// HybridCar 클래스 내부에 Comparable<HybridCar>를 무조건 구현해야만 될 것이다.
		// 하지만 <? super T> 로 되어 있다면,
		// Car를 상속받을 때 Comparable<Car> 또한 같이 상속받기 때문에 Comparable<HybridCar>를 구현할 필요가 없다!
		
		
		
		// 강사님 해석 2
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		
		// T는 Comparable을 구현해야 해.
		// <? super T> ==> Comparable를 부모로 부터 상속받아도 괜찮아!
		//             	   or 상속받은 클래스에 Comparable가 구현되어 있다면 괜찮아! 
		 
		
		// 정리 : 1. Comparable<? super T> 	
		//	 	 2. ? super가 생긴 이유: 상속 때문에 있는 것이다.
				
		
		// <?>, <T>, <? super T>, <? extends T> 차이 정리
		//1. Comparable<?>	: ?는 아무거나 들어와도 괜찮다
		//2. Comparable<T>	: T타입만 괜찮다. ( 실행시점에 타입이 결정난다 )
		//3. Comparable<? super T>  : T타입과 상위클래스만 된다.
		//4. Comparable<? extends T>  : T타입과 하위클래스만 된다.
		
		
		// ? 와 T 차이
		// T는 실행시점에 클래스를 결정하기 위한 것
		// ?는 제네릭의 기능을 확장하기 위해 나온 것이다. 
		
		 
		// <T extends Number> 와 <? extends Number> 는 사실상 차이가 없다.
	}
}

class Car implements Comparable<Car>
{
	private int disp;  		// 배기량
	
	public Car() {
		disp =0;
	}
	
	public Car(int disp)
	{
		this.disp = disp;
	}

	@Override
	public int compareTo(Car o)
	{
		return this.disp - o.disp;
	}
	
	@Override
	public String toString()
	{
		return disp + "CC";
	}
	
	public int getDisp()
	{
		return disp;
	}

}

class HybridCar extends Car // implements Comparable<HybridCar>		// ◀ 오류 생긴다. 
																	// The interface Comparable cannot be implemented more than once with different arguments
{																	// 번역: 인터페이스 Comparable 는 다른 인수를 사용하여 두 번 이상 구현할 수 없습니다.
	private int battery;
	
	public HybridCar()
	{
		
	}
	
	public HybridCar(int disp, int battery)
	{
		super(disp);
		this.battery = battery;
	}
	
	@Override
	public String toString()
	{
		return getDisp() + "CC, " + battery + "W" ;
	}
	
	
	
}


