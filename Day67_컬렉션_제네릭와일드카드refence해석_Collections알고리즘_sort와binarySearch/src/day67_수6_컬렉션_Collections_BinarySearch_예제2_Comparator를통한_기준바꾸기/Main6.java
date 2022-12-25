package day67_수6_컬렉션_Collections_BinarySearch_예제2_Comparator를통한_기준바꾸기;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("ROBOT");
		list.add("TOY");
		list.add("FOOD");
		
		Collections.sort(list);
		
		StringCompare scmp = new StringCompare();
		
		Collections.sort(list, scmp);
			
		
		
		for(String s: list)
		{
			System.out.println(s);	// FOOD
									// ROBOT
									// TOY
		}
		
		int index = Collections.binarySearch(list, "Toy", scmp);
		
		System.out.println(index ); 		// 2
		System.out.println(list.get(index));// Toy
		
		
		System.out.println(Collections.binarySearch(list, "아무거나", new TestCompare() ) );	// 1
		System.out.println(list.get(1));													// ROBOT
		
		System.out.println(Collections.binarySearch(list, "아무거나", new TestCompare2() ) );	// -4
		
		
		// Comparator 에서 return 0; 을 하면 같은 것으로 인식하고 해당 index를 출력하는 모양이다.
		
		// 단, 래퍼런스를 보니
		// If the list contains multiple elements equal to the specified object, there is no guarantee which one will be found.
		// 해석: 같은 게 있을 경우 어떤 것을 출력할지는 보장하지 않는다고 한다.
		// 즉, compare(){ return 0; } 으로 해놓으면, 무작위로 리턴한다. 다 중복으로 인식하기 때문이다.

	}

}

class StringCompare implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2)
	{
		return s1.compareToIgnoreCase(s2);
	}
}

class TestCompare implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		
		return 0;							
	}
	
}

class TestCompare2 implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		
		return -1;
	}
	
}


