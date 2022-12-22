package day66_수a_컬렉션_TreeMap_예제;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main_a {

	public static void main(String[] args) {

		TreeMap<Integer, String> map = new TreeMap<>(); 	// ◀ 결과가 sort가 되서 나온다.	
	
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(8, "전광식");
		map.put(8, "전s식");
		
		Set<Integer> kset = map.keySet();	
		
			
		for(int k : kset)
		{
			System.out.println(k +" = "+ map.get(k));
		}
		// 결과 							// ◀ 결과가 sort가 되서 나온다.
		// 8 = 전광식						// TreeMap은 자체적으로 default sort를 가지기 때문이다.
		// 12 = 손영호					// TreeMap 뿐만 아니라 Tree 구조는 다 그렇다.
		// 23 = 임형민
		
		
		
	}
}