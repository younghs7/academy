package day10;


//i n t[10] 스택을 구현
public class Day10Stack문제My {
	
	//변수 정하기 -> SP 
	static int sp = 0;
	
	//1. 함수 push()
	public static void push(int[] array, int x)
	{	
		if( (sp >= 0) && sp <= 9)
		{
			array[sp] = x;
			sp = sp + 1;
			
		}
		//overflow(sp = 9)이면 push 못함
		else if ( sp == 10 )
		{
			System.out.println("실행할 수 없습니다. SP가 overflow 입니다.");
		}
		else 
		{
			System.out.println("SP가 0~10 사이에 있지 않습니다. 코딩 오류");
		}
	}
	

	
	//2. 함수 pop()
	public static void pop(int[] array)
	{
		
		//underflow(sp = -1)면 pop 못함
		if(sp == 0) 
		{
			System.out.println("실행할 수 없습니다. SP가 underflow 입니다.");
			
		}
		else if(sp >= 1 && sp <=10) 
		{	
			sp = sp -1;
			array[sp] = 0;
			
		}
		// sp = -1~10 이외
		else
		{
			System.out.println("SP가 0~10 사이에 있지 않습니다. 코딩 오류" );
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
		System.out.println("---------");
		push(stack, 10);
		pop(stack);
		pop(stack);
		System.out.println("---------");
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		System.out.println("---------");
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		push(stack, 10);
		System.out.println("---------");
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		pop(stack);
		System.out.println("---------");
		pop(stack);
		pop(stack);
		pop(stack);

		
	
	
		
		stackPrint(stack);
		
		
		
		
		
		
		
		
	}

}
