package day57_자바정리_수7_클래스_문제_2차방정식근구하기_풀이;

public class Main {

	public static void main(String[] args) {


		QuadraticEq q = new QuadraticEq(2, 4, -2);
		Root rt;
		boolean result = q.calcRoot();
		
		if (result == true)
		{
			rt = q.getRoot();
			System.out.println(rt.getRoot1());
		}
		
		
		
		
	}

}
