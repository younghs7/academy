package day19_inheritance개인과제2;


// 회사 동료 (이름, 부서, 전화번호)
public class CompFriend extends Friend{
	
	private String name;
	private String dept;
	
	
//	----------------------------------------------------
	
	public CompFriend()
	{	
		name = null;
		dept = null;
	}
	
	public CompFriend(String name, String major, String phone)
	{	
		super(phone);
		this.name = name;
		this.dept = major;
	}

	
	
//	----------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return dept;
	}

	public void setMajor(String major) {
		this.dept = major;
	}


	
//	----------------------------------------------------
	
	public void showInfo()
	{
		System.out.println("이름 : "+ name);
		System.out.println("전공 : "+ dept);
		System.out.println("전화번호 : "+ getPhone());
	}

}
