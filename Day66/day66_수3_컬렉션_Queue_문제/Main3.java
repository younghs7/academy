package day66_수3_컬렉션_Queue_문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main3 {
	
	// asList 번역 : 리스트대로
	// 이 예제의 목적: 

	public static void main(String[] args) {


		List<String> list1 = Arrays.asList("a1", "a2", "a3", "a4", "a5");
		list1 = new ArrayList<>(list1);
		
		
		List<String> list2 = Arrays.asList("b1", "b2", "b3", "b4", "b5");
		list2 = new ArrayList<>(list2);
		
		
		List<String> list3 = Arrays.asList("c1", "c2", "c3", "c4", "c5");
		list3 = new ArrayList<>(list3);
		
		
		Queue< List<String> > queue = new LinkedList<>();
		
		queue.add(list1);
		queue.add(list2);
		queue.add(list3);
		
		for(Iterator< List<String> > iter = queue.iterator(); iter.hasNext();)
		{
			List<String> temp = queue.remove();
			
			for(String s : temp)
			{
				System.out.println(s);
			}
		}
		
		
		
		
		
		
		

	}

}
