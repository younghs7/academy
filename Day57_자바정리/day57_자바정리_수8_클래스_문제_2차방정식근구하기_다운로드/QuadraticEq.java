package day57_자바정리_수8_클래스_문제_2차방정식근구하기_다운로드;


class Root
{	
	private double root1;
	private double root2;
	
	
	public Root() 
	{
		root1 = 0;
		root2 = 0;
	}
	
	public Root(double root1, double root2) 
	{
		this.root1 = root1;
		this.root2 = root2;
		
	}
	
	public double getRoot1()
	{
		return root1;
		
	}
	
	public double getRoot2()
	{
		return root2;
		
	}
	
}

public class QuadraticEq {
	
	private Root root;
	private double a;
	private double b;
	private double c;

	public QuadraticEq()
	{
		root = null;
		a = 0;
		b = 0;
		c = 0;	
	}
	
	public QuadraticEq(double a, double b, double c)
	{
		root = null;
		this.a = a;
		this.b = b;
		this.c = c;	
	}
	
	public boolean calcRoot()
	{
		double root1;
		double root2;
		double d = (b*b) - (4*a*c); 
				
		if (d < 0)
			return false;
		
		root1 = (-b + Math.sqrt(d)) / (2*a);
		root2 = (-b - Math.sqrt(d)) / (2*a);
		
		
		root = new Root(root1, root2);
		
		return true;
	}
	
	public Root getRoot()
	{
		Root temp = new Root(root.getRoot1(), root.getRoot2());
		return temp;
		
	}
	

}
