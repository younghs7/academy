package day19_inheritance개인과제2;

public class Friend {

	private String phone;
	
	
	
	public Friend() {
		super();
	}
	
	



	public Friend(String phone) {
		super();
		this.setPhone(phone);
	}





	public void showInfo()
	{
		System.out.println("friend 클래스");
	}





	public String getPhone() {
		return phone;
	}





	public void setPhone(String phone) {
		this.phone = phone;
	}

}
