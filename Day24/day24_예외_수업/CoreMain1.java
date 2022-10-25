package day24_예외_수업;
import java.util.InputMismatchException;
import java.util.Scanner;


public class CoreMain1 {
	


	
	
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		try 
		{
			System.out.println("첫번째 값을 넣어주세요: ");
			int n1 = kb.nextInt();
			
			System.out.println("두번째 값을 넣어주세요: ");
			int n2 = kb.nextInt();
		
		
		
		
//		while(n2 == 0)
//		{
//			System.out.println("두번째 값이 0입니다. 0이외의 숫자를 입력해주십시오.");
//			n2 = kb.nextInt();
//		}
		
		System.out.println(n1/n2);
		}
		
		

		
		catch(InputMismatchException e)
		{
			System.out.println(e.getMessage());
			System.out.println("입력 오류: 문자를 입력했습니다. 숫자를 입력하세요." );
			
			return;
		}
		catch(ArithmeticException e)
		{
			System.out.println("입력 오류: 0으로 나누는 연산을 했습니다!");
			return;
		}
		
//		--OR연산자를 사용하여 합칠 수 있음.
//		catch(InputMismatchException | ArithmeticException e)
//		{
//			System.out.println("입력 오류: 잘못된 값을 입력했습니다!");
//		}
		
		
		/*
		 try: 예외가 발생할 수 있는 코드를 지정 
		 catch(예외 e): try{}에서 해당 예외를 만나면 catch {}로 점프함.
		 
		 try - catch 문은 배포 후 사용자에게 예외 상황을 알리기 위한 목적임.
		 
		 예외의 종료의 따라 catch문에 
		 return을 안 넣고 계속 실행할 수도 
		 return을 넣고 프로그램을 종료할 수도 있음.
		 */
		
		
		System.out.println("종료");
		
		
		/*
		 컴퓨터에서는 / 연산은 -연산을 반복하는 매커니즘을 가진다.
		 ex) 25/2
		     25-2 = 23 
		     23-2 = 21
		     21-2 = 19
		     ......
		     
		     10/0
		     10-0 = 10
		     10-0 = 10
		     10-0 = 10
		     ......
		 */
		
		
	}
	
}
