package day64_수a_컬렉션_HashSet_예제;

import java.util.HashSet;
import java.util.Set;

public class Main_a {

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
	@Override
	public String toString() {
		return String.valueOf(number);
	}
	
	
}
