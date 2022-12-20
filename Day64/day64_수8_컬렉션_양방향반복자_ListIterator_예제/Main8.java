package day64_수8_컬렉션_양방향반복자_ListIterator_예제;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Main8 {

	
	// 양방향 반복자의 예.
	// 양방향 반복자는 리스트 구조에서만 가능하며 잘 사용하지 않음.
	
	public static void main(String[] args) {

		List<String> list = Arrays.asList("일두", "이두", "삼두", "사두", "오두");
		list = new ArrayList<>(list);
		
		ListIterator <String> iter = list.listIterator();
		
		while(iter.hasNext())
		{	
			System.out.println(iter.next());
			
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
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



