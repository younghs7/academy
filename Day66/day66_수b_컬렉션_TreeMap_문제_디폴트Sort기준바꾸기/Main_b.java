package day66_수b_컬렉션_TreeMap_문제_디폴트Sort기준바꾸기;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main_b {

	public static void main(String[] args) {

// 문제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// map에 데이터를 입력
// 번호-이름 10개. 그 중에 3개는 번호가 90이상으로 하시오.
// 오름차순으로 정렬, 단 90 이상은 맨 앞으로 배치하시오.

		
		TreeMap<Integer, String> map = new TreeMap<>(new KeyComparator()); 
	
		map.put(23, "임형민");
		map.put(12, "손영호");
		map.put(1, "최승미");
		map.put(2, "김건우");
		map.put(3, "박수현");
		map.put(13, "김도형");
		map.put(92, "김경민");
		map.put(90, "허율");
		map.put(91, "정성훈");
		
		
		Set<Integer> kset = map.keySet();	
		
			
		for(int k : kset)
		{
			System.out.println(k +" = "+ map.get(k));
		}
	
		
	}
}

class KeyComparator implements Comparator<Integer> // ◀ 인터페이스<제네릭>를 상속하는 경우에는 class<제네릭>을 쓰면 오류 생기더라.
{
	@Override
	public int compare(Integer n1, Integer n2)
	{
		int i1 =  (int)n1;					// ◀ 인터페이스<제네릭>를 상속하는 경우에는 class<제네릭>을 쓰면 오류 생기더라.
		int i2 =  (int)n2;					// 랩퍼클래스가 자동으로 언박스 안 됬음.
		
		
		// 첫번째 둘 다 90 이상인 경우
		if( (i1 >= 90) && i2 >= 90)
		{
			return i1- i2;
		}
		
		// 두번째 둘 중 하나가 90이상인 경우
		if(i1 >= 90)
		{
			return -1;
		}
		if(i2 >= 90)
		{
			return 1;
		}
		
		// 세번째 둘 다 90미만인 경우
		return i1 - i2;
		
		
	}
	
	
}



