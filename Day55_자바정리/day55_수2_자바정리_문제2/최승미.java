package day55_수2_자바정리_문제2;

public class 최승미 {

	public static void main(String[] args) {

		
		int [][] map = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 3, 1, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};

		int a = 1;
		int b = 1;

			 while(map[a][b] != 2) {
				 
				 if(map[a][b] == 0) {
					 
					 map[a][b] = 9;
					 b++;
				 }
				 else if(map[a][b] == 1) {
					 
					 a = a + 1;
					 b = b - 1;
					 
					 if(map[a][b] == 2) {
						 
						 for(int i = 0 ; i < 10 ; i++) {
							 for(int j = 0 ; j < 10 ; j++) {
								 
								 System.out.print(map[i][j] + ",");
								 
								 if (j == 9) {
									 
									 System.out.println();
								 }
							 }
						 }
						 
						 break;
					 }
					 
					 map[a][b] = 9;
					 b++;					 
				 }
				 else if(map[a][b] == 2) { 
					 
					 for(int i = 0 ; i < 10 ; i++) {
						 for(int j = 0 ; j < 10 ; j++) {
							 
							 System.out.print(map[i][j] + ",");
							 
							 if (j == 9) {
								 
								 System.out.println();
							 }
						 }
					 }
					 
					 break;				 
				 }			 
				 
				 if(b == 9) {
					 
					 b = 0;
					 a++;
				 }

			 }

	}

}
