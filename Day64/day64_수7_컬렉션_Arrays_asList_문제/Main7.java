package day64_수7_컬렉션_Arrays_asList_문제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main7 {


	// 정수 1, 2, 3, 4, 5를 asList를 사용해서 ArrayList를 만들어보고
	// 반복자를 이용해서 출력해보세요.
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		list = new ArrayList<>(list);
		
		for(Iterator<Integer> iter = list.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
	
	}

}


class Animal 
{
	private int num;
	private String name;
	private String diseaseName;
	
	public Animal() {
		num = 0;
		name = null;
		diseaseName = null;
	}
	
	public Animal(int num, String name, String diseaseName)
	{
		this.num = num;
		this.name = name;
		this.diseaseName = diseaseName;
	}
	
	
	public int getNum()
	{
		return num;
	}
	public String getName()
	{
		return name;
	}
	public String getDiseaseName()
	{
		return diseaseName;
	}

	@Override
	public String toString() {
		return "Animal [num=" + num + ", name=" + name + ", diseaseName=" + diseaseName + "]";
	}

	
	
	
	
	
}



