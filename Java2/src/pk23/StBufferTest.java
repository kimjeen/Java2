package pk23;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		
		//���ڿ��� ����
		System.out.println(buf.length());
		//���ڿ��� �뷮 Ȯ��
		System.out.println(buf.capacity());
		//���ڿ��� �뷮 ����
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		
		//���ڿ��� ����.
		buf.insert(0, "Hi!");
		buf.insert(11," Everybody^^");
		System.out.println(buf);
		
		//�����
		buf.delete(0, 3);
		System.out.println(buf);
		
		
		
		
	}

}
