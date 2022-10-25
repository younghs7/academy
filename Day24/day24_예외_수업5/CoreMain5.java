package day24_예외_수업5;

import java.util.Scanner;

public class CoreMain5 {
	
	
	public static int readAge() throws ReadValueException
	{
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if (age < 0)
			throw new ReadValueException();
		
		return age;
	}

	public static void main(String[] args)
	{
		int age = 0;
		System.out.println("나이를 입력하세요: ");
		
		try {
			age = readAge();
		}
		catch(ReadValueException e)
		{
			System.out.println(e.getMessage());
			
			return;
		}
		
		System.out.println("당신의 나이는 "+age + "살 입니다.");
		
		/*
		 자바에서 정의되어 있는 예외만 나오는 게 아니다.
		 일반 자바 프로그래머는 예외를 만들 일이 거의 없으나
		 프레임워크 자체 내에서 만들어진 예외가 많다. 그걸 이해하는 게 핵심.
		 */
		
		
		
		
	}
	
}
