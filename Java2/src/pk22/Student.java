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
		// instanceof : 연산자로써 객체타입이 형변환이 가능한지의 여부를 판단
		if(obj instanceof Student){
			
			//다운캐스팅 : 부모클래스객체가 자식클래스 객체로 형변환
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
