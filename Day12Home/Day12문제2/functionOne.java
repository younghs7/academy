package Day12문제2;

public class functionOne {
	
	
	private double a = 0;
	private double b = 0;
	private double x1 = 0;
	private double x2 = 0;
	private double y1 = 0;
	private double y2 = 0;
	
	
	
	
	
	
	
// 좌표1 셋팅-----------------------------------------------------
	
	public double getX1() {
		return x1;
	}



	public void setX1(double x1) {
		this.x1 = x1;
	}
	
	public double getY1() {
		return y1;
	}



	public void setY1(double y1) {
		this.y1 = y1;
	}
	
	
	
// 좌표2 셋팅-----------------------------------------------------	
	
	public double getX2() {
		return x2;
	}



	public void setX2(double x2) {
		this.x2 = x2;
	}
	
	
	public double getY2() {
		return y2;
	}



	public void setY2(double y2) {
		this.y2 = y2;
	}

	
	
// 기울기 셋팅-----------------------------------------------------		
	
	public double getA() {
		return a;
	}


	public void setA(double a) {
		this.a = a;
	}

	


	//	1.한점의 좌표와 기울기를 입력--------------------------------------	
	public void XYA()
	{
	   b = y1-(a*x1);
	   
	   System.out.println("y= "+a+"x+"+b);
	}
	
	
	
//  2. 두점의 좌표를 입력-------------------------------------------
	public void XYXY()
	{
		a = (y1-y2)/(x1-x2);
		b = y1-a*x1;
		
		System.out.println("y= "+a+"x+"+b);
	}
	
	
	
}
