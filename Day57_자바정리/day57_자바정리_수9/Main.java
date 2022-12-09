package day57_자바정리_수9;

public class Main {

	public static void main(String[] args) {

		StringBuffer stbuf = new StringBuffer("1234");
		
		stbuf.append("ABC");
		System.out.println(stbuf);
		
		stbuf.delete(1, 3);
		System.out.println(stbuf);
		

	}

}
