package pk23;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		//객체를 생성해서 클래스이름 획득.
		Person person = new Person();
		//Object의 getClass()메소드를 사용
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		
		//객체를 만들지 않고, 클래스가 접근해서 클래스 이름을 획득.
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		//클래스 이름으로 가져오기
		Class pClass3=Class.forName("pk23.Person");
		System.out.println(pClass3.getName());
		
		
		
	}
}
