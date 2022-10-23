package day19_inheritance개인과제2;

public class TestMain {

	public static void main(String[] args) {

		
		Friend[] frns = new Friend[6];       //UnivFriend[] ufrns = new UnivFriend[3];
		                                     //CompFriend[] cfrns = new CompFriend[3];
		
		
		
		
//		frns[0] = new UnivFriend("홍길동", "체육학", "1111-2222"); //ufrns[0] = new UnivFriend("홍길동", "체육학", "1111-2222");
//		frns[1] = new UnivFriend("이순신", "국방학", "2222-3333"); //ufrns[1] = new UnivFriend("이순신", "국방학", "2222-3333");
//		frns[2] = new UnivFriend("최순실", "철학과", "444-44444"); //ufrns[2] = new UnivFriend("최순실", "철학과", "444-44444");
//		
//		frns[3] = new CompFriend("김대중", "총무과", "2342-3324"); //cfrns[0] = new CompFriend("김대중", "총무과", "2342-3324");
//		frns[4] = new CompFriend("노무현", "비서과", "2342-3432"); //cfrns[1] = new CompFriend("노무현", "비서과", "2342-3432");
//		frns[5] = new CompFriend("박정희", "자재과", "0003-8938"); //cfrns[2] = new CompFriend("박정희", "자재과", "0003-8938");
		
		frns[0] = new UnivFriend("홍길동", "체육학", "1111-2222"); //ufrns[0] = new UnivFriend("홍길동", "체육학", "1111-2222");
		frns[1] = new UnivFriend("이순신", "국방학", "2222-3333"); //ufrns[1] = new UnivFriend("이순신", "국방학", "2222-3333");
		frns[2] = new UnivFriend("최순실", "철학과", "444-44444"); //ufrns[2] = new UnivFriend("최순실", "철학과", "444-44444");
		
		frns[3] = new CompFriend("김대중", "총무과", "2342-3324"); //cfrns[0] = new CompFriend("김대중", "총무과", "2342-3324");
		frns[4] = new CompFriend("노무현", "비서과", "2342-3432"); //cfrns[1] = new CompFriend("노무현", "비서과", "2342-3432");
		CompFriend co1	= new CompFriend("박정희", "자재과", "0003-8938"); //cfrns[2] = new CompFriend("박정희", "자재과", "0003-8938");
		frns[5] = co1;
		
		co1.setName("상위클래스, 하위클래스 각각 만들면 되네?");
		
		
//		Friend frns1 = new UnivFriend("홍길동", "체육학", "1111-2222");
		
		// 하위 클래스 참조값을 상위 클래스 배열에 담을 수 있다. ex) Friend frns = new UnivFriend();
		// Friend[] frns = new Friend[6]; -> 참조 type을 담을 배열 6개 만들어라. 
		// int[] frns = new int[6]; 랑 똑같이 하나 당 메모리 4byte 생성하는 거지.
		
//		?? 근데 이렇게 하면 하위 객체 데이터에 어떻게 접근해야 되나?;
//		정답:
		UnivFriend uni = (UnivFriend) frns[0];
		uni.setName("setName()수정됨");
		
		
		/*
		 느낀 점:
		 1. 상속을 쓰기 전에는 2개 배열로 관리해야 했는데, 상속을 쓰면 상위 클래스 배열 1개로 관리가 가능하다.
		 2. 상위 클래스 배열 한개에 여러가지 하위 클래스를 담을 수 있다.
		 3. main에서 사용하는 사용자는 상위 클래스 메소드명 하나만 알아도 나중에 파생되는 여러 하위객체의 메소드를 찾아볼 필요없이 쓸 수 있다.
		 4. 코드가 짧아진다.
		 
		 그래서 편하게 느껴졌다.
		 */
		
		
		for(int i = 0; i < frns.length; i++)  
			frns[i].showInfo();
		
		
//		for(int i = 0; i < ufrns.length; i++)
//		{
//			ufrns[i].showInfo();
//		}
//		
//		for(int i = 0; i < cfrns.length; i++)
//		{
//			cfrns[i].showInfo();
//		}
		
		
		
	
	}

}
