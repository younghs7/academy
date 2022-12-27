package day69_시험풀이;
import java.util.*;


// ▼ enum만 다르다. 근데 문제 요구사항에서는 고객 구분을 0, 1라고 했으니 사실상 문제풀이가 이상한데
// 이렇게 하는 것이 좋다는 것을 보여주는 것이겠지

enum TYPE
{
	NORMAL,
	VIP	
}

class Customer implements Comparable<Customer>
{
	private int number;			// 고객번호
	private String name;		// 고객이름
	private TYPE type;
	
	public Customer()
	{
		number = 0;
		name = "noname";
		type = TYPE.NORMAL;
		
	}

	
	public Customer(int number, String name, TYPE type)
	{
		this.number = number;
		this.name = name;
		this.type = type;
		
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}


	public String getName() 
	{
		return name;
	}


	public void setName(String name) 
	{
		this.name = name;
	}


	public TYPE getType() 
	{
		return type;
	}


	public void setType(TYPE type) 
	{
		this.type = type;
	}


	@Override
	public String toString() {
		return "Customer [number=" + number + ", name=" + name + ", type=" + type + "]";
	}
	
	@Override
	public int compareTo(Customer c)
	{
		// 오름차순으로 정렬하게 소팅.
		if ((this.getType() == TYPE.VIP) && (c.getType() == TYPE.VIP))
		{
			return c.getName().compareTo(this.getName());
			
			
		}
		else if (this.getType() == TYPE.VIP)
		{
			return -1;
			
		}
		else if (c.getType() == TYPE.VIP)
		{
			return 1;			
			
		}
		else
		{
			return this.getNumber() - c.getNumber();	
		}
		
	}

}


public class 시험풀이 {

	public static void main(String[] args) {
		
		List <Customer> list = new LinkedList<>();
		
		list.add(new Customer(12, "치킨사장님", TYPE.NORMAL));
		list.add(new Customer(2, "돈까스사장님", TYPE.NORMAL));
		list.add(new Customer(43, "노트북사장님", TYPE.NORMAL));
		list.add(new Customer(3, "국밥사장님", TYPE.NORMAL));
		list.add(new Customer(5, "떡볶이사장님", TYPE.NORMAL));
		list.add(new Customer(1, "반찬사장님", TYPE.NORMAL));
		list.add(new Customer(19, "쌈밥사장님", TYPE.NORMAL));
		list.add(new Customer(10, "홍길동", TYPE.VIP));
		list.add(new Customer(15, "이순신", TYPE.VIP));
		list.add(new Customer(14, "을지문덕", TYPE.VIP));
		
		
		Collections.sort(list);
		
		for(Customer c : list)
		{
			System.out.println(c);
		}
		
	}

}
