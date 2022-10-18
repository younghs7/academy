package day19수업3;

// 대학 동창(이름, 전공, 전화번호)

public class UnivFriend {
	
	private String name;
	private String major;
	private String phone;
	
	
//	----------------------------------------------------
	
	public UnivFriend()
	{
		name = null;
		major = null;
		phone = null;
	}
	
	public UnivFriend(String name, String major, String phone)
	{
		this.name = name;
		this.major = major;
		this.phone = phone;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	----------------------------------------------------
	
	public void showInfo()
	{
		System.out.println("이름 : "+ name);
		System.out.println("전공 : "+ major);
		System.out.println("전화번호 : "+ phone);
	}
	
}
