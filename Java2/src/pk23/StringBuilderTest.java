package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//�Һ�,immutable
		String javaStr = new String("java");
		// ó�� ��ü�� �ν���ȭ�� �޸𸮰�;
		System.out.println("����(javaStr)�� �޸� �ּ� : "+ System.identityHashCode(javaStr));
		
		//������ ���ΰ� �߰�Ȱ�����
		//ex)ȸ������ id�� ���ΰ� �߰� �۾��� �ϴ� ��.
		//String���κ��� StringBuilder�� ��ü ����.
		StringBuilder buffer = new StringBuilder(javaStr);
		
		//������ �̷������ �� ���� hash��.
		System.out.println("���� �� Buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		
		buffer.append(" and "); //�ε����� �ּҸ� �Ű澵 �ʿ䰡 ����.
		buffer.append("android");
		buffer.append(" Programming is fun1");
		System.out.println("���� �� Buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr�� ���ڿ� �ּ� : "+ System.identityHashCode(javaStr));
	}
}
