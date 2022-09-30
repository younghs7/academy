package day10;

// Day9ArrayProblemSolution에서 좀 더 가독성 업그레이버젼
// isExist(int[] ar, int num) 함수 플래그 넣기
public class Day9ArrayProblemSolution2 {

	
	public static boolean isExist(int[] ar, int num) 
	{
		
		for (int i = 0; i < 6; i++)
		{
			if (num == ar[i])
			{
				return true;
			}
			else
			{
				
			}
		}
		return false;
	}
	
	

	
	public static void genLotto(int[] lot) 
	{
		
		int index = 0; // 집어넣을 위치정보.
		int rn;
		//exist 플래그
		
		
		while(index < 6 ) 
		{
			//랜덤넘버를 구해.
			rn = ( (int)(Math.random()*45 ) ) + 1;

			//존재하지 않으면 넣어라.
			if(false == isExist(lot, rn))
			{
				lot[index] = rn;
				index++;
			}
		}
	}
	
	
	public static void main(String[] args) {

		//1. 로또 번호를 저장할 배열을 선언.
		int [] ar = null;
		ar = new int[6];
		
		genLotto(ar);
		/*
		 참조변수값을 넘겨준다는 의미 
		 */
		
		for (int i = 0; i < 6; i++) {
			System.out.println(ar[i]);
		}

	}

}
