package pk29.staticex;

public class A {
	A(){
		System.out.println("A객체가 생성됨");
	}
	//inner class 중에서 인스턴스 멤버 클래스
	//부모역할을 하는 A클래스에서 inner class 안에서 static 선언할수가 없다.
	public class B {
		//constructor
		B(){
			System.out.println("B객체가 생성됨");
		}
		//인스턴스 변수
		int field1;	
//		private static int field2;
		//method
		void method1() {}
		//static method
//		static void method2() {}
	}
	//inner class중에서 정적(static : Data영역의 메모리 사용) 멤버 클래스
	static class C{
		C(){
			System.out.println("C객체가 생성됨.");
		}
		int field3;
		int field1;
		static int field2;
		//a클래스의 자식이지만 독립(static class C)이므로 사용 가능.메모리는 data 영역으로 사용됨.
		
		void method1() {}
		static void method2() {}
		
		}
		
	void method() {
		//inner class중에서 로컬클래스
		class D{
			D(){System.out.println("D객체가 생성됨");}
			int field1;
//				static int field2; //사용불가
			void method1() {}
//				static void method2() {}
		}
		D d = new D();
		d.field1=3;
		d.method1();
	}
	
	
}
