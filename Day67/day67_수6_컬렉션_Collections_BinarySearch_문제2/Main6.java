package day67_수6_컬렉션_Collections_BinarySearch_문제2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("ROBOT");
		list.add("TOY");
		list.add("FOOD");
		
		Collections.sort(list);
		
		StringCompare scmp = new StringCompare();
		
		Collections.sort(list, scmp);
			
		
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		System.out.println(Collections.binarySearch(list, "Robot", scmp) ); 
		
			

	}

}

class StringCompare implements Comparator<String>
{
	@Override
	public int compare(String s1, String s2)
	{
		return s1.compareToIgnoreCase(s2);
	}
	
	
}