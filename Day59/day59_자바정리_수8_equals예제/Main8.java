package day59_자바정리_수8_equals예제;

import java.util.Objects;

class INum
{
	private int num;
	
	public INum(int num)
	{
		this.num = num;
	}
	
	public int getNum()
	{
		return this.num;
	}
	
	
	// 내가 푼 것
	public boolean equal(INum n)
	{
		if(this.num == n.num)
			return true;
		else
			return false;
	}
	
	
	// 강사님 풀이
	@Override
	public boolean equals (Object obj)
	{
		if(obj instanceof INum)
		{
			if (this.num == ((INum)obj).getNum()  )
			{
				return true;
			}	
		}
		
		return false;
		
	}
	

	
// 자동 완성 equals
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		INum other = (INum) obj;
//		return num == other.num;
//	}
//	
	
	
	
	
	
	
	
	
}


public class Main8 {

	public static void main(String[] args)
	{		
		
// == ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		String a = new String("a");
		String b = new String("a");
		
		if (a == b)
		{
			System.out.println("두 문자열은 같습니다."); // 안 뜬다. ==은 참조값을 비교하기 때문이다.
		}
		else {System.out.println("달라요! ( == 은 참조값을 비교한다)");}
	
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		INum a2 = new INum(5);
		INum b2 = new INum(5);
		
		if (true == a2.equal(b2)) 
		{
			System.out.println("같아요 (따라서 equals()를 사용한다)");
		}
	
		
		
		
		
		
		
	}
	
}
