package day67_수4_컬렉션_Collections_sort의reference해석_예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main4 {

	public static void main(String[] args) {

	
		// 1. car 리스트를 만든다.
		List<Car> carlist = new LinkedList<>();
		
		// 2. car에 5개쯤 추가 (1000, 2000 ...)
		carlist.add(new Car(1000));
		carlist.add(new Car(3000));
		carlist.add(new Car(3000));
		carlist.add(new Car(2000));
		carlist.add(new Car(5000));
		
		// Arrays.asList(new Car(1100), new Car(2200), new Car(3300), new Car(4400), new Car(5500));
		
		// 3. 출력 (enhanced for문)
		for(Car c: carlist)
		{
			System.out.println(c);
		}

		
		System.out.println("sort된 결과 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 4. collections.sort를 이용해서 소트
		Collections.sort(carlist);
		

		
		// 5. 소트된 결과를 출력 (iterator)
		for(Iterator<Car> iter = carlist.iterator(); iter.hasNext(); )
		{
			System.out.println(iter.next());
		}
		
		
		
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		// ▲ 를 분석하는 게 이 예제의 목적이다.

		// T가 Car 라면,
		// < Car extends Comparable<? super Car> >   ==> Car 
		
		// 결론은 Comparable<T>가 아니라 Comparable<? super T> 로 표현함으로써
		// T가 Comparable<T> 구현하지 않아도
		// Comparable<T의 부모클래스>만 구현해도 쓸 수 있게 해준다.
		
		// T extends Comparable<T> 로 되어 있으면, 
		// Comparable<T>를 무조건 구현해야지만 된다.
		
		
		// 즉, <? super T> 는 
		// 1. T 상위객체를 받을 수 있다는 의미와
		// 2. setting만 되고 getter는 안 된다는 의미를 동시에 가짐.
		
		
		// 강사님 설명
		// ---> <? super T> 는 상속때문에 있는 것이다.
		// HybridCar 가 Car를 상속받았기 때문에, compareTo() 또한 정의되어 있다.
		// 하지만, Comparable<T>로 원형이 되어 있다면, 
		// --> 
		
		// public static <T extends Comparable<? super T>> void sort(List<T> list)
		// 강사님 해석 
		// 는 sort 기능이 있다.
		// T는 Comparable을 구현해야 해.
		// <? super T> ==> Comparable를 부모로 부터 상속받아도 괜찮아!
		//             ==> 상속받은 클래스에 Comparable가 구현되어 있다면 괜찮아! 
		 
		
		 
		//1. Comparable<?>
		//2. Comparable<T>
		//3. Comparable<? super T> 
		//나중에 정리할 때 차이를 명확히 분석해서 적을 것!
		
		 
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


