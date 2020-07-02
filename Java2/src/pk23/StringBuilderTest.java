package pk23;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		//불변,immutable
		String javaStr = new String("java");
		// 처음 객체의 인스턴화시 메모리값;
		System.out.println("원본(javaStr)의 메모리 주소 : "+ System.identityHashCode(javaStr));
		
		//원본은 나두고 추가활용시작
		//ex)회원정보 id를 나두고 추가 작업을 하는 것.
		//String으로부터 StringBuilder의 객체 생성.
		StringBuilder buffer = new StringBuilder(javaStr);
		
		//연산이 이루어지기 전 원본 hash값.
		System.out.println("연산 전 Buffer의 메모리 주소 : "+System.identityHashCode(buffer));
		
		buffer.append(" and "); //인덱스의 주소를 신경쓸 필요가 없음.
		buffer.append("android");
		buffer.append(" Programming is fun1");
		System.out.println("연산 후 Buffer의 메모리 주소 : "+System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("새로 만들어진 javaStr의 문자열 주소 : "+ System.identityHashCode(javaStr));
	}
}
