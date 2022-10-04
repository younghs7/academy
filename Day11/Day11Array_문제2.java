package day11;


public class Day11Array_문제2 {

	public static void main(String[] args) {
		
		
		
		//어차피 문제니까. 간단하게 작성하기보다 그냥 배운 거 활용하려고 3차 배열로 작성했는데, 
		//이게 참.. 문제 못 푼 조원들한테 이걸 설명하려니까.
		//너무 어렵다. 강사님은 행렬로 이해하면 안 된다고 하시고 그게 맞다고도 생각하지만
		//인간이 이해하기 쉬운 건 2차 이하 배열인 것 같다. 행렬이 괜히 존재하는 게 아닌 것 같다.
		//나야 내가 직접 3차로 짜서 이해하는데 문제가 없지만, 왠만하면 이해하기 쉬운 걸로 짜는 게 좋은 것 아닐까.
		
		System.out.println("배열 초기값 설정=====================================");
		//  학년 학기 과목
		//int[3][2][3] or int[6][3]
		
		double[][][] scores = new double[][][] {
			{ {78, 78, 77}, {55, 56, 88} }, //1학년 [0][][]
			{ {78, 95, 74}, {60, 90, 93} }, //2학년 [1][][]
			{ {99, 33, 57}, {77, 66, 80} }  //3학년 [2][][]
		};  //1학기[][0][]   2학기[][1][]
		
		//[][][0]: 국어점수 [][][1]:영어점수 [][][2]:수학점수
		
		
		System.out.println("과목별 평균=====================================");
		
		//과목 평균
		double 국어합계 = 0;
		double 영어합계 = 0;
		double 수학합계 = 0;
		for(int j=0; j < scores.length; j++)
		{
			for(int i = 0; i < scores[j].length; i++)
			{                                                 
				국어합계 = 국어합계 + scores[j][i][0];  
				영어합계 = 영어합계 + scores[j][i][1];  
				수학합계 = 수학합계 + scores[j][i][2];	
			}
		}

		System.out.println("국어 평균: "+(국어합계/6));
		System.out.println("영어 평균: "+(영어합계/6));
		System.out.println("수학 평균: "+(수학합계/6));
		

	System.out.println("학기별 평균=====================================");
		
		double 학기합계 = 0;
		//학기 평균
		for(int k=0; k < scores.length; k++)
		{
			for(int h=0; h < scores[k].length; h++)
			{
				
				 학기합계 = scores[k][h][0] + scores[k][h][1] + scores[k][h][2];
				 System.out.println((k+1)+"학년 "+(h+1)+"학기 평균 점수: "+ (학기합계/3));
			}
		}
		
		
		System.out.println("개인 실험====================================");
		
		
		System.out.println(scores[0][1].length);

		
		int[][][][] a = new int[5][4][3][2];
		System.out.println(a[0][0][0].length);
		
		System.out.println("length");
		
		System.out.println(scores.length);
		System.out.println(scores[0].length);
		System.out.println(scores[0][0].length);
		System.out.println(scores[0][0][0]/*.length 안됨*/);
		
		System.out.println(scores);
		System.out.println(scores[0]);
		System.out.println(scores[0][0]);
		
		
		
	}

}
