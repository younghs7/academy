package day65_수1_컬렉션_hashCode와equals_예제;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main1 {

	public static void main(String[] args) {

		boolean bResult;
		Set<Num> setNum = new HashSet<>();
		
		bResult = setNum.add(new Num(1234));
		bResult = setNum.add(new Num(1235));
		
		System.out.println(setNum.size());		// 2
	
		bResult = setNum.add(new Num(1235));	
		System.out.println(setNum.size());		// 3  ◀ 같은 new Num(1235) 를 넣었음에도 불구하고 중복으로 넣어진다.
																
		for(Num n : setNum)
		{
			System.out.println(n);
		}

			
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
				
		Set<String> setStr = new HashSet<>();
		setStr.add(new String("aa"));
		setStr.add("aa");
		setStr.add("aa");
											
		System.out.println(setStr.size());
		// Object.equals(); --> 재정의 되지 않은 object equals는 객체 참조값만 비교한다!
		
		double a = 1.1;
		
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
