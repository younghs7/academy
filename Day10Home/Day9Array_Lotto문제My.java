package day10;

public class Day9Array_Lotto문제My {

	public static void genLotto(int[] lotto) //generate
	{	
		
		
		lotto[0] =0;
		lotto[1] =0;
		lotto[2] =0;
		lotto[3] =0;
		lotto[4] =0;
		lotto[5] =0;
		

		int lottoIndex = 0; // lotto[*] *에 담기는 변수
		
		while(lotto[5] == 0) {
		
			//1. 1~45의 랜덤한 숫자를 하나 생성한다. -> 변수 random에 담는다.
			int random = (int)(Math.random() * 45) + 1;	
		
			//2. 랜덤번호가 겹치는지 확인한다. -> TF값으로 리턴한다.
			//true가 겹치지 않는 상태 false 겹치는 게 있는 상태
			boolean tf = true;
			for(int i=0; i < 6; i++) {
				if(random == lotto[i])
				{
					tf = false;
				}
			}
			
			
			//3. 겹치지 않는다면 배열에 추가한다.
			if (tf) 
			{	
				lotto[lottoIndex] = random;
				lottoIndex = lottoIndex + 1;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		
		int[] lotto= new int[6];

		genLotto(lotto);
		
		for (int i=0; i<6; i++)
		{
			System.out.println(lotto[i]);
		}


		
	}

}
