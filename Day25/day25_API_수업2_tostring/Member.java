package day25_API_수업2_tostring;

import java.util.Objects;

public class Member {
	
	private String id;
	private int number;
	
//	-------------------------------------------
	
	public Member()
	{
		id = null;
		number = 0;
	}
	
	
	public Member(String id, int number)
	{	
		this.number = number;
		this.id = id;
	}


//	---코드 제너레이터 사용----------------------------------------
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", number=" + number + "]";
	}
	
	
//	------------------------------------------
//	getter, setter는 무지성으로 하는 게 아니고
//	비지니스 로직에 맞춰서 작성해야한다.

	


	public String getId() {
		return id;
	}



	


	


	public void setId(String id) {
		this.id = id;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
}
