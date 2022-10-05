package Day12문제2;


//1차함수 출력하는 클래스를 만드세요.
/*
입력: 
	1> 한점의 좌표와 기울기를 입력
	2> 두점의 좌표를 입력
	
출력:
	"y=ax+b" 형태로 출력.
*/  
  
public class Day12Class_문제2MainMy {

	public static void main(String[] args) {
		
		functionOne f = new functionOne();
		
		
		
		//좌표1 (x1, y1)
		f.setX1(1);
		f.setY1(2);
		
		//좌표2 (x2, y2)
		f.setX2(3);
		f.setY2(4);
		
		//기울기a
		f.setA(2);
		
		System.out.println("기울기: "+f.getA());
		System.out.println("좌표1: ("+f.getX1()+", "+f.getY1()+")" );
		System.out.println("좌표2: ("+f.getX2()+", "+f.getY2()+")" );
		f.XYA();

		f.XYXY();
			
	
		
		
	}

}
