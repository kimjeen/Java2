package pk30.lambda;
public class TestAdd {
	public static void main(String[] args) {

		//������
		Add addF = (x,y)->x+y;
		
//		public void add(int a, int b) {
//			int c = a+b;
//			System.out.println(c);
//		}
		//�����, �Ű����� Ȱ��
		System.out.println(addF.add(3, 5));
		
		
		
	}
}
