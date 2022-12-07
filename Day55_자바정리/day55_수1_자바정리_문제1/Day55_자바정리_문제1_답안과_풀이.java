package day55_수1_자바정리_문제1;

public class Day55_자바정리_문제1_답안과_풀이 {

	public static void main(String[] args) {


		int a = 0;
		int b = 0;
		
		int[][]combin = new int[9][2]; 
		
		for(int i = 0; i < 10; i++ )
		{
			
			for(int j = 0; j < 10; j++)
			{
				
				b++;
				
				int expression = ( a*10 + b ) + ( b*10 + a );		
				if(expression == 99)
				{	
					combin[j][0] = a;
					combin[j][1] = b;
				}
				
			}
			
			
			a++;
		}
		
		for(int i = 0; i < combin.length; i++)
		{
			System.out.println("a=" + combin[i][0]);
			System.out.println("b=" + combin[i][0]);
		}
		
		
		
// 풀이 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		for (int a = 0; a < 10; a++)
//		{
//			for (int b = 0; b < 10; b++)
//			{
//				int expression = ( a*10 + b ) + ( b*10 + a );		
//				if(expression == 99)
//				{
//				System.out.println("a =" +a+ ", b =" +b);
//				
//				}
//			}
//		}
		
		
		
		
		
		

	}

}
