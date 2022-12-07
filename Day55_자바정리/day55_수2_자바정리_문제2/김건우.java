package day55_수2_자바정리_문제2;





// 확인 해본 결과 이상하게 나오는 것을 확인함.

public class 김건우 {
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
		int x=1,y=1;
		//System.out.println(map[x][y+1]);
		
		//타겟 오른쪽([x][y+1])이 1일 경우, 자신의 위치를 9로 만들고 아래로 1칸 이동
		while(map[x][y] != 2) {
			if(map[x][y+1] == 1 ) {
				//자신의 위치를 9로 만들고 아래로 1칸 이동
				map[x][y] = 9;
				x++;
			}else {
				map[x][y] = 9;
				y++;
			}
		}
		
		//완성본 출력
		for(x=0; x<10; x++) {
			for(y=0; y<10; y++) {
				System.out.print(map[x][y]+" ");
			}System.out.println();
		}
		
		
	}
}
