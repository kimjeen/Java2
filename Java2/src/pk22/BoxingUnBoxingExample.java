package pk22;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing �⺻Ÿ�� -> ��ü
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
//		Integer obj3 = new Integer.valueof("300");
		
		//unboxing ��ü -> �⺻Ÿ��, ��ü�� �⺻Ÿ������ ������ ����
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		
	}
	
}
