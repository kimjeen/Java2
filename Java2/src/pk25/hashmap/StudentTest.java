package pk25.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class StudentTest {

	public static void main(String[] args) {
		//fixed array
		Student[] student = new Student[4]; //fixed-length
//		ArrayList<Student> manage = new ArrayList<Student>();
		HashMap<String, Student> manage = new HashMap<String, Student>();
		//================= 입력 ============================
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		for(int i =0;i<student.length;i++) {
			//ArrayList 입력받고
			String text = sc.nextLine();
			StringTokenizer st = new StringTokenizer(text,",");
			String name=st.nextToken().trim();
			String subject=st.nextToken().trim();
			String id=st.nextToken().trim();
			double grade=Double.parseDouble((st.nextToken().trim()));
			
			student[i] = new Student(name,subject,id,grade);
			//Array(Student)--> ArrayList(manage)
			manage.put(name,student[i]);
			
		}
		System.out.println(student[0]);
		//================= 출력 ============================
		Set<String> key=manage.keySet();
		Iterator<String> it =key.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.println("------------------------");
			Student s = manage.get(name);
			System.out.println("이름 : " +s.getName());
			System.out.println("학과 : " +s.getSubject());
			System.out.println("학번 : " +s.getId());
			System.out.println("학점평균 : " +s.getGrade());
		}
		System.out.println("------------------------");
		while(true) {
			System.out.print("학생 이름 >>");
			String name = sc.next();
			if(name.equals("그만")) {
				break;
			}
			else {
					Student s= manage.get(name);
					s.find_student(name);
			}
		}
		sc.close();
	}

}
