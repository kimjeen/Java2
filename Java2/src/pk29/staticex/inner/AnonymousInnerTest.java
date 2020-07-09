package pk29.staticex.inner;
class OutClass2{
	//필드
	int outNum=100;
	static int sNum=200;
	
	//오직 하나만 
	Runnable getRunnable(int i) {//매개변수도 final로 처리되어 다른 클래스에서 사용못함.
	int num=100; //지역변수이자 상수화 final 
	int localnum=10;
	//익명의 클래스
	return new Runnable() {
		
		@Override
		public void run() {
			System.out.println("localNumber : "+localnum+"내부의 인스턴스 변수");
			System.out.println("outNum : "+outNum+"외부클래스의 인스턴스 변수");
			System.out.println("OutClass-static : "+sNum+"+sNum 외부 클래스의 정적변수");
			
		}
	};
	}

}
//내부에서 작동중인 객체
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
