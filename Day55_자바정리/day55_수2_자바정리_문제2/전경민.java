package day55_수2_자바정리_문제2;



public class 전경민 
{
	public static void main(String[] args) 
	{
		//	먹이(2)를 찾는 알고리즘
		//	시작[1][1]
		//	목표 : 2를 찾는것
		// 앞으로 한칸 전진하다가 앞이 막히면 밑으로 내려감.
		int map[][] =
		{
			{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 },
			{ 1 , 0 , 0 , 1 , 0 , 0 , 0 , 0 , 0 , 1 },
			{ 1 , 0 , 0 , 1 , 1 , 1 , 0 , 0 , 0 , 1 },
			{ 1 , 0 , 0 , 0 , 0 , 0 , 0 , 1 , 0 , 1 },
			{ 1 , 0 , 0 , 0 , 0 , 1 , 0 , 1 , 0 , 1 },
			{ 1 , 0 , 0 , 0 , 0 , 1 , 2 , 1 , 0 , 1 },
			{ 1 , 0 , 0 , 0 , 0 , 1 , 0 , 0 , 0 , 1 },
			{ 1 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 0 , 1 },
			{ 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 , 1 }
		};
		
		int colIndex = 1;
		int rowIndex = 1;
		while( true )
		{
			if ( map[colIndex][rowIndex] == 2 )
			{
				System.out.println(colIndex + "행 " + rowIndex + "열 도착");
				break;
			}
			if ( map[colIndex][rowIndex+1] == 0 )
			{
				rowIndex++;
			}
			else if (( map[colIndex][rowIndex+1] == 1) && ( map[colIndex+1][rowIndex] != 1 ))
			{
				colIndex++;
			}
			else if (( map[colIndex][rowIndex+1] == 1 ) && ( map[colIndex+1][rowIndex] == 1 ))
			{
				System.out.println("길이 다 막힘");
				break;
			}
		}
	}
}