package pk26.treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2))*-1; // 내림차순 음수가 나오니까
	}
}
public class ComparatorTest {
	public static void main(String[] args) {
		
		//String 이므로 자동으로 compare되어 오름차수이 된다.
		//Mycompare 클래스 삽입으로 인해 내림차순으로 정의
		Set<String> set = new TreeSet<String>(new MyCompare());
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		
		System.out.println(set);
		
		
		
		
	}

}
