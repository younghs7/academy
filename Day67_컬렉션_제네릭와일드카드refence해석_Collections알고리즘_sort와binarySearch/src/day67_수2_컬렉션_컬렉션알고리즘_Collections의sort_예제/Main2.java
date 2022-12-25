package day67_수2_컬렉션_컬렉션알고리즘_Collections의sort_예제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		
		// 컬렉션에서 제공해주는 알고리즘을 이용해보려고 합니다. ( 컬렉션 알고리즘이라고 한다. ) 
		
		// Collections.sort() 예제
		
		
		// 1. ArrayList를 하나 만든다.
		List<String> list = new ArrayList<>();
		list.add("abd0");	
		list.add("was1");	
		list.add("awasd2");	
		list.add("dsasa3");	
		list.add("caasd4");	
		list.add("qasdqw5");	
		
		
		// 2. 화면에 출력해본다. (소트되지 않은 결과)
		for(String s : list)
		{
			System.out.println(s);
		}
		
		// 3. ArrayList를 소트한다.
		Collections.sort(list);			// ◀ static 클래스
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		// 4. ArrayList를 출력한다. (소트된 결과물)
		for(String s : list)
		{
			System.out.println(s);
		}
		
		
		
		
//		 public static <T extends Comparable<? super T>> void sort(List<T> list)	// 주석처리해야 돌아감
		// ▲ 를 분석하는 게 이 예제의 목적이다.
		
		// 사용자가 만들어야 하는 건 T 다. ( T 말고는 다 구현되어 있는 결과물을 사용한다 )  
		// 사용자가 T 데이터타입을 만들고 Sort()를 쓰려면 T 클래스는 Comparable 인터페이스를 상속받아야만 한다.
		
		// 우리의 목표는 'sort() 원형'에서 T를 해석하는 것이고 그에 합당한 T(클래스)를 만드는 것이다.
		
		 
//		 <T extends Comparable<? super T>> 
		// ▲ 를 해석하면
		// 1. T는 Comparable<> 을 구현(상속)해야하고,
		// 2. Comparable<>이 구현된 상위 클래스를 상속받거나, Comparable을 구현해야한다.
		// 3. 해당 구현부에 setT() 계열은 없겠다는 것을 알 수 있다. 
		
		// 즉 T가 Integer라면, <Integer extends Comparable<? super Integer>>
		
		// Integer는 Comparable 인터페이스를 상속받아야 하고
		// Comparable<? super Integer> 라는 것은 
		// ==> Integer클래스가 Comparable<Number>를 상속받아도 허용한다는 것이다.
		

	}

}
