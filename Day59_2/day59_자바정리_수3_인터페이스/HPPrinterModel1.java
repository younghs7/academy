package day59_자바정리_수3_인터페이스;

public class HPPrinterModel1 implements Printable{

	@Override
	public boolean init() {
		System.out.println("HP-init");
		return false;
	}
	
	@Override
	public void print(String doc) {

		System.out.println("HP-print");
	}
	
	public void printVender()
	{
		System.out.println("HP");
	}
}
