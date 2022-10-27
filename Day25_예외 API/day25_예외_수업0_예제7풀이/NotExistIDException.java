package day25_예외_수업0_예제7풀이;

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
