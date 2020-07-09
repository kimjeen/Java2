package pk29.staticex.inner;

//참조 클래스 작성
class OutClass{
	//필드(인스턴스변수,멤버변수,속성)
	private int num=10; //heap
	private static int sNum=20; //data
	private InClass inClass; //내부 클래스를 변수처럼 활용하기 위한 선언
	
	//생성자
	public OutClass() {
		//내부클래스 생성
		inClass = new InClass();
		System.out.println("OutClass의 객체가 생성되었습니다.");
		System.out.println();
	}
	class InClass{
		//내부클래스의 필드
		int inNum=100;
		/* 외부에 인스턴스 변수로 선언되어 있는 static변수및 메소드를 변경없이 사용하는건 가능하지만
		 * 기준이 되고 변경없이 사용해야 하는 static타입의 변수를 다른 곳에서 재정의 할수 없다.*/
//		static int sNum=300;
//		static int sInNum=200;
//		static void sTest() {}
		
		//메서드
		void inTest() {
			System.out.println("OutClass num = "+num+"(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+"(외부 클래스의 static 변수)");
			System.out.println("OutClass inNum = "+inNum+"(내부 클래스의 인스턴스 변수)");
		}
		
	}
	static class InStaticClass{
		//필드
		int inNum=100;
		static int sInNum=200;
		void inTest() {
//			num=10; //외부의 인스턴스,사용못함.
		System.out.println("InStaticClass inNum = "+inNum+" (내부 클래스의 인스턴스 변수)");
		System.out.println("InStaticClass sInNum = "+sInNum+"(내부 클래스의 static 변수)");
		System.out.println("OutClass sNum = "+sNum+" (외부 클래스의 static 변수)");
		}
	static void sTest() {
		//인스턴스 변수 사용 불가
//		num+=10; 
//		inNUm+=10;
		sNum=30;
		System.out.println("외부클래스 static변수 sNum = "+sNum);
		System.out.println(sInNum);
	}
	
	}
	
}

public class InnerTest {
	public static void main(String[] args) {
		//외부클래스 객체 생성
		OutClass outclass = new OutClass();
		
		//외부 클래스를 이용하여 이너클래스 객체 생성
		OutClass.InClass inclass = outclass.new InClass();
		System.out.println("외부 클래스 변수를 이용하여 내부 클래스 생성");
		inclass.inTest();
		System.out.println();
		
		//외부클래스를 생성하지 않고 바로 정적 내부클래스 객체 생성
		OutClass.InStaticClass instaticclass = new OutClass.InStaticClass();
		System.out.println("===== 정적 내부 클래스 일반 메서드 호출 =====");
	
		instaticclass.inTest();
		System.out.println();
		System.out.println("===== 정적 내부 클래스 static 메서드 호출 =======");
		//클래스에서 호출
		OutClass.InStaticClass.sTest();
		//객체에서 호출
		instaticclass.sTest();

	}

}
