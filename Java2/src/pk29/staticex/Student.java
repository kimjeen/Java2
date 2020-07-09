package pk29.staticex;

public class Student {
	//인스턴스 변수
	//static 이나 final은 데이터 영역에 별도로 생성
	public static int serialNum=1000; //
	int studentId;
	String studentName;
	int grade;
	String address;
	
	public Student() {
		serialNum++;
		studentId=serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
	
	//static 메소드
	public static int getSerialNum() {
		int i=10;//지역변수(stack메모리를 사용):메소드가 끝나면 없어짐(구조상 사용후 없어짐)
		//static은 자기자신이 선언한 변수만 사용 가능.
//		studentName="aaa;" 인스턴스 변수 이므로 heap memory
//		serialNum++;//Data
		return serialNum;
	}	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}	
		
		
}
	
	

