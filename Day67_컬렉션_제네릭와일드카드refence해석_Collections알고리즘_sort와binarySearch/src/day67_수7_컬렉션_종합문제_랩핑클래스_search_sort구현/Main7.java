package day67_수7_컬렉션_종합문제_랩핑클래스_search_sort구현;

import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main7 {
	
// 문제	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
//	1. Deque을 이용하여 Queue를 구현하고자한다. 
//	이것을 래핑클래스로 만들어서 구현해보세요
//	(enqueue, dequeue, getCount 
//	
//	2. 고객 클래스 (class Customer)가 있다.
//	고객은 이름, 고객번호(int, >0), 아이디, 고객구분(일반 0, VIP 1) 으로로 이루어져 있습니다.
// 
//	-요구사항1. 고객 리스트를 만드세요.
//	-요구사항2. 고객 리스트를 고객 번호를 기준으로 오름차순으로 정렬하세요
//	-요구사항3. 고객 리스트에서 고객 번호로 검색하는 기능을 만들어보세요.
//	-옵션: 요구사항4. VIP 고객인 경우 고객번호 기준으로 정렬시 가장 앞쪽에 위치하게 정렬시키세요. -
	
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public static void main(String[] args)
	{
		
		List<Customer> cList = new LinkedList<>();
		
		cList.add( new Customer(3,"아무개3","id3",0) );
		cList.add( new Customer(1,"아무개1","id1",0) );
		cList.add( new Customer(2,"아무개2","id2",0) );
		cList.add( new Customer(4,"아무개4","id4",1) );
		cList.add( new Customer(6,"아무개6","id6",1) );
		cList.add( new Customer(5,"아무개5","id5",0) );
		
		Collections.sort(cList);
		
		
		System.out.println("솔트된 결과 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(Customer c: cList)
		{
			System.out.println(c);
		}
		
		System.out.println("검색 결과 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 첫번째 버젼
		System.out.println(Customer.searchBy(cList, 1) );
		// 두번째 버젼
		System.out.println(Customer.binarySearchByNumber(cList, 3));	// 2
		
		
		
		
		Collections.sort(cList, new CustomerComparator() );
	
		System.out.println("VIP sort 결과 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		for(Customer c: cList)
		{
			System.out.println(c);
		}
		
	
		

//		Deque<Customer> cList = new Deque<>();
//		
//		MyQueue<Customer> custList = MyQueue<>(cList);

		

	}
	
	
}


// 랩핑 클래스 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

interface Queueable<E>
{
	public boolean enqueue(E item);
	public E dequeue();
	public int getCount();
}

class MyQueue<E> implements Queueable<E>
{
	private Deque<E> deq;
	
	
	public MyQueue() {
		deq = null;
	}
	
	public MyQueue(Deque<E> deq) {
		this.deq = deq;
	}

	@Override
	public boolean enqueue(E element) {
		return deq.offer(element);
	}

	@Override
	public E dequeue() {
		return deq.poll();
	}
	
	
	@Override
	public int getCount() {
		
		return deq.size();
	}
	
	
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
class Customer implements Comparable<Customer>
{
	private int number;
	private String id;
	private String name;
	private int customerClass;	// 일반 0, VIP 1
	
	public Customer() {
	}
	
	public Customer(int number, String name, String id, int customerClass) 
	{
		this.number = number;
		this.name = name;
		this.id = id;
		this.customerClass = customerClass;
		
	}
	
	@Override
	public int compareTo(Customer o) {
		
		return this.number - o.number;

	}
	
	public int getNumber()
	{
		return number;
	}
	
	public int getCustomerClass()
	{
		return customerClass;
	}
	
	
	// Search() 작성 두가지
	
	public static int binarySearchByNumber(List<Customer> list, int number)
	{	
		Customer c = new Customer(number, null, null, 0);
		return Collections.binarySearch(list, c);
	}
	
	
	public static Customer searchBy(List<Customer> list, int number)
	{
		for(Customer c: list )
		{
			if( number == c.getNumber() )
			{
				return c;		
			}
			
		}
		
		return null;
		
	
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [number=" + number + ", id=" + id + ", name=" + name + ", customerClass=" + customerClass
				+ "]";
	}
	
	
	
}




// Sort기준 클래스 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

class CustomerComparator implements Comparator<Customer>
{

	@Override
	public int compare(Customer c1, Customer c2) 
	{	
		
		// 둘다 VIP인 경우
		if( (c1.getCustomerClass() == 1) && 
			(c2.getCustomerClass() == 1) ) 
		{
			return c1.getNumber() - c2.getNumber();
		}
		// c1만 VIP인 경우
		else if( c1.getCustomerClass() == 1 )
		{
			return -1;
		}
		// c2만 VIP인 경우
		else if( c2.getCustomerClass() == 1 )
		{
			return -1;
		}
		// 둘다 VIP가 아닌 경우
		else
		{
			return c1.getNumber() - c2.getNumber();			
		
		}
		
			
			
	}
	
	
}
	
	



	
	



