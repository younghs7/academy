package day59_자바정리_수9_eqauls문제;

class Point     // public 안 붙이면 파란색 세모 표시 아이콘에 붙는다.
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
//	equals ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	
														// 깨달음:
	public boolean equals(Object obj)					// <-- 일단 어떤 객체든 집어넣으면 Object로 묵시적 형변환이 일어난다.
	{
		if(obj instanceof Point == true )
		{
			if( ( x == ((Point)obj).x ) && y == ((Point)obj).y )       // obj는 Object 클래스만 범위만 접근이 가능하기 때문에
			{														   // 원래 Point로 형변환하여 Point 필드에 접근해줄 수 있게 해야하기 때문에
				return true;										   // (Point)로 해야하는 것이다.
			}
		}												
		
		return false;		
	}													// // 설명할 때는 먼저 어떤 부분을 모르는지 물어보고나서 설명해야 되지 않겠나
														// 그냥 밑도 끝도없이 설명하니깐. 제대로 이해했는지도 모르겠고, 불필요한 설명을 할 수밖에 없다.
	
	
	
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