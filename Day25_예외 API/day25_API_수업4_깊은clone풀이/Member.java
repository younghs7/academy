package day25_API_수업4_깊은clone풀이;

import java.util.Arrays;

public class Member implements Cloneable{
	
	public String name;
	public int age;
	public int[] scores;
	public int[] ar;
	
	
//	------------------------------------------------
	
	public Member(String name, int age, int[] scores, int[] ar)
	{
		this.name = name;
		this.age =age;
		this.scores = scores;
		this.ar = ar;
	}

//	------------------------------------------------
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//1. thin clone을 만든다.
		Member cloned = (Member)super.clone();
		
		//2. deep clone을 만든다. 
		
		//2-1. 객체 그릇을 새로 만든다
		cloned.ar = new int[this.ar.length];
		
		//2-2. 객체 그릇에 옮겨 담는다. (for문으로 복사한다)
		for(int i = 0; i < this.ar.length; i++)
		{
			cloned.ar[i] = this.ar[i];
		}
		
		//3. 카피된 객체 참조값을 리턴한다.
		return cloned;
		
	}
	
	public Member getMember()
	{
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} 
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		
		return cloned;
	}
	
//	------------------------------------------------
	
	
}
