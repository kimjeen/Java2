package pk22;

public class StringEqualsSample02 {
	public static void main(String[] args) {
		
	String str1 = new String("abc");
	String str2 = new String("abc");
	
	// �� String �ν��Ͻ� �ּҰ�(heap)�� �ٸ�
	System.out.println(str1==str2); 
	// String Ŭ������ equals �޼ҵ尡 ������ �Ǿ� ���� ���� ������ ����.
	System.out.println(str1.equals(str2)); 
	
	//Integer i1=100;
	Integer i1 = new Integer(100);
	Integer i2 = new Integer(100);
	
	System.out.println(i1==i2);
	System.out.println(i1.equals(i2));
	
	
	
	}
}
