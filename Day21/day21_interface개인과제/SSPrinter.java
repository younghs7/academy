package day21_interface개인과제;

public class SSPrinter implements Printable {
	
		//프린터 초기화 기능
		public void initPrinter()
		{
			System.out.println("삼성 프린터 초기화");
		}
		
		//프린터 흑백인쇄 기능
		public void printBlack(String doc)
		{
			System.out.println("블랙인쇄: " +doc);
		}

	
}
