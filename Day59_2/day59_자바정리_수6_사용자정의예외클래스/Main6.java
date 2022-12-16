package day59_자바정리_수6_사용자정의예외클래스;

import java.util.Scanner;


class ReadValueException extends Exception{       // 이유는 모르겠는데 public class로 쓰면 자기 파일에다가 쓰라고 빨간줄 뜬다.
	
	public ReadValueException()
	{
		super("음수가 입력되었습니다.");
	}

}


class Main6 {

		
	public static int readValue() throws ReadValueException
	{
		Scanner kbScan = new Scanner(System.in);
		
		int val = kbScan.nextInt();
		
		if(val < 0)
		{
			throw new ReadValueException();
		}
		
		return val;
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("a");
		
		int a = 0;
		try {
			
			a = readValue();
		}
		catch(ReadValueException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}



