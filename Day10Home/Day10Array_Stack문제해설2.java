package day10;


// 눈 앞이 흐릿해져서 도저히 이해할 수가 없더라.
// 적당히 좀 무리하자. 쉴 때 좀 쉬고. 전체적인 학습 효율이 낮아진다.
// 그냥 강사님 코드 다운받음......
// 설명은 이전에 못 적은 코드 포함해서 봐라.

public class Day10Array_Stack문제해설2 
{
	public static boolean push(int[] stack, int[] si, int data)
	{
		int SP = si[0];
		//1. 스택 오버플로우 상태라면 return false;
		// 가드 코드의 핵심은 retrun
		if (si[1] == 10)
		{
			return false;
		
		}
		
		
		//2. 스택포인터 위치에 데이터를 집어넣는다.
		stack[SP] = data;
		
		//3. 스택카운트, 스택포인터 를 증가
		si[0]++;
		si[1]++;
		
		return true;
		
	}
	
	public static boolean pop(int[] stack, int[] si)
	{
		int SP = si[0];
		
		//1. 스택 언더플로우 상태라면 return false;		
		if (si[1] == 0)
		{
			return false;
		}
		
		//2. (스택포인터 - 1) 위치에 데이터를 뺀다.
		si[2] = stack[SP - 1];
		stack[SP-1] = 0;
		
		//3. 스택카운트를 감소
		si[0]--;
		si[1]--;
		
		return true;
		
	}	
	
	public static void printStack(int[] stack, int[] si)
	{
		
		
	}
	
	public static void main(String[] args) 
	{
		int[] stack = new int[10];
		
		
		
		
		// 0 : SP
		// 1 : Stack Count
		// 2 : poped data
		int[] stackInfo = new int[3];	
		
		
		if (true == pop(stack, stackInfo))
		{
			System.out.println("poped data = " + stackInfo[2]);
			
		}
		else
		{
			System.out.println("ERR");
		}
		
		push(stack, stackInfo, 11);
		push(stack, stackInfo, 22);
		push(stack, stackInfo, 33);
		
		
		if (true == pop(stack, stackInfo))
		{
			System.out.println("poped data = " + stackInfo[2]);
			
		}
		
		if (true == pop(stack, stackInfo))
		{
			System.out.println("poped data = " + stackInfo[2]);
			
		}
		
		if (true == pop(stack, stackInfo))
		{
			System.out.println("poped data = " + stackInfo[2]);
			
		}
		
		
	}

}

