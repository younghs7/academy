package day58_자바정리_수6_상속예제;

public class SuperClass {

	public SuperClass() {

		System.out.println("superclass()");
	}
	
}



class SubClass extends SuperClass{
	
	public SubClass() {
		System.out.println("subclass()");
	}	
}
