package day56_수6_자바정리_클래스_문제풀이;

// 은행 계좌
public class BankAccount {

// 문제)  아래 내용을 구현하시오.
	
// 잔액
// 최대 잔액
// 입금()
// 출금()
// 조회()
	
	// 은행 계좌와 관련된 데이터. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	private int balance;
	
	final int MAX_AMOUNT = 10000000;
	
	BankAccount()
	{
		balance = 0;
	}
	
	// 필기 제대로 못함
	// 필기 제대로 못함
	// 필기 제대로 못함
	// 필기 제대로 못함
	// 필기 제대로 못함
	
	// 다만, 입출금 메소드에서 처음에 가드 코드로 날려주는 것
	// private 으로 설정하는 것을 간과한 것.
	// 은 생각치 못한 부분이였다.
	
	// 은행 계좌와 관련된 메소드.  ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	// 입금
	// return : 잔액 (출금불가능일경우 -1)
	// paramter : 출금액
	public int deposit(BankAccount this, int amount)  // <
	{
		int temp = balance + amount;
		
		if(temp <= MAX_AMOUNT)
		{
			balance = balance + amount;
		}
		
		return -1;
	}
	
											
	
	// 출금
	// return : 잔액 (출금불가능일경우 -1)
	// paramter : 출금액
	public int withdraw(int amount)
	{
		if(balance >= amount)
		{
			balance-=amount;
			return balance;
		}
		
		return -1;
		
	}
}

	

	
