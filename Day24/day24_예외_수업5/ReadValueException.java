package day24_예외_수업5;

public class ReadValueException extends Exception {
	
	public ReadValueException()
	{
		super("유효하지 않은 값입니다.");
	}

}
