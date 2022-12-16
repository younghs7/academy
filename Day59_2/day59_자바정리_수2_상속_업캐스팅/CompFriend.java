package day59_자바정리_수2_상속_업캐스팅;

public class CompFriend extends Friend {
	
	public String department;
	
	
	public CompFriend() {
		department = null;
	}
	
	public CompFriend(String name, String phoneNumber, String department) 
	{
		super(name,phoneNumber);
		this.department = department;
	}
	
	
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	
	public void show()
	{
		super.show();
		System.out.println("부서:" + department);
	}
	
	

}
