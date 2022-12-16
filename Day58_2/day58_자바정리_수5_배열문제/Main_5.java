package day58_자바정리_수5_배열문제;

public class Main_5 {
	
	// 문제2 행렬 덧셈,뺄셈 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	
	
	public static int[][] add(int[][] a, int[][] b)
	{
		int [][] result = new int[2][2];
		
		for(int i = 0; i < a.length; i++ )
		{
			for(int j = 0; j < b.length; j++)
			{
			  result[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return result;
	}
	
	
	public  int[][] subtract(int[][] a, int[][] b)
	{
		int [][] result = new int[2][2];
		
		for(int i = 0; i < a.length; i++ )
		{
			for(int j = 0; j < b.length; j++)
			{
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		
		return result;
	}
	
	
	
	
	
	

	public static void main(String[] args) {

		
		
		
		
		int a11 = 1;
		int a12 = 2;
		int a21 = 3;
		int a22 = 4;
		int[][] a = new int [][] { {a11, a12},  
								   {a21, a22}  };
		
	
	   int b11 = 1;
	   int b12 = 2;
	   int b21 = 3;
	   int b22 = 4;
	   int[][] b = new int [][] { {b11, b12},  
		   					      {b21, b22}  };
									   
		   					      
		   					      
	   int[][] result = add(a, b);	   				
		
	   for(int i = 0; i < result.length; i++)
	   {
		   for(int j =0; j < result[0].length; j++)
		   {
			   System.out.print(result[i][j]);
		   }
		   System.out.println("");
	   }
								   
								   
	}
	
	
}
