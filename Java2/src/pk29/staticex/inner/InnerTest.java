package pk29.staticex.inner;

//���� Ŭ���� �ۼ�
class OutClass{
	//�ʵ�(�ν��Ͻ�����,�������,�Ӽ�)
	private int num=10; //heap
	private static int sNum=20; //data
	private InClass inClass; //���� Ŭ������ ����ó�� Ȱ���ϱ� ���� ����
	
	//������
	public OutClass() {
		//����Ŭ���� ����
		inClass = new InClass();
		System.out.println("OutClass�� ��ü�� �����Ǿ����ϴ�.");
		System.out.println();
	}
	class InClass{
		//����Ŭ������ �ʵ�
		int inNum=100;
		/* �ܺο� �ν��Ͻ� ������ ����Ǿ� �ִ� static������ �޼ҵ带 ������� ����ϴ°� ����������
		 * ������ �ǰ� ������� ����ؾ� �ϴ� staticŸ���� ������ �ٸ� ������ ������ �Ҽ� ����.*/
//		static int sNum=300;
//		static int sInNum=200;
//		static void sTest() {}
		
		//�޼���
		void inTest() {
			System.out.println("OutClass num = "+num+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = "+sNum+"(�ܺ� Ŭ������ static ����)");
			System.out.println("OutClass inNum = "+inNum+"(���� Ŭ������ �ν��Ͻ� ����)");
		}
		
	}
	static class InStaticClass{
		//�ʵ�
		int inNum=100;
		static int sInNum=200;
		void inTest() {
//			num=10; //�ܺ��� �ν��Ͻ�,������.
		System.out.println("InStaticClass inNum = "+inNum+" (���� Ŭ������ �ν��Ͻ� ����)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(���� Ŭ������ static ����)");
		System.out.println("OutClass sNum = "+sNum+" (�ܺ� Ŭ������ static ����)");
		}
	static void sTest() {
		//�ν��Ͻ� ���� ��� �Ұ�
//		num+=10; 
//		inNUm+=10;
		sNum=30;
		System.out.println("�ܺ�Ŭ���� static���� sNum = "+sNum);
		System.out.println(sInNum);
	}
	
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
		//�ܺ�Ŭ���� ��ü ����
		OutClass outclass = new OutClass();
		
		//�ܺ� Ŭ������ �̿��Ͽ� �̳�Ŭ���� ��ü ����
		OutClass.InClass inclass = outclass.new InClass();
		System.out.println("�ܺ� Ŭ���� ������ �̿��Ͽ� ���� Ŭ���� ����");
		inclass.inTest();
		System.out.println();
		
		//�ܺ�Ŭ������ �������� �ʰ� �ٷ� ���� ����Ŭ���� ��ü ����
		OutClass.InStaticClass instaticclass = new OutClass.InStaticClass();
		System.out.println("===== ���� ���� Ŭ���� �Ϲ� �޼��� ȣ�� =====");
	
		instaticclass.inTest();
		System.out.println();
		System.out.println("===== ���� ���� Ŭ���� static �޼��� ȣ�� =======");
		//Ŭ�������� ȣ��
		OutClass.InStaticClass.sTest();
		//��ü���� ȣ��
		instaticclass.sTest();

	}

}
