package day71_수5_람다_람다식활용_문제;

// 문제
// interface, lamda-expression을 이용하여 구구단을 출력하는 코드를 작성해보세요.

public class Main5 {

	public static void main(String[] args) {

		IGoogoodan ggd = (firstDan, lastDan) -> {
			
			for(int i = firstDan; i <= lastDan; i++)
			{
				for(int j = 1; j <= 9; j++)
				{
					System.out.println(i + " x " + j+" = " + j*i);
				}
			}
		};
		
		ggd.printGoogoodan(2, 2);
		
		
		
	}

}


interface IGoogoodan	// able 붙이기 까다로우면, 앞에 I붙이면 됨. 다만, 올드한 방식임.
{
	public void printGoogoodan(int firstDan, int lastDan);
}
