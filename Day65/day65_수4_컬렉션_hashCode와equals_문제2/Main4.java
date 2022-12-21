package day65_수4_컬렉션_hashCode와equals_문제2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Main4 {

	public static void main(String[] args) {

		// Person 객체를 HashSet에 저장하고자 한다.
		// 이름과 나이가 같다면 동일 인스턴스로 간주하고자 한다.
		// 이런 조건을 만족하도록 Person 클래스를 완성하세요.
		
		HashSet<Person> pset = new HashSet<>();
		pset.add(new Person("홍길동", 28));
		pset.add(new Person("홍길순", 25));
		pset.add(new Person("이순신", 60));
		pset.add(new Person("연개소문", 50));
		
		// 중복이 입력되어서는 안 된다.
		boolean res = pset.add(new Person("연개소문", 50));
		
		for(Person p : pset)
		{
			System.out.println(p);
		}
		
	}
}



	

class Person 
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

	
