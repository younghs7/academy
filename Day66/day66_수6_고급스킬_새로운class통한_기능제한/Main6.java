package day66_수6_고급스킬_새로운class통한_기능제한;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main6 {

	public static void main(String[] args) {
		
		
//	인터페이스를 구현 안해도 동작은 할 거 같은데, 인터페이스를 구현한 이유 물어보기.  	
		// 답변 : 인터페이스를 넣으면
		// ▶ 1. 편의성 --> 내부 구현을 보지 않고, 인터페이스만 보고 사용할 수 있게 됨 (이제는 인터페이스 안 주면, 왜 이렇게 만들어 이런 소리가 나온다)
		// ▶ 2. 규약 
		// --> ㅇ
		
		
		Deque<String> deq = new ArrayDeque<String>();
		
		// 1. myStack객체를 만든다.
		IStack<String> stack = new MyStack<String>(deq);
		
		// 2. push()를 이용해서 5개 정도 데이터를 넣어보세요.
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		
		// 3. pop()을 이용해서 데이터를 빼보세요.
		
		System.out.println(stack.pop());	// e
		System.out.println(stack.pop());	// d
		System.out.println(stack.pop());	// c
		System.out.println(stack.pop());	// b
		System.out.println(stack.pop());	// a
		System.out.println(stack.pop());	// null

	}

}


interface IStack<E>	// ◀ 뒤에 able 대신 앞에 I를 붙여서 인터페이스임을 나타내는 경우가 많다.
{
	public boolean push(E item);
	
	public E pop();
	
}





class MyStack<E> implements IStack<E>
{
	private Deque<E> deq;
	
	public MyStack() 
	{
		this.deq = null;
	}
	public MyStack(Deque<E> deq) 
	{
		this.deq = deq;
	}
	
	
	public boolean push(E item)
	{
		return deq.offerFirst(item);	
	}
	public E pop()
	{
		return deq.pollFirst();
	}
}