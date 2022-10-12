package day15문제1;

public class Student {
	
//	기본요구
	private String name;       //이름
	private String address;    //주소
	private Gender gender;             //성별
	private int number;                //학번
	private int[] score;               //성적
	
//	설계상
	private int subjectCount;          //과목수
	
	
	
	
//	1. 생성자를 만드세요. (기본생성자, 오버로딩된 생성자)
	public Student()
	{
		name = null;
		address = null;
		gender = null;
		number = 0;
		score = null;
		subjectCount = 0;
	}
	/*
	 자바가 자동적으로 null, 0으로 채워주지만,
	 ★생성자를 쓸 때는 모든 변수를 무조건 명시적으로 써줘야 한다. - 대형프로젝트
	 */
	
	public Student(String name, String address, Gender gender, int number)
	{
		this.name = name;
		this.address = address;
		this.gender = gender;
		this.number = number;
		score = null;
		subjectCount = 0;
	}

	
	
	
//	 2. 학생 정보를 입력하는 기능. (Getter/Setter는 기본, 다른방법도 강구)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number > 0)
		this.number = number;
	}

	public int getSubjectCount() {
		return subjectCount;
	}

	public void setSubjectCount(int subjectCount) {
		this.subjectCount = subjectCount;
	}
	

	
//	 4. 성적 총점, 평균을 구하는 함수.
	public int getTotalScore()
	{	
		int total = 0;
		for (int i = 0; i < score.length; i++)
		{
			total = total + score[i];
		}
		return total;
	}
	
	public int getScore(int subjectCode)
	{
		if ((subjectCode > (subjectCount - 1)) || //+로 오버하거나
			(subjectCode < 0) ||                  //-로 내려가거나
			(subjectCount == 0) )				// 시험을 보지 않았음.
		{
			return -1;
		}
		
		return score[subjectCode];
	}
	
	public boolean setScore(int[] score)
	{
		this.score = score;
	}
	
	public setScore(int subjectCode, int score)
	{
		
	}
	
	
	
	

}
