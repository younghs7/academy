import java.util.Scanner;

public class 조별과제1해설2 {
	

	
	public static int addEvenOdd(int max)
	{
		int target = 1;
		int total = 0;
		
		
		for (int i = 0; i < max; i++)
		{	
		
			if( (target % 2) == 0 )
			{
				total = total + target;
			}
			
		target = target + 1;
		}
		
		
		return total;
	}
	


	public static void main(String[] args) {
		
		int result = addEvenOdd(100);
		result = addEvenOdd(1);
		result = addEvenOdd(10);
		result = addEvenOdd(100);
		result = addEvenOdd(1);
		System.out.println(result);
		
		
		
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
		
		System.out.println("val =" + val);
		

	}

}
