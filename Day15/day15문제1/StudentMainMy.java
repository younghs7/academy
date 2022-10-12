package day15문제1;

public class StudentMainMy {

	public static void main(String[] args) {

		
		StudentMy st1 = new StudentMy("아무개", "주소", "성별", 1992, 1111);
		StudentMy st2 = new StudentMy("아무개2", "주소", "성별", 1992, 1111);
		StudentMy st3 = new StudentMy("아무개3", "주소", "성별", 1992, 1111);
	
		
//		2번
		st1.setKorScore(80);
		st1.setEngScore(98);
		st1.setMathScore(100);
		st2.setScore(90, 95, 100);
		
//		3. 학생수가 몇명인지를 출력하는 함수
		StudentMy.PrintTheNumberOfStudent();
		
//		4. 성적 총점, 평균을 구하는 함수.
		st1.avgScore();
		
//		5. 미성년자인지 성년자인지 판단하는 함수(만 19세, 년도으로만) -----------
		st1.isAdult();
		
		st2.PrintStudentInfo();
		
		System.out.println(StudentMy.ERR);
		
	}

}
