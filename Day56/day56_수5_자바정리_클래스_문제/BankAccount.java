package day56_수5_자바정리_클래스_문제;

// 은행 계좌
public class BankAccount {

// 문제)  아래 내용을 구현하시오.
	
// 잔액
// 최대 잔액
// 입금()
// 출금()
// 조회()
	
	// 은행 계좌와 관련된 데이터. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	String ID;
	String name;
	int balance;
	
	static int MaxBalance;
	
	BankAccount()
	{
		ID = null;
		name = null;
		balance = 0;
	
	}
	
	
	BankAccount(String ID, String name, int balance)
	{
		this.ID = ID;
		this.name =  name;
		this.balance = balance;
	}
	
	
	
	// 메소드. ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	// 입금
	// return : 잔액 (출금불가능일경우 -1)
	// paramter : 출금액
	public int deposit(BankAccount this, int amount)
	{
		balance = balance + amount;
		
		return balance;
	}
	
									
	
	// 출금
	// return : 잔액 (출금불가능일경우 -1)
	// paramter : 출금액
	public int withdraw(int amount)
	{
		balance = balance + amount;
		return  balance;
	}
	

	
	
	// getter, setterㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	// 잔액 조회
	public int getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public String getID()
	{
		return ID;
	}
	

}
