package pk29.staticex;

public class Main {

	public static void main(String[] args) {

		A a= new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		//static�̹Ƿ� ������ �������� �۵��ϹǷ� �����ڸ� �����Ҽ��� ����.
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
		//static�� ��ü�� ���� ���� ��
		c.field2=5;
		c.method2();
		//static �� ���� ���� ���� ��(static�� Ŭ���������� �����ͼ� ���°� ����.)
		A.C.field2=3;
		A.C.method2();
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
		
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
		
		
	}

}
