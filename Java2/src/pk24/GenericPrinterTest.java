package pk24;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//TŸ���� ��ü�� ��� Ŭ�������� ����� 
        //�����Ͽ� �ڵ����� Ŭ������ ����ȯ�� ������
		
		GenericPrinter<Powder> powderPrint= new GenericPrinter<Powder>();
		powderPrint.setMaterial(new Powder());
		Powder powder=powderPrint.getMaterial(); //����ȯ ���� ����.
		System.out.println(powder);
		System.out.println(powderPrint);
		
		
		GenericPrinter<Plastic> plasticPrint= new GenericPrinter<Plastic>();
		plasticPrint.setMaterial(new Plastic());
		Plastic plastic=plasticPrint.getMaterial(); //����ȯ ���� ����.
		System.out.println(plastic);
		System.out.println(plasticPrint);
		
//		GenericPrinter<Water> watertest = new GenericPrinter<Water>();
//		watertest.setMaterial(new Water());
//		Water water=watertest.getMaterial(); //����ȯ ���� ����.
//		System.out.println(water);
//		System.out.println(watertest);
		
		
	}

}
