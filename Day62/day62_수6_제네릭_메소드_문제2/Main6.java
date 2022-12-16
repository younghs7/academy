package day62_수6_제네릭_메소드_문제2;

public class Main6 {

	
	public static <T extends Number> double add1(T num1, T num2)
	{		
		return num1.doubleValue() + num2.doubleValue();
	}
	
	
// 내가 푼 것 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
//	public static <T extends Number> T add2(T num1, T num2)
//	{
//		if(num1 instanceof Double == true)
//		{
//			Double result = num1.doubleValue() + num2.doubleValue();
//			
//			return (T) result;
//		}
//		else if(num1 instanceof Integer == true)
//		{
//			Integer result = num1.intValue() + num1.intValue();
//			
//			return (T)result;
//		}
//		
//		return null;
//
//	}
	
	
// 풀이 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public static <T extends Number> T add2(T a1, T a2)
	{
		T result = null;

// 3가지 방법 ㅡㅡㅡㅡ getClass(), instanceof, getClass().getName().equals()
		
		if(a1.getClass() == Integer.class)
//		if( a1.getClass().getName().equals("java.lang.Integer") == true )
		{	
			result = (T)(Integer)( (Integer)a1 + (Integer)a2 ); 
		}
		else if(a1 instanceof Double)
		{
			result = (T)(Double)( (Double)a1 + (Double)a2 );
		}
	
		
		
		
		
		
		
		
		
		return result;

	}


	
	public static void main(String[] args) {

		
		
// 문제 1 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
//		Integer a1 = 1;
//		Integer a2 = 2;
//		
//		double k = add1(a1, a2);
//			System.out.println(k);
//		
//		Double d1 = 1.0;
//		Double d2 = 2.0;
//		
//		double z = add1(d1, d2);
//			System.err.println(z);
		
		
		
// 문제 2 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
	
	
		
		// 타입 1		
		Integer a1 = 1;
		Integer a2 = 2;
	
		
		Integer k = add2(a1, a2);
			System.out.println(k);
		Double d1 = 1.0;
		Double d2 = 2.0;
		
		Double z = add2(d1, d2);
			System.out.println(z);
			
		System.out.println(z.getClass());	
		
		if( z.getClass().getName() == "java.lang.Double" )
		{
			System.out.println("같아");	          // 같아 뜸.
			
		}
		else
		{
			System.out.println("달라");
		}
		
		
		
		if( z.getClass() == Double.class)
		{
			System.out.println("같아");	          // 같아 뜸.
			
		}
		else
		{
			System.out.println("달라");
		}
		
			

	}

}
