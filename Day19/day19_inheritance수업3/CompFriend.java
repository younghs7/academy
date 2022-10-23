package day19_inheritance수업3;


// 회사 동료 (이름, 부서, 전화번호)
public class CompFriend {
	
	private String name;
	private String dept;
	private String phone;
	
	
//	----------------------------------------------------
	
	public CompFriend()
	{
		name = null;
		dept = null;
		phone = null;
	}
	
	public CompFriend(String name, String major, String phone)
	{
		this.name = name;
		this.dept = major;
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
		return dept;
	}

	public void setMajor(String major) {
		this.dept = major;
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
		System.out.println("전공 : "+ dept);
		System.out.println("전화번호 : "+ phone);
	}

}
