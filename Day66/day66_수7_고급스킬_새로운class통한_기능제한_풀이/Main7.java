package day66_수7_고급스킬_새로운class통한_기능제한_풀이;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main7 {

	public static void main(String[] args) {
		
		
// ▼ 차이는 여기에서만 차이나고 나머지 동일 (수6과 동일) ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		
		// 1. myStack객체를 만든다.
		IStack<String> stack = new MyStack<String>(new ArrayDeque<String>());
		
// ▲ ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
		
		
		
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