package day23_interface수업1;

public class SSPrinter implements Printable {
	
	//프린터 초기화 기능
	@Override
	public boolean initPrinter()
	{
		System.out.println("삼성 프린터 초기화");
		
		return true;
	}
	@Override
	//프린터 흑백인쇄 기능
	public boolean printBlack(String doc)
	{
		System.out.println("블랙인쇄: " +doc);
		
		return true;
	}

}
