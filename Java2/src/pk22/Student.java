package pk22;

public class Student {

	int studentIdl;
	String studentName;
	
	public Student(int studentIdl,String studentName) {
		this.studentIdl=studentIdl;
		this.studentName=studentName;
	}

	@Override
	public boolean equals(Object obj) {
		// instanceof : �����ڷν� ��üŸ���� ����ȯ�� ���������� ���θ� �Ǵ�
		if(obj instanceof Student){
			
			//�ٿ�ĳ���� : �θ�Ŭ������ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
			Student std = (Student)obj;
			if(studentIdl==std.studentIdl) 
				return true;
			
			else 
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return studentIdl;
	}
	
	
	
}
