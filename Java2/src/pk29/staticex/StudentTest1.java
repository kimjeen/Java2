package pk29.staticex;

public class StudentTest1 {
	public static void main(String[] args) {
		
		Student studentLee=new Student();
		studentLee.setStudentName("이지원");
		System.out.println("성명 : "+studentLee.studentName+"학번 : "+studentLee.studentId);
		
		//static의 set메소드 또는 인위적 변경을 주면 안된다.
//		System.out.println(studentLee.setSerialNum(1005));
		
		System.out.println(Student.getSerialNum());
		
		Student studentSon=new Student();
		studentSon.setStudentName("손수경");
		System.out.println(Student.serialNum); 
		System.out.println("성명 : "+studentSon.studentName+"학번 : "+studentSon.studentId);
		
	}
}
