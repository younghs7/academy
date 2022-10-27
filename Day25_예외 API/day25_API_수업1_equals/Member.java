package day25_API_수업1_equals;

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


//	--코드 제너레이터(배우는 단계는 비추)--------------------------------------
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, number);
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		return Objects.equals(id, other.id) && number == other.number;
//	}
	
//	-------------------------------------------
	
	@Override
	public boolean equals(Object obj) // 모든 클래스 참조형을 받기 위해 object 클래스 참조형으로 받음.
	{
		if(obj instanceof Member)
		{
			Member mem = (Member)obj;
			if ( (this.id.equals(mem.id) ) &&
				 (this.number == mem.number) )
				
			{
				return true;
			}
		}

		return false;
	}
	
	//Override 안 된 것.
	public boolean equal(Object obj) // 모든 클래스 참조형을 받기 위해 object 클래스 참조형으로 받음.
	{
		if(obj instanceof Member)
		{
			Member mem = (Member)obj;
			if ( (this.id.equals(mem.id) ) &&
					(this.number == mem.number) ) 
					
			{
				return true;
			}
		}
		
		return false;
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
