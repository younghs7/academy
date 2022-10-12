package day15문제1;

public class StudentMy {
	
	/*
	 학생 클래스
	 -이름, 주소, 성별, 생년월일
	 -학번, 성적(국어, 영어, 수학)
	 
	 세부조건
	 -과목은 변경 가능하다. (지금은 세과목이지만 추후에 과목수가 증가)
	 
	 1. 생성자를 만드세요. (기본생성자, 오버로딩된 생성자)
	 2. 학생 정보를 입력하는 기능. (Getter/Setter는 기본, 다른방법도 강구)
	 3. 학생수가 몇명인지를 출력하는 함수
	 4. 성적 총점, 평균을 구하는 함수.
	 5. 미성년자인지 성년자인지 판단하는 함수(만 19세, 년도으로만)
	 
	 4시 30분까지
	 */
	
	String name, adress, sex;
	int 생년, 생월일;
	int StNumber; //학번
	int 년도 = 2022;
	
	int[] score = new int[3]; // 0: 국어, 1: 영어, 2: 수학
	
	static int count;
	
	static String ERR = "정상작동";
	
	
	
	
//	1. 생성자를 만드세요. (기본생성자, 오버로딩된 생성자)------------------------
	public StudentMy()
	{
		count++;
	}
	
	public StudentMy(String name, String adress, String sex, int 생년, int 생월일)
	{
		count++;
		this.StNumber = 년도*1000 + count;
		this.adress = adress;
		this.name = name;
		this.sex = sex;
		this.생년 = 생년;
		this.생월일 = 생월일;
		
		
	}
	
	
	
	
	
////////////////////////////////////////////////////////////////////	
//	2. 학생 정보를 입력하는 기능. (Getter/Setter는 기본, 다른방법도 강구)
////////////////////////////////////////////////////////////////////
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int get생년() {
		return 생년;
	}
	public void set생년(int 생년) {
		this.생년 = 생년;
	}
	public int get생월일() {
		return 생월일;
	}
	public void set생월일(int 생월일) {
		this.생월일 = 생월일;
	}
	public int getStNumber() {
		return StNumber;
	}
	public void setStNumber(int stNumber) {
		StNumber = stNumber;
	}
	

	

	
//	과목점수 setter -----------------------------------------
	public void setKorScore(int korScore) {
		this.score[0] = korScore;
	}
	public void setEngScore(int EngScore) {
		this.score[1] = EngScore;
	}
	public void setMathScore(int MathScore) {
		this.score[2] = MathScore;
	}
	
//	합본
	public void setScore(int korScore, int engScore, int mathScore)
	{
		this.score[0] = korScore;
		this.score[1] = engScore;
		this.score[2] = mathScore;
	}
	
	
//	과목점수 getter -----------------------------------------
	
	public int getKorScore() {
		return score[0];
	}
	public int getEngScore() {
		return score[1];
	}
	public int getMathScore() {
		return score[2];
	}
	
	//수학,영어,국어 점수 배열 getter
	public int[] getScore() {
		return score;
	}
	
////////////////////////////////////////////////////////////////////
//	3. 학생수가 몇명인지를 출력하는 함수
////////////////////////////////////////////////////////////////////
	public static void PrintTheNumberOfStudent()
	{
		System.out.println("학교 학생수:" + count +"명");
	}
	
	
//	4. 성적 총점, 평균을 구하는 함수. ---------------------------------
	public int totalScore()
	{	
		int total = 0;
		for(int i =0; i < score.length; i++)
		{
			total = total + score[i];
		}
		
		return total;
	}
	
	public double avgScore()
	{
		double avg = 0;
		
		int total = totalScore();
		
		avg = (double)total/(double)score.length;
		
		return avg;
		
	}
	
//	 5. 미성년자인지 성년자인지 판단하는 함수(만 19세, 년도으로만) -----------
	
	public boolean isAdult()
	{
		if( (생년 <= 2003)&&(생년 >= 0) )
		{
			return true;
		}
		else if(생년 >2004)
		{
			return false;
		}
		else 
		{	
			ERR = "isAdult() 생년 입력값 오류";
			return true;
		}
	}
	
//	추가 6. 학생정보 print
	public void PrintStudentInfo()
	{
		System.out.println("----------------------");
		System.out.println("해당 학생 정보를 출력합니다.");
		System.out.println("학생 이름:" + name);
		System.out.println("학번: " + StNumber);
		System.out.println("주소: " + adress);
		System.out.println("생년월일: " + 생년 +"년"+생월일);
		System.out.println("국어: "+ getKorScore());
		System.out.println("영어: "+ getEngScore());
		System.out.println("수학: "+ getMathScore());
		
		totalScore();
		System.out.println("총점: "+totalScore());
		avgScore();
		System.out.println("평균 :" +avgScore());
		isAdult();
		System.out.println("성인 여부: "+ isAdult());
		
		System.err.println(ERR);
		
		
	}
}


