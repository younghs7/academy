package day57_자바정리_수6_클래스_문제_2차방정식근구하기;

public class QuadraticEquation {
	
	
	private double a;
	private double b;
	private double c;
	
	public QuadraticEquation() {
		a = 0;
		b = 0;
		c = 0;
	}
	
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	public double[] queryRoot()
	{
		double x1 = 0;
		double x2 = 0;
		double[] x = new double[2];
		
		x1 = ( -b + Math.sqrt( Math.pow(b, 2) -(4*a*c) )  ) / (2*a);
		x2 = ( -b - Math.sqrt( Math.pow(b, 2) -(4*a*c) )  ) / (2*a);
		
		x[0] = x1;
		x[1] = x2;
		
		return x;  
	}
	
	
//	getter, setter ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public void setA(double a)
	{
		this.a = a;
	}
	
	public void setB(double b)
	{
		this.b = b;
	}
	
	public void setC(double c)
	{
		this.c = c;
	}
	
	public double getA()
	{
		return a;
	}
	
	public double getB()
	{
		return b;
	}
	
	public double getC()
	{
		return c;
	}
	
	
	
}
