package Day12문제1;


//1. 학생(student) 클래스를 만드세요.
//		-이름, 학번
//		-국어성적, 영어성적, 수학성적
//		-총점 구하는 메소드
//		-평균을 구하는 메소드
//		-이름 및 학번을 리턴하는 메소드
//		-기타 추가적으로 필요한 메소드가 있다면 그것도 구현


public class Day12Class_문제1MainMy {

	public static void main(String[] args) {
		
		
		Student st = new Student();
		
		st.setName("아무개");
		st.set학번(-9);
		st.setKor(77);
		st.setEng(88);
		st.setMath(100);
		
		
		System.out.println("이름: "+st.getName());
		System.out.println("학번: "+st.get학번());
		System.out.println("국어점수: "+st.getKor());
		System.out.println("영어점수: "+st.getEng());
		System.out.println("수학점수: "+st.getMath());
		
		System.out.println("점수 합계: "+st.total());
		System.out.println("점수 평균: "+st.avg());
		
		

	}

}
