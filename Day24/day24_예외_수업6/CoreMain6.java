package day24_예외_수업6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoreMain6 {
	
	

	public static void main(String[] args)
	{
		
		
		Scanner kb = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		double n = 0;
		
		try 
		{
			n1 = kb.nextInt();
			n2 = kb.nextInt();
			n = n1 / n2;
		}
		catch(InputMismatchException e)
		{
			System.out.println("실패: 잘못된 입력");
		}
		catch(ArithmeticException e)
		{
			System.out.println("실패: 0으로 나눔");
		}
		finally
		{
			System.out.println("최종값: " + n);
		}
		
		/*
		 예외가 발생하든 발생하지 않든 finally는 무조건 실행된다.
		 */
		
	}
	
}
