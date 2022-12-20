package day64_수3_컬렉션_List_문제;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

	// 동물병원에서 동물친구들이 입원을 합니다.
	// 입원된 동물 친구들의 리스트를 만들려고 합니다.
	// 동물은 "번호", "이름", "병명"이 있습니다.
	// 동물 5마리를 입력하고 출력하는 코드를 작성하세요.

public class Main3 {

	public static void main(String[] args) {
														// 이 문제에서의 가장 핵심적 부분
		List<Animal> animalList = new LinkedList<>();	// 계속 추가해야되는 상황이기 때문에 ArrayList보다 
														// LinkedList가 더 적합하다.
		
		animalList.add(new Animal(1,  "고양이1", "감기"));
		animalList.add(new Animal(2,  "고양이2", "몸살"));
		animalList.add(new Animal(3,  "고양이3", "두통"));
		animalList.add(new Animal(4,  "고양이4", "고열"));
		animalList.add(new Animal(5,  "고양이5", "코로나"));
		
		
		for(Animal a : animalList)
		{	
			System.out.println(a);
//			System.out.println(animalList);
//			System.out.println(a.getNum());
//			System.out.println(a.getName());
//			System.out.println(a.getDiseaseName());
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



