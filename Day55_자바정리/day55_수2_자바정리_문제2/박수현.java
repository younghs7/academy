package day55_수2_자바정리_문제2;


public class 박수현 {

	public static void main(String[] args) {
		// 마우스(쥐)가 먹이(2)를 찾는 알고리즘.
		// 길찾기 알고리즘의 가장 일반적인 예제
		// 시작 : [1, 1]
		// 목표 : 2를 찾는것이 목표
		// 오른쪽으로 가다가 벽(1)만나면 아래로간다
		// (단, 아래로 내려갔을 때에도 벽(1)이 있다면 종료시킨다.
		// 갔던 길은 9로 표시한다.
		
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
		
		int [] startPoint = {1, 1};		// 시작포인트
		
		int x = startPoint[0];			// map[x]번째 이동예정
		int y = startPoint[1];			// map[x][y]번째 이동예정
		
		boolean met1 = false;			// 벽을 만났는지에 대한 논리값
		boolean finish = false;		// 게임을 끝낼것인지에 대한 논리값
		
		String value = "";				// 배열 출력사용
		
		while(x < map.length)
		{
			while(y < map[x].length)
			{
				// 만약 길(0)이라면
				// --> 지나간 흔적(9)를 남기고 다음 여정을 위해 y++
				if(map[x][y] == 0)
				{
					map[x][y] = 9;
					met1 = false;
					
					y++;
				}
				// 만약 벽(1)이라면
				// 	1) 바로전에 벽을 이미 만났다면? --> 게임종료설정
				//	2) 바로전에 벽을 만난경우가 아니라면? --> 이전길의 아랫길로 가도록 설정 + 벽만남 true설정
				else if(map[x][y] == 1)
				{
					if(met1 == true)
					{
						finish = true;
						break;
					}
					
					y--;
					met1 = true;
					
					break;
				}
				// 만약 먹이(2)를 찾았다면 --> 게임종료설정
				else if(map[x][y] == 2)
				{
					finish = true;
					break;
				}			
			}
			
			// 게임종료를 원한다면 --> 반복문 나가기
			if(finish == true)
			{
				break;
			}
			
			// 아래로 내려가기
			x++;
		}
		
		// 배열 출력
		for(int i = 0; i < map.length; i++)
		{
			for(int j = 0; j < map[i].length; j++)
			{
				value = value + map[i][j] + " ";
			}
			System.out.println(value);
			value = "";
		}

	}

}
