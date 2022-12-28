package day70_수7_NestedClass_Annoymous클래스_문제3;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

// 컬렉션의 리스트 구조를 만들어보세요.
// 리스트에 문자열 데이터 5개를 넣어보세요.

// 리스트를 내림차순으로 정렬해보세요.
// 단 조건은 Comparator 인터페이스를 이용하세요.

class DSCComparator implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
	}
}

public class Main7 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("가");
		list.add("가나");
		list.add("가나다");
		list.add("라");
		list.add("마");
	
		
// 버젼 1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		Collections.sort(list, new DSCComparator());
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
// 버젼 2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
		// 자바는 자바스크립트처럼 메소드 하나만 떨렁 놓을 수 없기 때문에
		// 인터페이스를 통해서 메소드를 넣을 수 있다.
		
		Comparator<String> cmp = new Comparator<String>() 
		{
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		
		}; 
		
		Collections.sort(list, cmp);
		
		// 오름차순
		System.out.println("오름차순 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		for(String s: list)
		{
			System.out.println(s);
		}
						

		
		
// System.out.println("궁금 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");		
//	String 솔트 방법 궁금해서 만들어본 것ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
					

// 아 왜 오류나나 했더니만 s1이 s2보다 긴 경우에 문제가 되네. 왜냐하면 s2의 없는 index를 찾으니까.

//		Collections.sort(list, 
//				new Comparator<String>() 
//				{
//				@Override
//				public int compare(String s1, String s2) {
//				
//					// 오름차순
//					for(int i =0; i < s1.length(); i++)
//					{
//						// s1, s2 동일 인덱스가 다른 문자열인 경우 
//						if( s1.charAt(i) != s2.charAt(i))
//						{
//							return s1.charAt(i) - s2.charAt(i);	
//						}
//					
//						// s1길이까지 s1와 s2이 동일한 경우에만 실행됨.
//						if(i == s1.length()-1 )
//						{	
//							if(s1.length() == s2.length())
//							{
//								return 0;
//							}
//							else
//							{
//								return -1;
//								
//							}	
//						}
//					}	
//					
//					return 0;
//				}
//			
//			
//		});		
//		
//		for(String s: list)
//		{
//			System.out.println(s);
//		}
//			
		
	}
}




