package pk26;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//new ArrayList<String> 생략 가능.
		//list에서 arraylist 를 가져오겠다.
		//List구조를 갖는 ArrayList클래스의 객체 생성
		List<String> ls=new ArrayList();
		
		//리스트에 데이터 추가
		ls.add(" Hi");
		ls.add(" Hava");
		ls.add(" a Nice Day");
		
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		System.out.println("===============");
		ls.add(3," Everybody");
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		
		ls.remove(0);
		System.out.println("===============");
		for(int i=0;i<ls.size();i++) {
			System.out.println(i+":"+ ls.get(i).toString());
		}
		
	}

}
