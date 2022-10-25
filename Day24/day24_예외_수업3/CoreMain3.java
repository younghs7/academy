package day24_예외_수업3;

public class CoreMain3 {
	
	public static void func2(int n1, int n2)
	{
		int r = n1 / n2;
	}
	public static void func1(int n)
	{
		func2(n, 0);
	}

	public static void main(String[] args)
	{
		try {
			func1(5);
		}
		catch (Throwable e)
		{
			e.printStackTrace();
			
			return;
		}
		
		System.out.println("종료");
	}
	
	/*
	 main은 func1에 종속적이고
	 func1는 func2에 종속적이다.
	 */
	
}
