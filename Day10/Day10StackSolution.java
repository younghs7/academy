package day10;


// 눈 앞이 흐릿해져서 코드 못 적었어..... 쉴 때 좀 쉬어라. 쉬는 시간에 좀 쉬어
public class Day10StackSolution {

	
	public static boolean push(int[] stack, int[] si, int data)
	{	
		int SP = si[0];
		//1. 스택 오버플로우 상태라면 return false;
		// 가드 코드의 핵심은 retrun
		if(si[1] == 10)
		{
			return false;
		}
		
		//2. 스택포인터 위치에 데이터를 집어넣는다.
		stack[SP] = data;
		
		//3. 스택카운트, 스택포인트를 증가
		si[0]++;
		si[1]++;
		
		return true;
	}
	
	
	
	public static boolean pop(int[] stack, int[] si)
	{
		int SP = si[0];
		//1. 스택 오버플로우 상태라면 return false;
		if (si[1] == 0)
		{
			return false;
		}
		//2. (스택포인터 - 1) 위치에 데이터를 뺀다.
		si[2] = stack[SP - 1];
		
		//3. 스택카운트를 감소
		si[0]--;
		si[1]--;
		
		return true;
	}
	
	public static void printStack(int[] stack, int[] si, int data)
	{
		
	}

	
	
	
	public static void main(String[] args) {

		int[] stack = new int[10];
		
		
		
		
		// 0: SP -> stackInfo[0] 
		// 1: Stack Count -> 스택 쌓인 갯수 stackInfo[1]
		// 2 : poped data
		int[] stackInfo = new int[3];
		
		push(stack, stackInfo, 11);
		push(stack, stackInfo, 22);
		push(stack, stackInfo, 33);
		
		if (true == pop(stack, stackInfo) )
				{
			System.out.println("poped data = " + stackInfo[2]);
				}
		
		
		if (true == pop(stack, stackInfo) )
		{
	System.out.println("poped data = " + stackInfo[2]);
		}

		if (true == pop(stack, stackInfo) )
		{
	System.out.println("poped data = " + stackInfo[2]);
		}

		
		
	}

}
