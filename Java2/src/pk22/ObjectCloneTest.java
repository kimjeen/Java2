package pk22;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Circle circle = new Circle(10,20,30);
		Circle copycircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copycircle);
		
		//hash°ª
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copycircle));
//		System.out.println(System.identityHashCode());
		
		
	}

}
