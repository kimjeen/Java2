package pk26.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> hashSet = new HashSet<String>();
		//id만들때 쓴다.
		hashSet.add(new String("임정순"));
		hashSet.add(new String("박현경"));
		hashSet.add(new String("홍연희"));
//		hashSet.add(new String("감강찬"));
//		hashSet.add(new String("감강찬"));
		
		boolean b1=hashSet.add("강감찬");
		System.out.println(b1);
		
		//heap memory를 할당 받지 못함.
		boolean b2=hashSet.add("강감찬");
		System.out.println(b2);
		
		
		System.out.println(hashSet);
		

	}

}
