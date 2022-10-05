package Day12수업;


// 무조건 접근 제어자 붙여야함. 변수, 메소드, 클래스
// public, private, protected, default(생략가능) -> 아무것도 안 쓴 건 default
public class Student {
	
	// data
	public String name; 	 // 이름
	public int number; 	 // 번호
	public int kor;		 // 국어성적
	public int eng; 		 // 영어성적
	public int math;    	 // 수학성적
	private int avg;   	     // 평균
	
	//method
	void setName(String _name)
	{
		
		this.name = _name;  //name = name; 이라고 해도 잘 돈다. 이유: this를 생략하더라도 this는 생긴다.
		
	}
	
	void dummy(Student this) // (Student this) <- 입력을 안 해도 preprocesser가 파라미터로 class this(참조값) 변수를 넣어준다. 
	{
		System.out.println(kor); // this.kor 생략한 것 -> preprocesser가 this. 를 붙여줌
	}


	
	//모든 메소드는 this를 가지고 있다.
	//new가 할당되는 순간 this가 결정된다. 

}




