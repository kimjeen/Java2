package pk30.lambda;
public class TestAdd {
	public static void main(String[] args) {

		//구현부
		Add addF = (x,y)->x+y;
		
//		public void add(int a, int b) {
//			int c = a+b;
//			System.out.println(c);
//		}
		//실행부, 매개변수 활용
		System.out.println(addF.add(3, 5));
		
		
		
	}
}
