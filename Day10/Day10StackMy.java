package day10;


//i n t[10] 스택을 구현
public class Day10StackMy {
	
	//변수 정하기 -> SP 
	static int sp = 0;
	
	//1. 함수 push()
	public static void push(int[] array, int x)
	{	
		if(sp <= 9)
		{
			array[sp] = x;
			sp = sp + 1;
			
			if(sp == 10) {
				sp = sp -1;
			}
		}
		else
		{
			System.out.println("실행할 수 없습니다. SP가 overflow 입니다.");
		}
	}
	
	//overflow면 push 못함
	
	//2. 함수 pop()
	public static void pop(int[] array)
	{
		
		//underflow면 pop 못함
		
		
		if(sp == 0) {
			array[sp] = 0;
		}
		else if(sp >= 1) {
			array[sp] = 0;
			sp = sp -1;
		}
		else
		{
			System.out.println("실행할 수 없습니다. SP가 underflow 입니다.");
		}
	
		
	}
	
	//3.스택 상태 출력 함수 stackPrint
	public static void stackPrint(int[] array)
	{
			for (int i = 0; i < array.length; i++)
			{
				System.out.println("array["+i+"]: "+array[i]);
			}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		// main() -> 10크기 배열 할당
		int[] stack = new int[10];
		
		stack[0] = 0;
		stack[1] = 0;
		stack[2] = 0;
		stack[3] = 0;
		stack[4] = 0;
		stack[5] = 0;
		stack[6] = 0;
		stack[7] = 0;
		stack[8] = 0;
		stack[9] = 0;
		
		pop(stack);
		pop(stack);
		pop(stack);
		
		
	
	
		
		stackPrint(stack);
		
		
		
		
		
		
		
		
	}

}
