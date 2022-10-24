package day23_abstract수업2;

public abstract class Print {
	
	private int value;
	
//	-----------------------------------------
	
	public abstract void initPrinter();

	
//	-----------------------------------------
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
//	------------------------------------------
	
	/*
	 추상클래스는 abstract를 클래스와 메소드에 붙여야 한다.
	 */
	
	
	
	
}
