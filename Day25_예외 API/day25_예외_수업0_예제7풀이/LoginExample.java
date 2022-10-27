package day25_예외_수업0_예제7풀이;

public class LoginExample {

	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException
	{
		if(false == id.equals("blue")) // !id.equals("blue"), false == id.equals("blue") 같은 의미  
		// false == id.equals("blue") 가 더 보기 편하다.
		{
			//NotExistIDException 예외를 발생
			throw new WrongPasswordException();
		}
		
		if (false == password.equals("12345"))
		{
			//WrongPasswordException 예외 발생
			throw new WrongPasswordException();
		}
		
	}
	
	public static void main(String[] args) {

		try {
			login("white", "12345");
			
		}
		catch(NotExistIDException e)
		{
			System.out.println(e.getMessage());
		}
		catch(WrongPasswordException e)
		{
			System.out.println(e.getMessage() );
		}
		
		

	}

}
