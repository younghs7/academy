package day59_자바정리_수a;

public class MainA {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Point pos1 = new Point(10, 20);
		Point pos2 = (Point)( pos1.clone() );
		
		pos2.setY(30);
		
		if(pos1.equals(pos2))
		{
			System.out.println("클론 실패");
		}
		else
		{
			System.out.println("클론 성공");
		}

	}

}
