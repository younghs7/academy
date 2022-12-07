package day55_수2_자바정리_문제2;

public class Day55_자바정리_문제풀이2 {

	public static void main(String[] args) {

		//10 x 10
		int [][] map = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 1, 1, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};

		
		int x = 1;
		int y = 1;
		int count = 0;
		while(true)
		{	count++;
			
			// 오른쪽 값이 0이라면 오른쪽으로 이동한다.
			if (map[y][x+1] == 0)
			{
				// 이전 위치값을 9로 바꾼다.
				map[y][x] = 9;
				
				// n+1을 한다.
				x++;
				
				System.out.println("map["+y+"]" +"["+x+"]   " + map[y][x]);
				
				
			}
			// 오른쪽 값이 1이라면 아래를 본다.
			else if(map[y][x+1] == 1)
			{
				
				
				
				// 아래값이 0이라면
				if(map[y+1][x] == 0) 
				{	
					//  이전 위치값을 9로 바꾼다.
					map[y][x] = 9;
					
					y++;
					
					System.out.println("map["+y+"]" +"["+x+"]  " + map[y][x]);
					
				}
				
				// 아래값이 1이라면
				else if(map[y+1][x] == 1)
				{
					System.out.println("map["+y+"]" +"["+x+"]  " + map[y][x]);
					// a값이 1이라면 현재 위치에서 멈춤.
					System.out.println("막혔어 ㅜㅜ");
					break;
				}
				
				// 아래값이 2라면
				else if(map[y+1][x] == 2)
				{
					
					//  이전 위치값을 9로 바꾼다.
					map[y][x] = 9;
					
					// 이동한다.
					y++;
					
					//먹는다
					map[y][x] = 5;
				
					System.out.println("맛있어");
					System.out.println("map["+y+"]" +"["+x+"]  " + map[y][x]);
					
					// 멈춘다.
					break;
					
					
				}
				else 
				{ 
					System.out.println("설마1?, ---> 어이없네" + map[y+1][1]); 
				} 
				
				
			}
			// 오른쪽 값이 2일 때
			else if(map[y][x+1] == 2)
			{	
				//  이전 위치값을 9로 바꾼다.
				map[y][x] = 9;
				
				// 이동한다.
				x++;
				
				// 먹는다
				map[y][x] = 5;
				
				// 멈춘다.
				break;
			}
			else
			{
				System.out.println("설마2? ");
				break;
				
			}
			
		}
		
		
		
		
		
		// 프린트!
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[i].length; j++)
			{
				System.out.print(map[i][j]);
			}
			
			System.out.println("");
		}

		
		
	
	}

}
