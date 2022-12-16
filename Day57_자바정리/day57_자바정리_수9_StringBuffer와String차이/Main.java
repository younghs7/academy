package day57_자바정리_수9_StringBuffer와String차이;

public class Main {

	public static void main(String[] args) {

		StringBuffer stbuf = new StringBuffer("1234");
		
		stbuf.append("ABC");
		System.out.println(stbuf);
		
		stbuf.delete(1, 3);
		System.out.println(stbuf);
		
		// String은 원본수정이 불가하다. StringBuffer는 원본이 수정된다.

	}

}
