package day64_수1_컬렉션_list_예제;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;

public class Main1 {

	public static void main(String[] args) {
		// 잘 만들어진 컬렉션 프레임워크를 이용하면,
		// 1. 쉽고, 편하고, 안정적으로 도는 자료구조를 만들어 낼 수 있음.
		// 2. 이런 구조는 1> 높은 품질을 약속 
		//			    2> 리더빌리터가 급상승.(남들 다 쓰는 라이브러리가져다가 썼기 때문)
		List<String> list = Arrays.asList("홍길동","이순신","김구","안중근");
		
		list = new ArrayList<>(list);
		
		for (Iterator<String> iter = list.iterator(); iter.hasNext();)	//iterator: 반복자
		{
			System.out.print(iter.next() + '\t');
			
		}
		System.out.println("");
		System.out.println("Sorting...");
		Collections.sort(list);
		
		for(Iterator<String> iter = list.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next() + '\t');
		}
		
		
		
		
		// 옛날에는 홍길동, 이순신, 김구, 안중근을 저장한다하면, 배열로 저장함.
		String[] list2 = new String[4];
		list2[0] = "홍길동";
		list2[1] = "홍길동";
		// 지금은 이렇게 짜면 촌스러움. 초보가 짠 것.
		
	}
	
	
	


}
