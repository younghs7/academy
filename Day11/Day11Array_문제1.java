package day11;

public class Day11Array_문제1 {

	public static void main(String[] args) {


		int[][] score = new int[][] {
			{1, 2, 3, 4}, 
			{5,6,7,8}, 
			{9,10,11,12}
			};
			
			for(int j =0; j<3; j++)
			{
				for(int i =0;i<4; i++)
				{
					System.out.print(score[j][i]+" ");
				}
				System.out.println("");
			}
			
	}

}
