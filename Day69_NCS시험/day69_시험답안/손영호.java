package day69_시험답안;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//	고객 정보를 저장하고 관리하는 서버 프로그램을 구현하고자 한다. 
//	아래 요구사항에 따라 프로그램을 구현하시오.
//	- 고객은 고객이름, 고객번호, 고객 구분 정보를 가지고 있다.
//	- 고객 이름은 문자열 정보, 고객번호는 양수, 고객구분은 0은 일반, 1은 VIP 이다.
//
//
//	1. 고객 클래스를 만드시오 (클래스명 Customer)
//	2. 고객 정보를 10개 만들어 이를 Collection의 List구조로 저장하시오
//	   (단 고객번호는 중복되어서는 안돼도록 해야하며 VIP고객은 3명이어야 한다.)
//	3. 고객 정보를 고객번호를 기준으로 오름차순 정렬하시오
//	   단 VIP 고객의 경우 앞쪽으로 배치되어야 하며 이름을 기준으로 내림차순 해야한다.
//	4. 정렬된 내용을 출력하시오 (고객번호, 이름, 고객구분)



public class 손영호 {
	
	public static void main(String[] args) {

	List<Customer> list	= new LinkedList<>();
	list.add( new Customer("잔다르크3", 3, 1) );
	list.add( new Customer("아무개1", 1, 0) );
	list.add( new Customer("아무개2", 2, 0) );
	list.add( new Customer("아무개4", 4, 0) );
	list.add( new Customer("이순신6", 6, 1) );
	list.add( new Customer("아무개5", 5, 0) );
	list.add( new Customer("아무개7", 7, 0) );
	list.add( new Customer("아무개9", 9, 0) );
	list.add( new Customer("아무개10", 10, 0) );
	list.add( new Customer("김구8", 8, 1) );
	
//	list.add( new Customer("음수", -1, 1) );
	
	
	
	
	System.out.println("sort 후 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	Collections.sort(list);
	
	for(Customer c: list)
	{
		System.out.println(c);
	}
	
	
	}

}



class Customer implements Comparable<Customer>
{
	String name;
	int number;		// 양수
	int type;		// 0: 일반, 1: VIP
	
	public Customer() {
		name = "noname";
		number = 0;
		type = 0;
	}
	
	public Customer(String name, int number, int type) {
		
		if(number < 0)
			return;
		
		this.name = name;
		this.number = number;
		this.type = type;

	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", number=" + number + ", type=" + type + "]";
	}
	
	
	@Override
	public int compareTo(Customer c) {

		
		// 둘 다 VIP인 경우
		if ( (this.type == 1) & (c.type == 1) )
		{
			return -(this.name.compareTo(c.name)); 
		}
		// this만 VIP인 경우
		else if (this.type == 1)
		{
			return -1;
		}
		// c만 VIP인 경우
		else if (c.type == 1)
		{
			return 1;
		}
		// 둘 다 VIP가 아닌 경우
		else
		{
			return this.number - c.number;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}