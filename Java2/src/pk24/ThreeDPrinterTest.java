package pk24;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		ThreePrinter printer = new ThreePrinter();
		
		Powder p1= new Powder();
		printer.setMaterial(p1);
		
       
		Powder p2=(Powder)printer.getMaterial();

	}

}
