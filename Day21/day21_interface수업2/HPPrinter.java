package day21_interface수업2;

//	public class subClass extends superClass 
	//subClass는 superClass를 확장한다.

public class HPPrinter implements Printable{
//	HPPrinter는 printable을 구현한다.

	public HPPrinter()
	{
		
	}
	
	// 프린터 초기화 인터페이스
	@Override
	public boolean initPrinter()
	{
		System.out.println("initPrinter");
		
		return true;
	}
	@Override
	// 흑백 인쇄 인터페이스
	public boolean printBlack(String doc)
	{
		System.out.println("printBlack" + doc);
		
		return true;
	}


}
