package day57_자바정리_수6_클래스_문제_2차방정식근구하기;

public class Main {

	public static void main(String[] args) {


		QuadraticEquation qe = new QuadraticEquation(1, 1, -6);  // <--허수값일 시 대응을 못한다. 
		
		double[] result  = qe.queryRoot();
		System.out.println(result[0]);
		System.out.println(result[1]);

	}

}
