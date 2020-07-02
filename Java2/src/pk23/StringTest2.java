package pk23;

public class StringTest2 {

	public static void main(String[] args) {

		String javastr=new String("JAVA");
		String androidstr=new String(" and android");
		
		System.out.println(javastr);
		System.out.println("처음 문자열 주소 값 : "+ System.identityHashCode(javastr));
		
		javastr = javastr.concat(androidstr);
		
		System.out.println(javastr);
		System.out.println("연결된  문자열 주소 값 : "+ System.identityHashCode(javastr));
		
		
		
		
		
	}

}
