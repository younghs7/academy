package day66_수8_컬렉션_Map_예제;

import java.util.HashMap;

public class Main8 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>(); 	// key는 대부분 Integer or String 으로 쓴다. 
															// 복잡한 데이터로 key를 하지는 거의 않는다.
		
		// map에 데이터 입력
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8, "전광식");
		
		// map에 있는 데이터를 읽기
		System.out.println(map.get(8));		// 전광식			// 당연히 파라미터는 key다. value는 중복이 가능하니까.
		System.out.println(map.get(12));	// 손영호
		System.out.println(map.get(23));	// 임형민
		
		// map에서 데이터 삭제
		System.out.println(map.remove(12) );	// 손영호   ◀ ctrl + 클릭하면 리턴형 바로 파악할 수 있다.
		
		System.out.println(map.get(12));	// null
		
		
		// Javascript 에서 object가 key-value 형식으로 되어 있는 것은 
		// 결국 웹에서 쓰는 것들이 대부분이 key-value 형식으로 되어 있기 때문에 언어가 그렇게 만들어진 것이다.
		
		// 따라서 Java에서 Map 또한 많이 쓰일 수 밖에 없다.
	}

}
