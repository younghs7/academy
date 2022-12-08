package day56_수4_자바정리_클래스_예제;
public class Day56_수4_자바정리_클래스_Main {

	public static void main(String[] args) {
		
		
		BankAccount b1 = new BankAccount();
		// 클래스는 자료형이다. 데이터타입이다.
		BankAccount[] bankArray = new BankAccount[5];
		// 이렇게 만드는 경우는 때려죽여도 기본 생성자로 만들어진다.
		// 그래서 무조건 기본 생성자를 명시적으로 적어줘야만 하는 것이다.
		
		
		for(int i = 0; i < bankArray.length; i++)
		{
			System.out.println(bankArray[i]);
		}
		

	}

}
