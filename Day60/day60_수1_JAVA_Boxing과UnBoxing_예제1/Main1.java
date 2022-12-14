package day60_수1_JAVA_Boxing과UnBoxing_예제1;

public class Main1 {

	public static void main(String[] args) {
//
//		Integer iInst = new Integer(3);       // ㅡㅡㅡ 이 쳐져있는 이유: 왠만하면 쓰지말라는 것
//		Double dInst = new Double(3.14);	  
//		
//		int a = iInst.intValue();
//		
//		System.out.println(iInst);
//		System.out.println(a);
//		System.out.println(dInst);
//		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");		
		
		// 자바에서는 명시적 Boxing과 UnBoxing을 쓰지말 것을 권장한다. 아래와 같이 auto로 처리하게끔 권장함.

		Integer iObj = 10;
		
		System.out.println(iObj);    // 10
		
		int i = iObj;  // <-- 자동으로 자바에서 변환해준다.
		int i2 = iObj.intValue();
		
		System.out.println(i);		// 10
		System.out.println(i2);		// 10
		

	}

}
