package pk22;

public class EqualTest {
	public static void main(String[] args) {
		
		Student StudentLee  = new Student(100,"이상원");
		Student StudentLee2  = StudentLee;
		Student StudentSang  = new Student(100,"이상원");
		
		// 1. StudentLee == StudentLee2
		if(StudentLee==StudentLee2) {
			System.out.println("동일하다");
		}
		else {
			System.out.println("동일하지 않다.");
		}
		// 2. StudentLee.equals(StudentLee2)
		if(StudentLee.equals(StudentLee2)) {
			System.out.println("동일하다");
		}
		else {
			System.out.println("동일하지 않다.");
		}
		
		// 다른 주소를 갖고 있는 객체의 물리적 ,논리적 비교.
		// 3. StudentLee == StudentSang
		if(StudentLee== StudentSang) {
			System.out.println("동일하다.");
		}
		else {
			System.out.println("동일하지 않다.");
		}
		
		// 4. StudentLee.equasl(StudentSang)
		if(StudentLee.equals(StudentSang)) {
			System.out.println("동일하다.");
		}
		else {
			System.out.println("동일하지 않다.");
		}
		// 인스턴스 생성시 만들어지는 heap 메모리 주소(hashCode) 
		System.out.println("StudentLee의 hashcode 값 : " + StudentLee.hashCode());
		System.out.println("StudentSang의 hashcode 값 : " + StudentSang.hashCode());
		// 인스턴스 전에 주어지는 실제 주소
		System.out.println("StudentLee의 실제주소 값 : " + System.identityHashCode(StudentLee));
		System.out.println("StudentSang의 실제주소 값 : " + System.identityHashCode(StudentSang));
	}
}
