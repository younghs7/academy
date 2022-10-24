package day23_interface수업1;

public class Main {

	public static void main(String[] args) {

		Printable[] prns = new Printable[2];
		
		prns[0] = new HPPrinter();
		prns[1] = new SSPrinter();
		 
		
		prns[0].initPrinter();
		prns[1].printBlack("문서");
		
		


	}

}
