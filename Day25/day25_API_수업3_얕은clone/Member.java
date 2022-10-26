package day25_API_수업3_얕은clone;

import java.util.Objects;

public class Member implements Cloneable {
	
	private String id;
	private int number;
	public int[] ar;
	
//	-------------------------------------------
	
	public Member()
	{
		id = null;
		number = 0;
		ar = new int[] {1, 2};
	}
	
	
	public Member(String id, int number)
	{	
		this.number = number;
		this.id = id;
		ar = new int[] {1, 2};
	}
	

//	-------------------------------------------
	
	public Member getMember()
	{
		
		Member cloned =null;
		
		try {
			cloned = (Member)clone();
			
		}
		catch(CloneNotSupportedException e)
		{
			
		}

		return cloned;
		
	
	}
	
	
	@Override
	public boolean equals(Object obj) 
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
