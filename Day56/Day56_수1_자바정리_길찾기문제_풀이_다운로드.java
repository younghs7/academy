


public class Day56_수1_자바정리_길찾기문제_풀이_다운로드 {
	
	public static int[][] searchPath(int sx, int sy, int[][] map) throws MapDataException
	{
		int cx = sx;			// 현재 x위치
		int cy = sy;			// 현재 y위치
		boolean bPath = true;	// path가 있다면 true, path가 없다면 false 
		
		//1. 전달된 map과 동일한 메모리를 할당한다.
		int[][] res = new int[map.length][map[0].length];
		
		for (int i = 0; i < map.length; i++)
		{
			System.arraycopy(map[i], 0, res[i], 0, map[0].length);
			
			
		}
		
		//2. 새로운 데이터(res)에 경로정보를 규칙에따라 저장.
		while((res[cy][cx] != 2) && (bPath == true))
		{
			switch(res[cy][cx + 1])
			{
			case 0 :
				res[cy][cx] = 9;			
				cx++;
				
				break;
				
			case 1 :
				if (res[cy + 1][cx] == 0)
				{
					res[cy][cx] = 9;
					cy++;
					
				}				
				else if (res[cy + 1][cx] == 1)
				{
					// 아래로 옮길려고 하는데 1인경우는 길이 없다고 판단.
					bPath = false;
					
				}
				else if (res[cy + 1][cx] == 2)
				{
					res[cy][cx] = 9;
					cy++;
										
				}
				break;
			
			case 2 :
				res[cy][cx] = 9;			
				cx++;				
				break;
				
			default :
				throw new MapDataException();
			
			
			}
		
		}// end of while.
	
		return res;
		
	}
	
	public static void main(String[] args) {
		
		
		int [][] map = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
				{1, 0, 0, 1, 1, 1, 0, 0, 0, 1},
				{1, 0, 0, 5, 0, 0, 2, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};
		
		int[][] resultMap = null;
		
		try 
		{
			resultMap = searchPath(1, 1, map);
		}
		catch(MapDataException e)
		{
			System.out.println(e.getMessage());
			return;			
		}
	
		if (resultMap == null)
		{
			System.out.println("길이 없습니다.");
		}
		else
		{
			for (int i = 0; i < resultMap.length; i++)
			{
				for (int k = 0; k < resultMap[0].length; k++)
				{
					System.out.print(resultMap[i][k] + " ");
					
				}
				
				System.out.println("");
				
			}
			
			
		}
		

	}
}
