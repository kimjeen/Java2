package pk25.hashmap;

public class Student {
	
	//필드 선언
	private String name;
	private String subject;
	private String id;
	private double grade;
	
	//생성자
	public Student(String name,String subject,String id,double grade) {
		this.name=name;
		this.subject=subject;
		this.id=id;
		this.grade=grade;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public String getId() {
		return id;
	}
	public double getGrade() {
		return grade;
	}
	
	public void find_student(String name) {
		if(name.equals(this.name)) {
			System.out.println(this.name +","+ this.subject+","+this.id+","+this.grade);
		}
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", id=" + id + ", grade=" + grade + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
