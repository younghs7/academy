package day11;

public class Day11Array_문제1풀이 {

	public static void main(String[] args) {
		
		
		int[][] ar = new int[][] {
			{1, 2, 3, 4}, 
			{5, 6, 7, 8}, 
			{9, 10, 11, 12}
			};
			
			for(int i =0; i< ar.length; i++)
			{
				for(int j =0; j< ar[i].length; j++)
				{
					System.out.print(ar[i][j]+" ");
				}
				System.out.println("");
			}

	}

}
