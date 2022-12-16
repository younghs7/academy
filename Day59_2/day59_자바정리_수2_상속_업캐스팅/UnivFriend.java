package day59_자바정리_수2_상속_업캐스팅;

public class UnivFriend extends Friend {
	
	private String major;
	
	public UnivFriend() 
	{
		super();
		String major;
	}
	
	public UnivFriend(String name, String phoneNumber, String major) 
	{
		super(name,phoneNumber);
		this.major = major;
	}
	
	
	
	public void setMajor(String major)
	{
		this.major = major;
	}
	
	public String getMajor()
	{
		return major;
	}
	
	
	public void show()
	{
		super.show();
		System.out.println("전공:" + major);
	}
	
	
	
	
	
	
	
	
	
	
	

}
