package day68_수7_어노테이션_예제;

public class Main7 {

	public static void main(String[] args) {

		// 어노테이션: 개발자가 컴파일러한테 알려주는 것.
		// 어노테이션을 다 아는 것은 불가능하다 --> 지금까지 배운 것보다 더 양이 많다.
		//									어노테이션을 사용자가 만들 수도 있다.
		// 어노테이션은 중요한 것 위주로 공부하면 된다.
		
		
		Viewer v = new Viewer();
		v.show();

		Viewer2 v2 = new Viewer2();
		v2.show("vesion1");
		v2.show2("vesion2");
		

	}
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// @Override Annotation
interface Viewable {
	public void show();
}

class Viewer implements Viewable
{
	@Override
	public void show() {	System.out.println("show");}
	
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// @Deprecated Annotation --> 우리가 쓸 일은 없으나 이렇게 되어 있는 것은 볼 수 있다
// 문제 발생 소지가 있거나 호환성 문제로 인해  개선된 기능으로 대체 되어 더 이상 필요하지 않음

interface Viewable2{
	@Deprecated
	public void show(String str);	// 쓴다고 에러가 나지는 않는다.
	public void show2(String str);
}
@Deprecated
class Viewer2 implements Viewable2
{

	@Deprecated
	public void show(String str) {
		System.out.println(str);
	}
	
	@Override
	public void show2(String str) {
		System.out.println(str);
	}
}

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 프레임워크은 어노테이션 범벅이다.
// 예를 들어, 로그인 함수를 프레임워크에게 알려줄 때 어노테이션을 이용한다.

// @UserLogin
// login()	{	}

// 프레임워크와 사용자가 통신을 할 때 컴파일러 정보(@어노테이션)를 이용한다. --> 사용자 사용성을 향상시키기 위해서이다.


