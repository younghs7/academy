package day65_수8_TreeSet다운로드비교하고삭제;
import java.util.TreeSet;
import java.util.Iterator;

class Person implements Comparable<Person>
{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age)	
	{
		this.name = name;
		this.age = age;		
		
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public int hashCode()
	{
		return (name.hashCode() + age) % 3;
				
	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		String n = null;
		int a = 0;
		
		if (obj instanceof Person)
		{
			n = ((Person)obj).getName();
			a = ((Person)obj).getAge();			
			
			if ((this.getAge() == a) && (this.getName().equals(n)))
			{
				return true;
				
			}			
			
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "name : " + this.name + ", age : " + this.age; 
				
	}
	
	
	@Override
	public int compareTo(Person p)
	{
		return this.age - p.getAge();
		/*
		if (this.age > p.age)
		{
			//양수를 리턴 : 들어온 p를 앞으로 보낸다.
			return 100;
		}
		else if (this.age < p.age)
		{
			//음수를 리턴 : this를 앞으로 보낸다.
			return -56;
			
			
		}
		else  // this.age == p.age
		{
			return 0;
			
			
		}
		*/
		
	}
	
	
}


public class ExamTreeSet2 {

	public static void main(String[] args) {
		TreeSet<Person> pset = new TreeSet<>();
		
		pset.add(new Person("정성훈", 48));
		pset.add(new Person("박수현", 26));
		pset.add(new Person("손영호", 31));
		
		
		for (Person p : pset)
		{
			System.out.println(p);
		}
		
	}

}
