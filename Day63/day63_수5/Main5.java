package day63_수5;

import day63_수4.Plastic;

class Box<T>
{
	private T obj;
	
	
	public Box() 		
	{								
		obj = null;
	}
	public Box(T obj)
	{
		this.obj = obj;
	}
	
	
	public void set(T obj)
	{
		this.obj = obj;
	}
	public T get()
	{
		return obj;
	}
	
	@Override
	public String toString()
	{
		return obj.toString();
	}
	
}



class Robot extends Toy
{
	@Override
	public String toString()
	{
		return "RobotToy";
	}
	
	
}

class Toy 
{
//	private int a;
	
	@Override
	public String toString()
	{
		return "Toy";
	}
	
//	public void setA(int a) {this.a = a;}
	
}

class BoxHandler
{	
	// 1. box를 Box<Toy>도 받고 싶고, Box<Robot>도 받고 싶다.
	// 2. set은 안되게끔 제한조건을 두고 싶다.
	public static void outBox(Box<? extends Toy> box)
	{
		
	}
	
	public static void outBox(Box<? extends Robot> box)
	{
		
	}

	
	// box에 t를 설정한다.(입력)
	// 즉 inBox()의 용도는 box에 어떤값을 설정하려는 것이다.
	
	// 목표: 실행시간이 아닌 컴파일 때 오류가 나오게 하는 것
	public static void inBox(Box<? super Toy> box, Toy n)
	{
		box.set(n);
		
//		Toy t = box.get();
		Object o = box.get();
		
		
	}
		
	
	
}






public class Main5 {

	// super - set (O), extends - get(O)
	
	public static void copyBox(Box<? super Toy> to, Box<? extends Toy> from)
	{
		Toy temp = from.get();
		to.set(temp);
		
	}
	
	// 이해가 안 가는 점: extends는 왜 set이 안 되는가?
	
	
	public static void main(String[] args)
	{
		
		Box<Toy> box1 = new Box<>();		
		Box<Toy> box2 = new Box<>();		
		
		box1.set(new Toy());
		
		copyBox(box2, box1);
		
		System.out.println(box2);
	}
	
	
	
	
	
}
