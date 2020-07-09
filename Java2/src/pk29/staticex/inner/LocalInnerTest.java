package pk29.staticex.inner;

class OutClass1{
	//필드
	int outNum=100;
	static int sNum=200;
	
	//오직 하나의 메소드만 할당(Runnable)
	Runnable getRunnable(int i) {//매개변수도 final로 처리되어 다른 클래스에서 사용못함.
	int num=100; //지역변수이자 상수화 final 
	
	//메서드 내부에 클래스를 생성
	class MyRunnable implements Runnable {
		int localnum=10;
		
			public void run() {
//			num=200;
			System.out.println("localNumber : "+localnum+"내부의 인스턴스 변수");
			System.out.println("outNum : "+outNum);
			System.out.println("OutClass-static : "+sNum+"+sNum 외부 클래스의 정적변수");
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
