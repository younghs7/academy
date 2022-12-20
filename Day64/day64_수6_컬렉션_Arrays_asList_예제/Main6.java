package day64_수6_컬렉션_Arrays_asList_예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Main6 {


	// 배열 대신에 ArrayList 사용
	public static void main(String[] args) {

		List<String> list = Arrays.asList("일두","이두","삼두","사두");
		list = new ArrayList<>(list);
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext())
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



