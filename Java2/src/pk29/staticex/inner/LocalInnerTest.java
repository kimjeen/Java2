package pk29.staticex.inner;

class OutClass1{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	
	//���� �ϳ��� �޼ҵ常 �Ҵ�(Runnable)
	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ������.
	int num=100; //������������ ���ȭ final 
	
	//�޼��� ���ο� Ŭ������ ����
	class MyRunnable implements Runnable {
		int localnum=10;
		
			public void run() {
//			num=200;
			System.out.println("localNumber : "+localnum+"������ �ν��Ͻ� ����");
			System.out.println("outNum : "+outNum);
			System.out.println("OutClass-static : "+sNum+"+sNum �ܺ� Ŭ������ ��������");
			}
	}
	return new MyRunnable();
	}
}
public class LocalInnerTest {
	public static void main(String[] args) {
		
		OutClass1 out = new OutClass1();
		Runnable runner = out.getRunnable(10); 
		runner.run();

	}

}
