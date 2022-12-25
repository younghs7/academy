package day67_수3_컬렉션_Collections_sort_컬렉션알고리즘_문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main3 {

	public static void main(String[] args) {
		
		// Collections.sort() 문제

	
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
	
	
}



