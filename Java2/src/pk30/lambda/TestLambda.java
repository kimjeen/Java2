package pk30.lambda;

interface PrintString{
	void showString(String str);
}


public class TestLambda {
	
	//함수형 람다 유형 1 static method
	public static void showMyString(PrintString p) {
		p.showString("hello Lambda_2");
	}
	//함수형 람다 유형 2 static method
	public static PrintString returnString() {
		return s->System.out.println(s+ "Wrold");
	}
	public static void main(String[] args) {
		
		//람다식을 변수에 대입.
		PrintString print = s->System.out.println(s);
		print.showString("hello Lambda_1");
		
		//함수형 람다 유형1
//1.	PrintString print = s->System.out.println(s);
		showMyString(print); //print : 람다식 객체
		//s->System.out.print(s); 복사되어 lambdaStr에 담겨 있음.
		
		//함수형 람다 유형2
		PrintString reStr = returnString();
		reStr.showString("hello");
		
	}
	
}
