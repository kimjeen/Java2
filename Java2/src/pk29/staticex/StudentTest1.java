package pk29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student studentLee=new Student();
		studentLee.setStudentName("������");
		System.out.println("���� : "+studentLee.studentName+"�й� : "+studentLee.studentId);
		
		//static�� set�޼ҵ� �Ǵ� ������ ������ �ָ� �ȵȴ�.
//		System.out.println(studentLee.setSerialNum(1005));
		
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentSon.setStudentName("�ռ���");
		System.out.println(Student.serialNum); 
		System.out.println("���� : "+studentSon.studentName+"�й� : "+studentSon.studentId);
		
	}
}
