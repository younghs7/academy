package day19_inheritance개인과제2;

// 대학 동창(이름, 전공, 전화번호)

public class UnivFriend extends Friend{
	
	private String name;
	private String major;
	
	
	
//	----------------------------------------------------
	
	public UnivFriend()
	{
		name = null;
		major = null;
	
	}
	
	public UnivFriend(String name, String major, String phone)
	{	
		super(phone);
		this.name = name;
		this.major = major;
	
	}

	
	
//	----------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}


	
//	----------------------------------------------------
	
	public void showInfo()
	{
		System.out.println("이름 : "+ name);
		System.out.println("전공 : "+ major);
		System.out.println("전화번호 : "+ getPhone());
	}
	
}
