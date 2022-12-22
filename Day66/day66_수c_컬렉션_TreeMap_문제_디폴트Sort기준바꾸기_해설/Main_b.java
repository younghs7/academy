package day66_수c_컬렉션_TreeMap_문제_디폴트Sort기준바꾸기_해설;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
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


class KeyComparator implements Comparator<Integer>
{	
	
	// 오름차순으로 정렬, 단 90이상은 맨 앞으로 위치.
	public int compare(Integer n1, Integer n2)
	{	
		
		// 첫번째 방법 4가지 경우로 짠다.		(인간의 사고의 흐름대로 짠 것이기 때문에 성장이 빠르다!)
		
		if( (n1 >= 90) && (n2 >= 90) )
		{
			//	n1이 90 이상이고, n2이 90이상인 경우 
		}  
		
		else if ( (n1 >= 90) && (n2 < 90) )
		{	
			// n1이 90이상이고, n2이 90 미만인 경우
		}
		else if ( (n1 < 90) && (n2 >=90) )
		{
			// n1이 90 미만이고, n2이 90 이상인 경우
		}
		else if ( (n1 < 90) && (n2 >=90) )
		{		
			// n1이 90미만이고, n2이 90 미만인 경우
		}
		// 총 4가지 경우의 수로 대응 가능하다.
		
		
		
		
		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		// 두번째 방법			(이게 퍼포먼스적으로 좋다는데 이유는 정확히 모르겠다)
		
		if ((n1 >= 90) && (n2 >= 90))
		{
			return  n1.intValue() - n2.intValue();
		}
		else if (n1 >= 90)
		{
			return -1;
		}
		else if (n2 >= 90)
		{
			return 1;
		}
		else
		{
			return n1.intValue() - n2.intValue();
		}
		
	}
	
	
}



