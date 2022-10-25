package day24_예외_예제7;

public class NotExistIDException extends Exception{
	
	public NotExistIDException() 
	{
		super("아이디가 존재하지 X");
	}
	
	public NotExistIDException(String message)
	{
		super(message);
	}
	
	

}
