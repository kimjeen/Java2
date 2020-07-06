package pk26.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("java");        //0
		list.add("JDBC");        //1
		list.add("Servlet/JSP"); //2
		list.add("DATABASE");    //3
		list.add("Spring");      //4
		
		//총객체 수 출력
		System.out.println("총객체수 :" +list.size());
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i +":"+str.toString());
		}
		System.out.println("===== 인덱스 하나만 가져오기=======");
		
		String subject = list.get(2);
		System.out.println("2 : " + subject);
		System.out.println();
		
		//삭제
		list.remove(2);        //인덱스삭제
		list.remove("Spring"); //object삭제
		
		System.out.println("=============================");
		
		//다시 출력
		for(int i=0;i<list.size();i++) {
			String str= list.get(i);
			System.out.println(i+":" + str.toString());
		}
		
		
		
		
		
	}
}
