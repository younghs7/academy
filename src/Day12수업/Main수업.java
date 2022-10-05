package Day12수업;

public class Main수업 {

	public static void main(String[] args) {
		
		
		
		Student st1 = new Student(); //st1: 참조변수
//		
//		
//		st1.setName("정성훈");
//		st1.age = 40;
//		st1.avg = 100;
//		// 이런 식의 코드가 작동 되게끔 짜면 안 된다.
//		
//		
//		System.out.println(st1.name);
//		
		
		
		st1.name = "정성훈";
		st1.number = 1;
		st1.kor = 80;
		st1.eng = 70;
		st1.math = 90;
		
		System.out.println(st1.name);
		System.out.println(st1.number);
		System.out.println(st1.kor);
		System.out.println(st1.eng);
		System.out.println(st1.math);
		
//		st1.avg = 100; (쓰기)
//		System.out.println(st1.avg); (읽기)
//		private이면 둘 다 불가 
		
		
		
	
		
		
		
	}

}
