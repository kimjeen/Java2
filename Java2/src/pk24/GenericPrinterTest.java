package pk24;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//T타입의 객체는 모든 클래스에서 상속이 
        //가능하여 자동으로 클래스로 형변환이 가능함
		
		GenericPrinter<Powder> powderPrint= new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		Powder powder=powderPrint.getMaterial(); //형변환 하지 않음.
		System.out.println(powder);
		System.out.println(powderPrint);
		
		
		GenericPrinter<Plastic> plasticPrint= new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic=plasticPrint.getMaterial(); //형변환 하지 않음.
		System.out.println(plastic);
		System.out.println(plasticPrint);
		
//		GenericPrinter<Water> watertest = new GenericPrinter<Water>();
//		watertest.setMaterial(new Water());
//		Water water=watertest.getMaterial(); //형변환 하지 않음.
//		System.out.println(water);
//		System.out.println(watertest);
		
		
	}

}
