package day59_자바정리_수a_clone;

class Point implements Cloneable // <--Cloneable은 내용이 없는 마커 인터페이스다. 클론이 가능하다는 의미이다.
{
	private double x;
	private double y;

	
	
//	생성자 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	public Point() {
		x = 0;
		y = 0;
	}
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}

// ▼ 여기만 보면 됨.
//	clone() ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
	
//	public Point clone()
//	{
//		Point cloned = new Point(this.x, this.y);
//		
//		return cloned;
//	}
	

	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		
		// return (Object)(new Point(this.x, this.y) );
		return super.clone();   // --> 여기서 super는 object를 의미, 원래 객체와 동일한 객체를 리턴한다.
	}
	
	
	
	
// ▲ 여기만 보면 됨.	
// setter, getter ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
	
	public void setX(double x)
	{
		this.x = x;
	}
	
	
	public void setY(double y)
	{
		this.y = y;
	}
	
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	
	
	
	
	
	
}