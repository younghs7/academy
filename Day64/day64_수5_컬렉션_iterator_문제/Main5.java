package day64_수5_컬렉션_iterator_문제;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {

		
		// 문제
		// LinkedList 로 animal 5개 등록 하시오.
		// Iterator로 출력 (for, while) 두가지 방식으로
		List<Animal> animalList = new LinkedList<>(); 
		

		animalList.add(new Animal(1,  "고양이1", "감기"));
		animalList.add(new Animal(2,  "고양이2", "몸살"));
		animalList.add(new Animal(3,  "고양이3", "두통"));
		animalList.add(new Animal(4,  "고양이4", "고열"));
		animalList.add(new Animal(5,  "고양이5", "코로나"));
		
		for(Iterator<Animal> iter = animalList.iterator(); iter.hasNext();)
		{
			System.out.println(iter.next());
		}
		
		System.out.println("while문 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Iterator<Animal> iter = animalList.iterator();
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



