import java.util.Scanner;

public class 구구단2 {
	
	
	public static void printDan (int dan)
	{	
		int mul = 1;
		for(int i =0; i<9; i++) 
		{
			System.out.println(dan + " x " + mul + " = " + (dan * mul) );
			mul++;
		}
	}


	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int val = in.nextInt();
			
		printDan(val);
	
	}
}

