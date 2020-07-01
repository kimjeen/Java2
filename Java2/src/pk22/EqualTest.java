package pk22;

public class EqualTest {
	public static void main(String[] args) {
		
		Student StudentLee  = new Student(100,"�̻��");
		Student StudentLee2  = StudentLee;
		Student StudentSang  = new Student(100,"�̻��");
		
		// 1. StudentLee == StudentLee2
		if(StudentLee==StudentLee2) {
			System.out.println("�����ϴ�");
		}
		else {
			System.out.println("�������� �ʴ�.");
		}
		// 2. StudentLee.equals(StudentLee2)
		if(StudentLee.equals(StudentLee2)) {
			System.out.println("�����ϴ�");
		}
		else {
			System.out.println("�������� �ʴ�.");
		}
		
		// �ٸ� �ּҸ� ���� �ִ� ��ü�� ������ ,���� ��.
		// 3. StudentLee == StudentSang
		if(StudentLee== StudentSang) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ�.");
		}
		
		// 4. StudentLee.equasl(StudentSang)
		if(StudentLee.equals(StudentSang)) {
			System.out.println("�����ϴ�.");
		}
		else {
			System.out.println("�������� �ʴ�.");
		}
		// �ν��Ͻ� ������ ��������� heap �޸� �ּ�(hashCode) 
		System.out.println("StudentLee�� hashcode �� : " + StudentLee.hashCode());
		System.out.println("StudentSang�� hashcode �� : " + StudentSang.hashCode());
		// �ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("StudentLee�� �����ּ� �� : " + System.identityHashCode(StudentLee));
		System.out.println("StudentSang�� �����ּ� �� : " + System.identityHashCode(StudentSang));
	}
}
