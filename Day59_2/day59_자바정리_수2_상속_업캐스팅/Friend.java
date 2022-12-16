package day59_자바정리_수2_상속_업캐스팅;

public class Friend {
	
	private String name;
	private String phoneNumber;
	

	public Friend() {
		name = null;
		phoneNumber = null;
	}
	
	
	public Friend(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void show()
	{
		System.out.println("이름:" + name);
		System.out.println("전화번호:" + phoneNumber);
	}
	
	
}
