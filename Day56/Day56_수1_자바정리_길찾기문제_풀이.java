


// 웹쪽은 예외 클래스를 별도 만드는 경우가 거의 없다.
// 사용자 예외 클래스는 5~6개가 있지 않는 한은 따로 파일을 만들지 않는다.
class MapDataException extends Exception

{
	public MapDataException()
	{
		super("유효하지 않은 맵데이터 발견");
	}
}








public class Day56_수1_자바정리_길찾기문제_풀이 {
	
	

	
	
	public static int[][] searchPath(int sx, int sy, int[][] map) throws MapDataException
	{
		
		int cx = sx;	    	// 현재 x위치
		int cy = sx; 			// 현재 y위치
		boolean bPath = true;	// path가 있다면 true, path가 없다면 false
		
		
		//1. 전달된 map과 동일한 메모리를 하나 더 할당한다.
		int[][] res = new int[map.length][map[0].length];           //  int[][] res = new int[10][8];
																	//  ---> 배열은 primitive type으로 해석하면 망한다. N: 10 T: int[8]   
		for(int i = 0; i < map.length; i++)
		{
			System.arraycopy(map[i], 0, res[i], 0, map.length);
			// 원본 배열의 시작, 원본배열의 위치
			
		}
		
		
		
		
		
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		
		
		//2. 새로운 데이터에 경로정보(res)를 규칙에 따라 저장.
		while ( (res[cy][cx] !=2) && (bPath == true) )
		{
			
			switch(res[cy][cx + 1])
			{
			
			case 0 :
				
				// 현재 위치에 9로 설정하고 오른쪽으로 옮긴다.
				res[cy][cx] = 9;
				cx++;
				
				break;
				
			case 1 :
				
				// 아래가 0인 경우라면 아래로 옮긴다.
				if (res[cy + 1][cx] == 0)
				{
					res[cy][cx] = 9;
					cy++;
				}
				else if (res[cy + 1][cx] == 1)
				{	
					// 아래로 옮길려고 하는데 1인 경우는 길이 없다고 판단.
					bPath = false;
				}
				else if (res[cy + 1][cx] == 2)
				{	
					res[cy][cx] = 9;
					cy++;
				}
				else
				{
					throw new MapDataException();
				}
				
				break;
				
			case 2 :
				
				res[cy][cx] = 9;
				cx++;
				
				
				break;
				
				
				default : 
					// 예외처리
					throw new MapDataException();
				
			
			}
			
			
			
// 세련 되지 않음 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
//			
//			// 오른쪽 방향으로 전진 가능!
//			if( res[cy][cx + 1] == 0 )
//			{	
//				// 현재 위치에 9로 설정하고 오른쪽으로 옮긴다.
//				res[cy][cx] = 9;
//				cx++;
//				
//			}
//			else if(res[cy][cx + 1] == 1 )
//			{
//				
//				// 아래가 0인 경우라면 아래로 옮긴다.
//				if (res[cy + 1][cx] == 0)
//				{
//					res[cy][cx] = 9;
//					cy++;
//				}
//				else if (res[cy + 1][cx] == 1)
//				{	
//					// 아래로 옮길려고 하는데 1인 경우는 길이 없다고 판단.
//					bPath = false;
//				}
//				else if (res[cy + 1][cx] == 2)
//				{	
//					res[cy][cx] = 9;
//					cy++;
//				}
//				
//			}
//			else if ( res[cy + 1][cx] == 2)
//			{	res[cy][cx] = 9;
//				cx++;
//			}
//	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
			
			
			
		}    // while문 {}
		
		return res;
		
	}
	
	
	
	

	public static void main(String[] args) {


		
		//10 x 10
		int [][] map = {
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
				{1, 0, 3, 1, 1, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 2, 1, 0, 1},
				{1, 0, 0, 0, 0, 1, 0, 0, 0, 1},
				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
		};
		// 1. path에 대한 결과. ==> result_map
		// 2. path가 없는 경우. ==> null
		
		// 주의사항 함수 구현에 집중할 게 아니라, main 사용자 입장에서의 만들어야 한다.
		

// 프로토 타입 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		int [][] resultMap = null;
		
		
		try {
		
		resultMap = searchPath(1, 1, map);
		
		if (resultMap == null)
		{
			System.out.println("길이 없습니다.");
		}
		else
		{
			for(int i = 0; i < resultMap.length; i++)
			{
				for(int k = 0; k < resultMap[0].length; k++)
				{
					System.out.print(resultMap[i][k]);
				}
				
				System.out.println("");
			}
		}
		
		
		}
		catch(MapDataException e)
		{
			e.getMessage();
			return;
		}
		
// 프로토 타입 끝 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		
		

	}

}
