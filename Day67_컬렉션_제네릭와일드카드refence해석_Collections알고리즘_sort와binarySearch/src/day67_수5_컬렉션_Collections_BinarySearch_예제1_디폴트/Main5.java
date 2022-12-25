package day67_수5_컬렉션_Collections_BinarySearch_예제1_디폴트;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main5 {
	
	// 주의사항 : binarySearch() 는 소트된 상태가 아니면 정상작동을 보장하지 않는다.
	// 			binarySearch 알고리즘을 보면 당연한 것이다.

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("donkazu");
		list.add("sundeakook");
		list.add("삼겹살");
		list.add("살치살");
		list.add("막걸리");
		
		// 소트를 시킨다.
		Collections.sort(list);
		
		// 소트된 결과를 출력한다.
		for(String s: list)
		{
			System.out.println(s);	// donkazu
									// sundeakook
									// 막걸리
									// 살치살
									// 삼겹살
		}
		
		// 소트된 리스트에서 "삼겹살"를 찾는다.
		int index = Collections.binarySearch(list, "삼겹살");
		
		if( 0 <= index )
		{
			System.out.println("index: " + index  );	// 4
			System.out.println(list.get(index));		// 삼겹살
		}
		else
		{
			System.out.println("없어");
		}
		
		
		
		
		

	}

}
