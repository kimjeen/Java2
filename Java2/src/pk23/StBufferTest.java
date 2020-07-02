package pk23;

public class StBufferTest {

	public static void main(String[] args) {
		String str="";
		StringBuffer buf=new StringBuffer("Nice Day");
		System.out.println(buf.toString());
		
		//문자열의 길이
		System.out.println(buf.length());
		//문자열의 용량 확인
		System.out.println(buf.capacity());
		//문자열의 용량 증가
		buf.ensureCapacity(100);
		System.out.println(buf.capacity());
		
		//문자열의 삽입.
		buf.insert(0, "Hi!");
		buf.insert(11," Everybody^^");
		System.out.println(buf);
		
		//지우기
		buf.delete(0, 3);
		System.out.println(buf);
		
		
		
		
	}

}
