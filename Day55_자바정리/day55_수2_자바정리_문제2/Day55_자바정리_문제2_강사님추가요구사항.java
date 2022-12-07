package day55_수2_자바정리_문제2;

public class Day55_자바정리_문제2_강사님추가요구사항 {

	
	
	
	
	public static int[][] searchPath (int sx, int sy, int[][] map)  throws MapDataException
	{
		int mapIndex1 = map.length;
		int mapIndex2 ;
		
		
//		예외처리 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		// map 데이터가 사각형으로 구성되어 있지 않다면 예외 발생
		for(int i = 0; i < map.length-1; i++)
		{
			if( map[i].length != map[i + 1].length)
			{
				throw new MapDataException("ERR: 맵데이터 배열[][] 크기가 사각형이 아님. ");
			}
		}
		
		// map 데이터가 0, 1, 2 이외가 있다면 예외 발생
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[i].length; j++)
			{
				if( ( map[i][j] == 0 ) || (map[i][j] == 1) || (map[i][j] == 2 ) )
				{
					
				}
				else
				{
					throw new MapDataException("ERR: 맵데이터 0, 1, 2 이외 결함");
				}

			}
		}	
		
		
		
		
//		복사 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		mapIndex1 = map.length;
		mapIndex2 = map[mapIndex1-1].length;
		
		int[][] result_map = new int[mapIndex1][mapIndex2]; 
		
		
		for(int i = 0; i < mapIndex1; i++)
		{
			for(int j = 0; j < map[mapIndex1-1].length; j++)
			{
				result_map[i][j] = map[i][j];
			}
		}
		
		
		
//	 	길 찾기 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		int x = sx;
		int y = sy;
		while(true)
		{	
			// 오른쪽 값이 0이라면 오른쪽으로 이동한다.
			if (result_map[y][x+1] == 0)
			{
				// 이전 위치값을 9로 바꾼다.
				result_map[y][x] = 9;
				x++;
	
			}
			// 오른쪽 값이 1이라면 아래를 본다.
			else if(result_map[y][x+1] == 1)
			{
				// 아래값이 0이라면
				if(result_map[y+1][x] == 0) 
				{	
					//  이전 위치값을 9로 바꾼다.
					result_map[y][x] = 9;
					
					y++;

				}
				
				// 아래값이 1이라면
				else if(result_map[y+1][x] == 1)
				{
					System.out.println("막혔어 ㅜㅜ");
					return null;
				}
				// 아래값이 2라면
				else if(result_map[y+1][x] == 2)
				{
					//  이전 위치값을 9로 바꾼다.
					result_map[y][x] = 9;
					
					// 이동한다.
					y++;
					
					//먹는다
					result_map[y][x] = 5;
				
					System.out.println("맛있어");
		
					// 멈춘다.
					break;
					
					
				}
				else 
				{ 
					System.out.println("설마1?"); 
				} 	
				
			}
			
			// 오른쪽 값이 2일 때
			else if(result_map[y][x+1] == 2)
			{	
				//  이전 위치값을 9로 바꾼다.
				result_map[y][x] = 9;
				
				// 이동한다.
				x++;
				
				// 먹는다
				result_map[y][x] = 5;
				
				// 멈춘다.
				break;
			}
			else
			{
				System.out.println("설마2? ");
				break;
				
			}
			
		}

	
		
		return result_map;
	}
	
	
	
	
	
	
	
	
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
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

		
		int [][] result_map;
		

		try {
			
			result_map = searchPath(1, 1, map);
			
			if(result_map == null)
			{
				System.out.println("경로가 없습니다.");
				
			}
			
		}
		catch (MapDataException e)
		{
			
			System.out.println(e.getMessage());
			return;

		}
		

		
		System.out.println(result_map);
		
		
		
		
		// 프린트!
		for(int i = 0; i < result_map.length; i++)
		{
			for(int j = 0; j < result_map[i].length; j++)
			{
				System.out.print(result_map[i][j]);
			}
			
			System.out.println("");
		}

		
		
	
	}

}
