package pk29.staticex.inner;
class OutClass2{
	//�ʵ�
	int outNum=100;
	static int sNum=200;
	
	//���� �ϳ��� 
	Runnable getRunnable(int i) {//�Ű������� final�� ó���Ǿ� �ٸ� Ŭ�������� ������.
	int num=100; //������������ ���ȭ final 
	int localnum=10;
	//�͸��� Ŭ����
	return new Runnable() {
		
		@Override
		public void run() {
			System.out.println("localNumber : "+localnum+"������ �ν��Ͻ� ����");
			System.out.println("outNum : "+outNum+"�ܺ�Ŭ������ �ν��Ͻ� ����");
			System.out.println("OutClass-static : "+sNum+"+sNum �ܺ� Ŭ������ ��������");
			
		}
	};
	}

}
//���ο��� �۵����� ��ü
// Runnable runnable = new Runnable(){
//
//public void run() {
//	
//}
//}
public class AnonymousInnerTest {
	public static void main(String[] args) {

		OutClass2 out = new OutClass2();
		Runnable runner = out.getRunnable(10); 
		runner.run();
	}
}
