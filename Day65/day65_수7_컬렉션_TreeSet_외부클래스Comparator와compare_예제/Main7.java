package day65_수7_컬렉션_TreeSet_외부클래스Comparator와compare_예제;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

public class Main7 {

	public static void main(String[] args) 
	{

		TreeSet<Person> pset = new TreeSet<>();
//		TreeSet<Person> pset = new TreeSet<>(new PersonComparator());
		// ▲ 별도로 
		
		// 클래스 내부에 compareTo() 를 만들어서 정렬하는 방법이 있고 (default)
		// 외부에서 별도의 비교기준을 클래스로 만들고, 파라미터로 넣어서 정렬하는 방법도 있다
		
		pset.add(new Person("정성훈", 48) );
		pset.add(new Person("박수현", 26) );
		pset.add(new Person("손영호", 31) );

		

		
		for(Person p : pset)
		{
			System.out.println(p);
		}
		
		
	
		
		
	}
	

}


// Comparable이 아니라 Comparator이다.
// 경우에 따라 내림차순으로 하고 싶다.
// 이럴 때 메소드를 수정하지 않고, 정렬 기준 함수를 만들어서 클래스에 넣어주면 안 되나?


class PersonComparator implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p2.getAge() - p1.getAge();
	}

	
	
}



class Person implements Comparable<Person>
{
	private int age;
	private String name;
	
	public Person() {
		age = 0;
		name = null;
	}
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	
	@Override					// ◀ 인터페이스는 없으면 바로 뻑나서 컴파일이 안되지만 붙여주는 것이 좋다.
	public int compareTo(Person p)
	{
		if( this.age > p.age )
		{
			// 양수를 리턴 : 들어온 p를 앞으로 보낸다. 
			return 1; // 양수
		}
		else if(this.age < p.age)
		{	
			// 음수를 리턴 : this를 앞으로 보낸다.
			return -1; // 음수
		}
		else if(this.age == p.age)	// this.age == p.age
		{
			return 0;
		}
		// else 로 끝내지 않으면, 논리적으로 여기서 끝나도 아래 코드가 오류가 나지 않는다.
		
		
		// ▼ 위를 요약하면 한줄로 된다.
		  return this.age - p.age;
		
		// 기존 것과 비교해야 정렬할 수있기 때문에 -1, 1이면 바꾸고, 0이면 바꾸지 않는다.
		
	}
	

	
//  ▼ 문제 구현 부분 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	@Override
	public boolean equals(Object obj) {
		
		String n = null;
		int a = 0;
		
		if(obj instanceof Person)
		{
			n = ((Person)obj).getName() ;
			a = ((Person)obj).getAge() ;
			
			if( (this.getAge() == a) && (this.getName().equals(n) ) )
			{
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		
		// return ( name.hashCode() + age ) % 10;  // ◀ 이렇게 짤수도 있지만, Objects.hash()를 이용할 수 있다.
		System.out.println("Objects.hash(name, age): " + Objects.hash(name, age));
		return Objects.hash(name, age) % 3; 
	}
	
	
	
//  ▲ 문제 구현 부분 ==============================================	
	
			
		
	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	
	
}