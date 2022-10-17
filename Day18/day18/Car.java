package day18;

public class Car {
	
	final static String company = "현대자동차";
	
	
	static final int Value;
	static {
		Value = 5*3;
	}
	

	
	
	
	
	String model;
	String color;
	int maxSpeed;
	
	
	public Car()
	{
		model = null;
		color = null;
		maxSpeed = 0;
	}
	
	public Car(String model)
	{
		this(model, "은색", 250);
//		Car(model, "은색", 250); 로는 호출이 안 된다.
	}
	
	public Car(String model, String color, int maxSpeed)
	{
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
