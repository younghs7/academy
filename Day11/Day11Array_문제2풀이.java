package day11;


public class Day11Array_문제2풀이 {

	
	// 과목별 총점을 구하는 함수
	// code 0: 국어, code 1: 영어, code 2: 수학
	
	public static int getTotalScorebySubject(int code, int[][] score)
	{
	
		int total = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			total = total + score[i][code];
		}
		
		return total;
		
	
	}
	
	public static int getTotalScorebyTerm(int code, int[][] score)
	{
		int total = 0;
		for (int i = 0; i < score[code].length; i++)
		{
			total += score[code][i];
		}
		return total;
	}
	
	
	
	
	public static void main(String[] args) {


		int [][] score = new int[][] {
				{78, 78, 77}, 
				{55, 56, 88},
				{78, 95, 74}, 
				{60, 90, 93},
				{99, 33, 57},
				{77, 66, 80},
		};
		
		int korTotal = getTotalScorebySubject(0, score);
		int engTotal = getTotalScorebySubject(1, score);
		int mthTotal = getTotalScorebySubject(2, score);
		
		int total11 = getTotalScorebyTerm(0, score);
		int total12 = getTotalScorebyTerm(1, score);
		int total21 = getTotalScorebyTerm(2, score);
		int total22 = getTotalScorebyTerm(3, score);
		int total31 = getTotalScorebyTerm(4, score);
		int total32 = getTotalScorebyTerm(5, score);
	
		
		System.out.println("국어 평균 =" + (korTotal / 6) );
		System.out.println("영어 평균 =" + (engTotal / 6) );
		System.out.println("수학 평균 =" + (mthTotal / 6) );
		
		System.out.println("1-1 평균 " + total11/3);
		System.out.println("1-2 평균 " + total12/3 );
		System.out.println("2-1 평균 " + total21/3 );
		System.out.println("2-2 평균 " + total22/3 );
		System.out.println("3-1 평균 " + total31/3 );
		System.out.println("3-2 평균 " + total32/3 );
	
		
		
		
	}

}
