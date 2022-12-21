package day65_수8_TreeSet다운로드비교하고삭제;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class Person2 implements Comparable<Person2>
{
	private String name;
	private int age;
	
	public Person2() {
		
	}
	
	public Person2(String name, int age)	
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
	public int compareTo(Person2 p)
	{
		return this.age - p.getAge();
	}
	
}


// Comparable이 아니라 Comparator이다.
// 경우에 따라 내름차순으로 하고 싶을때
// 별도의 클래스를 만들어서 생성자에 넣어줄 수도 있다.
class Person2Comparator implements Comparator<Person2>
{
	public int compare(Person2 p1, Person2 p2)
	{
		return p2.getAge() - p1.getAge();
	}
	

}



public class ExamTreeSet3 {

	public static void main(String[] args) {
		
		TreeSet<Person2> pset = new TreeSet<>(new Person2Comparator());

		
		pset.add(new Person2("정성훈", 48));
		pset.add(new Person2("박수현", 26));
		pset.add(new Person2("손영호", 31));
		
		
		for (Person2 p : pset)
		{
			System.out.println(p);
		}
		
	}

}
