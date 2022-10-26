package day25_API_수업3_얕은clone;

public class Main_Clone {

	public static void main(String[] args) {

		
		
		
		Member mem1 = new Member("아이디", 1);
		Member mem2 = mem1.getMember();
		
		
		mem1.ar[0] = 10;
		
		System.out.println(mem2.ar[0]);
		
		
		

		
		
		
		
		
		
		
	}

}
