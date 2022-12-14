package day60_수7_JAVA_제네릭_연습문제;

class DoubleBox <L, R>  // <> 안에 들어가는 변수를 제네릭 변수, 템플릿 변수 라고 표현한다.
{						// 언어마다 관행이 다르나,
						/* 
						 * 자바에서는
						   E : Element
						   K : Key
						   N : Number
						   T : Type
						   V : Value
						   라는 관행이 있으며, 꼭 준수해야되는 것은 아니다.
						   
						   <> 안에는 프리미티브 타입은 못 온다.
						   기술적으로는 가능하나, 정책적으로 불가능하게 되어 있다. (c++ 같은 언어는 따지지 않지만 자바에서는 불가능하다)
						   그래서 primitive 타입을 쓰려면 wrapper class를 써야한다.
						   <> 안에는 오직 object 타입만 들어간다.
						 */
	private L left;
	private R right;
	
	
	public DoubleBox()
	{
		left = null;			// 아 초기화가 0과 null 두가지 방식이 생성자가 생성이 될 수 있나는 생각이 들었는데
		right = null;			// <> 안에는 object 타입만 들어갈 수 있으니 null만 되는구나.
	}
	
	public DoubleBox (L left, R right)  
	{
		this.left = left;
		this.right = right;
		
	}
	
	
	public void set(L left, R right)
	{
		this.left = left;
		this.right = right;
	}
	
	public L getLeft()
	{
		return left;
	}
	public R getRight()
	{
		return right;
	}

	@Override
	public String toString() {
		return "DoubleBox [left=" + left + ", right=" + right + "]";
	}

	
	
	
	
}


public class Main7 {

	public static void main(String[] args) {

		DoubleBox<Integer, String> box = new DoubleBox<Integer, String>();
//		를 ▼ 아래 두가지로 생략이 가능하다.
		DoubleBox box2 = new DoubleBox<Integer, String>();	// = 대입 연산의 오른쪽부터 실행되기 때문에 DoubleBox 형태를 알 수 있기 때문에
 															// 앞의 <> 부분을 생략할 수 있다.
		
		DoubleBox<Integer, String> box3 = new DoubleBox();  // 가 예전에는 오류였으나, 지금은 가능함.
														    // new BoubleBox(); 가 없는 경우 = 기준 오른쪽을 먼저 참조해서 
															// 실행하는 기술이 새로 생겼기 때문이다.
					
		
		// <> : 한국에서는 꺽쇄, 외국애들은 다이아몬드 기호라는 표현을 쓴다고 한다.		
		
		box.set(1, "정성훈");
		
		System.out.println(box.getLeft()  );				// "정성훈"
		System.out.println(box.getRight() ); 				// "1"
		System.err.println(box);
	}

}
