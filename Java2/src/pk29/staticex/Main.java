package pk29.staticex;

public class Main {

	public static void main(String[] args) {

		A a= new A();
		
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		//static이므로 독립된 공간에서 작동하므로 생성자를 공유할수는 없다.
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
		//static을 객체로 끌고 오는 예
		c.field2=5;
		c.method2();
		//static 을 끌고 오는 좋은 예(static은 클래스명으로 가져와서 쓰는게 좋다.)
		A.C.field2=3;
		A.C.method2();
		//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
		
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
		
		
	}

}
