package day65_수5_컬렉션_TreeSet_예제;

import java.util.Objects;
import java.util.TreeSet;


public class Main5 {

	public static void main(String[] args) {

		TreeSet<Integer> tset = new TreeSet<>();
		
		tset.add(3);
		tset.add(1);
		tset.add(2);
		tset.add(4);
		
		System.out.println(tset.size());

		for(Integer n : tset)
		{
			System.out.println(n);
		}
		
	}

}






