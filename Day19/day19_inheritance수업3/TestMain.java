package day19_inheritance수업3;

public class TestMain {

	public static void main(String[] args) {

		
		
		UnivFriend[] ufrns = new UnivFriend[3];
		CompFriend[] cfrns = new CompFriend[3];
		/*
		 배열이 참조값이 할당된 것이지, 객체가 할당된 건 아니다.
		 객체는 따로 할당되어야 한다.
		 */
		
		ufrns[0] = new UnivFriend("홍길동", "체육학", "1111-2222");
		ufrns[1] = new UnivFriend("이순신", "국방학", "2222-3333");
		ufrns[2] = new UnivFriend("최순실", "철학과", "444-44444");

		cfrns[0] = new CompFriend("김대중", "총무과", "2342-3324");
		cfrns[1] = new CompFriend("노무현", "비서과", "2342-3432");
		cfrns[2] = new CompFriend("박정희", "자재과", "0003-8938");
		
		for(int i = 0; i < ufrns.length; i++)
		{
			ufrns[i].showInfo();
		}
		
		for(int i = 0; i < cfrns.length; i++)
		{
			cfrns[i].showInfo();
		}
	}

}
