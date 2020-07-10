package pk30.lambda;

interface PrintString{
	void showString(String str);
}


public class TestLambda {
	
	//�Լ��� ���� ���� 1 static method
	public static void showMyString(PrintString p) {
		p.showString("hello Lambda_2");
	}
	//�Լ��� ���� ���� 2 static method
	public static PrintString returnString() {
		return s->System.out.println(s+ "Wrold");
	}
	public static void main(String[] args) {
		
		//���ٽ��� ������ ����.
		PrintString print = s->System.out.println(s);
		print.showString("hello Lambda_1");
		
		//�Լ��� ���� ����1
//1.	PrintString print = s->System.out.println(s);
		showMyString(print); //print : ���ٽ� ��ü
		//s->System.out.print(s); ����Ǿ� lambdaStr�� ��� ����.
		
		//�Լ��� ���� ����2
		PrintString reStr = returnString();
		reStr.showString("hello");
		
	}
	
}
