package day15수업;

public class Student {
	
	private String name;
	private int id;
	private int score;
	
	
	
	
	public int getScore() {
		return score;
	}




	public void setScore(int score) {
		this.score = score;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}



	// Constructor(생성자) : 객체를 초기화하는 특수한 함수
	// - 함수명이 객체의 이름과 같다
	// - 리턴형이 없다.
	// - 접근제어자(public, private ..)를 붙일 수 있다.
	
	//private 붙이면 main에서 접근 안 됨. 싱글 패턴에서 쓰기도 함 (패턴: 코딩에서의 패턴은 설계 관점에서 디자인 패턴) 디자인 패턴 검색하면 나옴
	public Student()
	{
		name = "noname";
		id = 0;
	}
	
	// 추가적인 생성자를 만들 수 있다.
	public Student(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public Student(String name, int id, int score)
	{
		this.name = name;
		this.id = id;
		this.score = score;
	}

}
