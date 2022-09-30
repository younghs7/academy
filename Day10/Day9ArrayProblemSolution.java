package day10;

public class Day9ArrayProblemSolution {

	
	public static void genLotto(int[] lot) {
		
		int index = 0; // 집어넣을 위치정보.
		int rn;
		boolean exist = false;
		//exist 플래그
		
		
		while(index < 6 ) 
		{
			//랜덤넘버를 구해.
			rn = ( (int)(Math.random()*45 ) ) + 1;
			exist = false;
			
			//겹치는 게 있는지 확인한다.
			for(int i =0; i <6; i++) 
			{
				if(rn == lot[i])
				{	
					//겹치는 값이 존재한다.
					exist = true;
					break;
					
					
				}
			}
			
			//겹치는 게 없다면
			if(exist == false)
			{
				lot[index] = rn;
				index++;
				
			/*
			 1. 나와 차이점: TF 변수명 exist
			 2. 변수명을 메모리를 할당한다는 용도만 있는 게 아니라, 
			 리더밸리티를 높이기 위한 용도도 있다.
			 
			 
			 */
				
				
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
