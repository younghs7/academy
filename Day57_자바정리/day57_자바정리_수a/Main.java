package day57_자바정리_수a;

public class Main {

	public static void main(String[] args) {


//	문제 ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		//url: "https://www.naver.com/index.html?id=admin&pw=1234"
		
		// class URLAnalyer
		
		// 1> 도메인 주소를 추출하시오.
		
		// 2> 부가정보를 추출하시오
			// id = admin
			// pw = 1234
			// 뒤에 추가적으로 더 붙는 경우를 상정해서 만들어볼 것
		
		// 이거 만드시면서... 우리가 배웠던, 그리고 각자 개인이 할 수 있는 최대한의 능력을 뽑아서 멋지게 만들어 봅시다.
		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// ★ 먼저 호출부 --> 구현부
		
		URLAnalyer url = new URLAnalyer("https://www.naver.com/index.html?id=admin&pw=1234");
		
		System.out.println( url.getURL() );
		
		String result = url.getParameterValueBy("id");
		System.out.println( result );
		
		String[] ParameterALL = url.getParameterALL();
		
		
		
		//프린트!
		for(int i = 0; i < ParameterALL.length; i++)
		{
			System.out.println( ParameterALL[i]);
		}
		
		
		/*
		강사님:
		 * 내용을 못 짜도 괜찮지만, 메인부에서 클래스 디자인하는 것은 해야한다.
		 * 그게 제일 중요하다.
		
		느낀 점:
		 * URL을 짜야한다고 했으면 제일 먼저 해야될 게 시간에 쫒겨서 코딩하는 게 아니라
		 * URL 구조부터 검색해봐야 했다.
		 * --> 1) parameter 를 추출하려면 ?와 # 사이에 있는 것을 subString으로 가져오고
		 *     2) split로 & 구분자로 배열로 만든 후에
		 *     3) 리턴하면 된다는 간단한 설계가 가능했을 것이다.
		 *     
		 * 시간에 쫓겨서 짜면, 실력이 빠르게 안 는다.
		 * 
		 *     
		 * 
		 */
		
		
		
		

	}

}
