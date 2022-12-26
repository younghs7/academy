package day68_수5_열거형_예제3;

import day68_수5_열거형_예제3.Customer.CTYPE;

public class Main5 {

	public static void main(String[] args) {

		Customer c = new Customer(1, "이순신", CTYPE.VIP);
		
		System.out.println(c);
		
		System.out.println(TYPE.NORMAL );
		
		
		
		
		
	}

}


class Customer
{
	enum CTYPE{
		NORMAL,
		VIP
	}
	
	private int number;
	private String name;
	private CTYPE type;		// 0: normal, 1: VIP
	
	public Customer(int number, String name, CTYPE type)
	{
		this.number = number;
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Customer [number=" + number + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
