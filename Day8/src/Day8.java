
public class Day8 {
	
	
	public static void main(String[] args) {
		
		
//		int line = 10;
//		int star = 1;
//		
//		for (int i = 0; i < line; i++)
//		{
//			for (int k = 0; k < star; k++)
//			{
//				System.out.print("*");
//			}
//			
//			System.out.println();
//			star = star + 1;
//		}
		
		int line = 10;
		int star = 1;
		int space = 9;
		
		for (int i = 0; i < line; i++)
		{
			//1. 공백을 찍는다.
			for (int s = 0; s <space; s++)
			{
				System.out.print(" ");
			}
			space = space - 1;
			
			//2. 별을 찍는다.
			for (int k = 0; k < star; k++)
			{
				System.out.print("*");
			}
			star = star + 1;
			
			//3. 한 줄 뛴다.
			System.out.println();
		}
	
			
			/*
			 
			 */
			
			
			/*
			 1. algorithm을 구현것보다
			 2. 문제를 분해 배치하는 과정이 훨씬 중요하다.
			 
			MECE 관점으로 전체를 쪼깬 후에 그 쪼갠 요소들을 다시 쪼깬 결과물들로 전체를 조합하는 구조도를 인식해야한다. 
			1. 공백을 찍는다. ->(분해) ->(분해)
			2. 별을 찍는다. -> (분해) -> (분해)
			3. 한 줄을 뛴다. -> (분해) -> (분해)
			
			 
			 MECE(Mutually Exclusive Collectively Exhaustive의 약자, 상호배제와 전체포괄) = 미시 관점이라고도 말함.
			 여러 사람끼리 모여서 일을 하다보면, 말을 논리적으로 하고, 용어가 고급져보이면 그 사람 위주로 프로젝트가 진행된다.
			 원래 사람이란 게 그렇다. 그렇지 않은 사람은 그런 사람한테 끌려다닐 수 밖에 없다.
			 
			 용어를 잘 알아둬야 한다.
			 */
			
	
	}

}
