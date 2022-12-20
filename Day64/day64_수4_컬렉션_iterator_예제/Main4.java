package day64_수4_컬렉션_iterator_예제;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// import day64_수3_컬렉션_List_문제.Animal;  // public이 아니라 접근할 수 없다.

	// 동물병원에서 동물친구들이 입원을 합니다.
	// 입원된 동물 친구들의 리스트를 만들려고 합니다.
	// 동물은 "번호", "이름", "병명"이 있습니다.
	// 동물 5마리를 입력하고 출력하는 코드를 작성하세요.

public class Main4 {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("붕어빵");
		list.add("순대국");
		list.add("짬뽕");
		list.add("막걸리");

		// String list의 반복자를 흭득한다. 리스트의 첫 노도를 가리키고 있다.
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())	//hasNext: 다음이 있니?
		{
			System.out.println(iter.next());
		}
		
		
		
		// 다시 순회하고 싶으면 iter를 다시 가져와야 한다. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		iter = list.iterator();
		while(iter.hasNext())	//hasNext: 다음이 있니?
		{
			System.out.println(iter.next());
		}
		
		
		for(Iterator<String> itr = list.iterator(); iter.hasNext();)
		{
			System.out.println(itr.next());
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



