package day10;

public class Day10MultiplicationTableSolution {

	public static void main(String[] args) {

		int dan = 2;
		int mul = 1;
		// 2 x 1 = 2
		// 2단 ~ 9단까지 출력하기 위한 for
		for (int i =0; i < 8; i++) {
			System.out.println(i);
			
			for(int k=0; k <9; k++) {
				System.out.println(dan + " x " + mul + " = " +(dan*mul) );
				mul++;
			}
			
			dan++;
			mul = 1;
		}
		
		

	}

}
