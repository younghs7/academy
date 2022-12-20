package day64_수9_컬렉션_Set과HashSet_예제;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main9 {

	public static void main(String[] args) {

		boolean bResult = false;
		Set<String> set = new HashSet<>();
		// 해시 : 유일성을 보장하는 알고리즘.
		
		bResult = set.add("ABC1");
		bResult = set.add("ABC2");
		bResult = set.add("ABC3");
		
		System.out.println(set.size()); 	// 3
		
		bResult = set.add("ABC2");			// 안 들어간다. bResult = false
		System.out.println(set.size());		// 3
		
		/*
		 	주의: HashSet은 데이터를 비교해서 넣는 게 아니라 
		 	hash값을 비교해서 넣는 것이다.
		 */
		
		System.out.println("Iterator()ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(Iterator<String> iter = set.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
		
		System.out.println("이네스트 for문ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(String s : set)
		{
			System.out.println(s);
		}
		 
		
		
		
		
	}

}
