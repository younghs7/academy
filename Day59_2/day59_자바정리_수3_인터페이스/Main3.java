package day59_자바정리_수3_인터페이스;

public class Main3 {

	public static void main(String[] args) {

		Printable hpp = new HPPrinterModel1();
		
		hpp.init();
		hpp.print("doc");
		// hpp.printVender(); // --> 인터페이스에 없는 건 호출할 수 없다. 

		Printable ssp = new SSPrinterModel1();
		
		ssp.init();
		ssp.print("doc");
		
// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("인터페이스 업캐스팅ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Printable[] printers = new Printable[2];
		
		printers[0] = hpp;
		printers[1] = ssp;
		
		for(int i = 0; i < printers.length; i++)
		{
			printers[i].init();
			printers[i].print("doc");
		}
		
		// 요즘에는 인터페이스가 규약을 넘어서서 사용자 편의성까지 범위가 넓어졌다.
		// 클래스 자체를 파악할 필요없이 인터페이스만 알면, 그 클래스를 다룰 수 있기 때문이다.
		// 요즘에는 접근을 다 인터페이스로 한다. (업캐스팅)
		// 이렇게 하지 않으면 올드하다는 구식의 느낌이 있다.
		// --> 요즘 분위기는 클래스를 만들었는데 인터페이스가 없다? --> 뭐야 만들다만거야 뭐야? 이런 생각이 든다.
		// 그니까 요즘에는 인터페이스가 기본이다.
		
		
		
		
		
	}
}
