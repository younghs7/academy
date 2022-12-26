package day68_수2_Day67Collects종합문제_풀이2;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

public class Main2 {

	public static void main(String[] args) {

		List<Customer> list = new LinkedList<>();
		
		list.add(new Customer(8, "안중근", 1));
		list.add(new Customer(7, "이수현", 0));
		list.add(new Customer(2, "임형민", 0));
		list.add(new Customer(1, "정성훈", 0));
		list.add(new Customer(5, "이순신", 1));
		list.add(new Customer(4, "손영호", 0));
		list.add(new Customer(3, "김경민", 0));
		list.add(new Customer(6, "박수현", 0));
		list.add(new Customer(10, "허율", 0));
		list.add(new Customer(9, "김구", 1));
		
		Collections.sort(list);
		
		for(Customer c : list)
		{
			System.out.println(c);
		}
		

	}
}





class Customer implements Comparable<Customer>
{
	private int number;			// 고객 번호
	private String name; 		// 고객 이름
	private int type;			// 구분 (일반: 0, VIP: 1)

	public Customer() {
		number = 0;
		name = "noname";
		type = 0;
	}
	
	public Customer(int number, String name, int type) {
		this.number = number;
		this.name = name;
		this.type = type;
	}
	
	
	@Override
	public int compareTo(Customer c) {
		if ( (this.type == 1) && (c.type == 1) )
		{
			return this.name.compareTo(c.name) ;		// 	String에도 Comparable이 구현되어 있다.
		}
		else if(this.type == 1)
		{
			return -1;
		}
		else if(c.type == 1)
		{
			return 1;
		}
		else
		{
			return this.number - c.number; 
		}
		
		
	}
	
//	getter, setter ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	@Override
	public String toString() {
		return "Customer [number=" + number + ", name=" + name + ", type=" + type + "]";
		
	}
}

