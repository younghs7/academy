package day24_예외_예제7;

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
