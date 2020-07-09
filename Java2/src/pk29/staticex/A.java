package pk29.staticex;

public class A {
	A(){
		System.out.println("A��ü�� ������");
	}
	//inner class �߿��� �ν��Ͻ� ��� Ŭ����
	//�θ����� �ϴ� AŬ�������� inner class �ȿ��� static �����Ҽ��� ����.
	public class B {
		//constructor
		B(){
			System.out.println("B��ü�� ������");
		}
		//�ν��Ͻ� ����
		int field1;	
//		private static int field2;
		//method
		void method1() {}
		//static method
//		static void method2() {}
	}
	//inner class�߿��� ����(static : Data������ �޸� ���) ��� Ŭ����
	static class C{
		C(){
			System.out.println("C��ü�� ������.");
		}
		int field3;
		int field1;
		static int field2;
		//aŬ������ �ڽ������� ����(static class C)�̹Ƿ� ��� ����.�޸𸮴� data �������� ����.
		
		void method1() {}
		static void method2() {}
		
		}
		
	void method() {
		//inner class�߿��� ����Ŭ����
		class D{
			D(){System.out.println("D��ü�� ������");}
			int field1;
//				static int field2; //���Ұ�
			void method1() {}
//				static void method2() {}
		}
		D d = new D();
		d.field1=3;
		d.method1();
	}
	
	
}
