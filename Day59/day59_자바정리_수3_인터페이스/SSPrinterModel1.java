package day59_자바정리_수3_인터페이스;

public class SSPrinterModel1 implements Printable {

	@Override
	public boolean init() {
	
		System.out.println("SS-init");
		return true;
	}
	
	@Override
	public void print(String doc) {
		
		System.out.println("SS-printer");
		
	}
	

	
	
}
