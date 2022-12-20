package day64_수2_컬렉션_ArrayList와linkedList_예제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {

//		List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();		// Array --> Linked 로 바꾸기만 해도 동일하게 돌아간다.
		// 이 한줄을 이해하려면, 제네릭, 타입추론, 인터페이스의 이해를 알고 있어야 제대로 이해할 수 있다.
		// 현대에는 인터페이스로 접근해서 사용하게끔 한다.
		
		
		// 데이터를 입력
		list.add("이순신");
		list.add("세종대왕");
		list.add("안중근");
		list.add("김대중");
		list.add("을지문덕");
		list.add("이조");
		list.add("광개토");
		
		// 데이터를 읽기
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		// 데이터를 삭제
		System.out.println("remove ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		list.remove(0);
		
		for(String s : list)
		{
			System.out.println(s);
		}

		

	}

}
