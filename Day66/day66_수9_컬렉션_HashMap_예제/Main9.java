package day66_수9_컬렉션_HashMap_예제;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main9 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>(); 	
	
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8, "전광식");
		
		Set<Integer> kset = map.keySet();	// ◀ 왜 keySet 일까? 키는 유니크하기 때문에 중복이 없기 때문이다.
		
		
		
		// ketSet을 이용해서 map을 순회하는 방식 1번
		for(Iterator<Integer> iter = kset.iterator(); iter.hasNext();)
		{
			int key = iter.next();
			System.out.println(key +" = "+ map.get(key));
		}
		
		
		System.out.println("2번 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		// ketSet을 이용해서 map을 순회하는 방식 2번
		for(int k : kset)
		{
			System.out.println(k +" = "+ map.get(k));
		}
		
		
		
		
	}

}
