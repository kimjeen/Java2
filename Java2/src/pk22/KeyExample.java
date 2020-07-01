package pk22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//key->객체식별!!
		
		
		
		//Key 객체를 식별키로 하여 String 값을 저장하는 HashMap 객체 생성
		      //형구분없이 두개의 아규먼트를 받아서 쓴다.
		HashMap<Key, String> hashmap = new HashMap<Key,String>();
		
		//식별키(hashcode)에 put으로 입력
		hashmap.put(new Key(1),"홍길동");
		
		//식별키(hashcode)를 이용하여 값(String)을 읽어옴.
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}
