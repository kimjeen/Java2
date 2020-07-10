package pk30.lambda;

public class StringConcatTest {
	public static void main(String[] args) {

		String s1="Hello";
		String s2="World";
		
		//��ü ���� ���
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString("��ü���� : "+s1, s2);
		
		
		//���ٽ�(������ ����)
		StringConcat concat2 = (s,v)->System.out.println(s+" "+v);
		concat2.makeString("���ٽ� : "+s1,s2 );
		
		//�Ƴ��Ŭ����
		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1,String s2) {
				System.out.println("�͸��� Ŭ���� : "+s1+" "+s2 );
			}
		};
		concat2.makeString(s1, s2);
		
		
	}
}
