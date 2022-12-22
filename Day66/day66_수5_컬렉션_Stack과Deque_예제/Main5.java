package day66_수5_컬렉션_Stack과Deque_예제;

import java.util.*; // 바이트도 커지고, 컴파일 속도도 느려진다. 
					// 그래서 * 은 권장하지 않는다.
public class Main5 {


	public static void main(String[] args) {

		// Stack은 스토리가 있다. 
		
		// Stack<String> stack = new Vector<>();
		
		// ▲
		// 쓰레드 세이프티 하지도 않고, 보안성에 약간 문제가 있었다.
		// 지금은 호환성때문에 남겨만 두고 실제로 쓰지는 않는다.
	
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		Deque<String> deq = new ArrayDeque<>();		// ◀ ArrayDeque는 Deque 전용이다.
		Deque<String> deq2 = new LinkedList<>();	// ◀ 이렇게 써도 된다. 다만, ArrayDeque로 생성하면 Deque 기능을 확장해서 쓸 수 있음.
		
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
		
		System.out.println(deq.pollFirst());	// C
		System.out.println(deq.pollFirst());	// B
		System.out.println(deq.pollFirst());	// A
		System.out.println(deq.pollFirst());	// null
		
		// 이렇게 Stack을 구현할 수 있다.
		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");

		System.out.println(deq.pollFirst());	// C
		System.out.println(deq.pollLast());		// A
		System.out.println(deq.pollFirst());	// B
		System.out.println(deq.pollFirst());	// null

		// First, Last 섞어서 쓰는 것도 가능하다. 
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		// 고급 기법:
		// 이 예제의 문제점은 
		// 1. 이 기능이 Stack인지 코드를 보고 알기 어렵다는 점이다.
		// 2. Stack을 구현했는데 Stack기능에 있으면 안 되는 Last에 대한 제약이 없다.
		
		// 그래서 수6에서 고급기법을 구현함.
		
	}

}
