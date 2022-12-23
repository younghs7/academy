package day67_수5_컬렉션_Collections_BinarySearch_문제1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("donkazu");
		list.add("sundeakook");
		list.add("삼겹살");
		list.add("살치살");
		list.add("막걸리");
		
		// 소트를 시킨다.
		Collections.sort(list);
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		// 소트된 리스트에서 "막걸리"를 찾는다.
		int index = Collections.binarySearch(list, "막걸리");
		
		if( 0 <= index )
		{
			System.out.println("index: " + index );
		}
		
		
		
		
		

	}

}
