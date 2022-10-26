package day25_예외_수업0_예제7풀이;

public class WrongPasswordException extends Exception {
	
	public WrongPasswordException()
	{
		super("패스워드가 잘못되었다.");
	}

	
	public WrongPasswordException(String message)
	{
		super(message);
	}

}
