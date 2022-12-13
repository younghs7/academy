package day59_자바정리_수7_잘못된값으로객체생성막는방법_2가지;

//객체 생성 오류를 처리하는 방법 
public class Student {

	boolean bValid;
	private int number;
	
	public Student()
	{
		
	}
	
	// 객체 생성의 오류를 처리하는 방법 
	public Student(int number)
	{	
		// 1. bValid 로 처리한다.
		if(number < 0)
		{
			// 객체가 만들어지면 안 됨.
			bValid = false;
		}
		
		this.number = number;
		bValid = true;
		
		// 2. throw 예외로 처리한다. --> 주의사항: 이 객체가 생성되지 않으면 이 애플리케이션이 망가지는 경우가 아니면 안 쓴다.
		
	}
	
	public int getNumber()
	{
		if (bValid == false)       // <-- 모든 메소드에 if(bValid == false)를 넣어서 이상하게 값이 들어갔다면 작동 못하도록 한다. 
			return -1;
		
		return number;
		
	}
	
	
	
	
}
