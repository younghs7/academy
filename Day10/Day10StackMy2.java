package day10;


//int[10] 스택을 구현
public class Day10StackMy2 {
	
	//변수 정하기 -> SP 
	
	//1. 함수 push()
	public static void push(int[] array, int[] si, int data)
	{	
		if(si[0] <= 9)
		{
			array[si[0]] = data;
			si[0] = si[0] + 1;
			
			if(si[0] == 10)
			{
				si[0] = si[0] - 1;
			}
			
		}
		else
		{
			System.out.println("실행할 수 없습니다. SP가 overflow 입니다.");
		}
	}
	
	//overflow면 push 못함
	
	//2. 함수 pop()
	public static void pop(int[] array, int[] si)
	{
		
		//underflow면 pop 못함
		if(si[0] >= 0) {
			array[si[0]] = 0;
			si[0] = si[0] -1;
			
			if(si[0] == -1)
			{
				si[0] = si[0] + 1;
			}
		}
		else
		{
			System.out.println("실행할 수 없습니다. SP가 underflow 입니다.");
		}
		
		
	
		
	}
	
	//3.스택 상태 출력 함수 stackPrint
	public static void printStack(int[] array, int[] si)
	{
		
			for (int i = 0; i < array.length; i++)
			{
				System.out.println("array["+i+"]: "+ array[i]);
			}
		System.out.println("스택 쌓인 갯수: "+si[0]);
		System.out.println("현재 SP 위치:"+si[0]);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		// main() -> 10크기 배열 할당
		int[] stack = new int[10];
		
		
		// 0: SP -> stackInfo[0] 
		// 1: Stack Count -> 스택 쌓인 갯수 stackInfo[1]
		int[] stackInfo = new int[2];
		stackInfo[0] = 0;
		stackInfo[1] = 0;
		
		push(stack, stackInfo, 1);
		push(stack, stackInfo, 2);
		pop(stack, stackInfo);
		push(stack, stackInfo, 3);
		push(stack, stackInfo, 4);
		pop(stack, stackInfo);
		push(stack, stackInfo, 5);
		push(stack, stackInfo, 6);
		pop(stack, stackInfo);
		push(stack, stackInfo, 7);
		push(stack, stackInfo, 8);
		pop(stack, stackInfo);
		push(stack, stackInfo, 9);
		push(stack, stackInfo, 10);
		
		push(stack, stackInfo, 10);
		push(stack, stackInfo, 10);
		push(stack, stackInfo, 10);
		push(stack, stackInfo, 10);
		push(stack, stackInfo, 10);
		push(stack, stackInfo, 10);

		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		pop(stack, stackInfo);
		
		
		printStack(stack, stackInfo);
		
		
		
	}

}
