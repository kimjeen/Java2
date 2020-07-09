package pk29.staticex;

public class Student {
	//�ν��Ͻ� ����
	//static �̳� final�� ������ ������ ������ ����
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
	
	//static �޼ҵ�
	public static int getSerialNum() {
		int i=10;//��������(stack�޸𸮸� ���):�޼ҵ尡 ������ ������(������ ����� ������)
		//static�� �ڱ��ڽ��� ������ ������ ��� ����.
//		studentName="aaa;" �ν��Ͻ� ���� �̹Ƿ� heap memory
//		serialNum++;//Data
		return serialNum;
	}	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}	
		
		
}
	
	

