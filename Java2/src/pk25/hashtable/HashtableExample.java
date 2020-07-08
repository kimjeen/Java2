package pk25.hashtable;

import java.util.*;
import java.util.Scanner;


public class HashtableExample {
	public static void main(String[] args) {
		
		Map<String,String> map = new Hashtable<>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력하세요");
			System.out.print("아이디 : ");
			String id = scanner.nextLine();
			System.out.print("비밀번호 : ");
			String pw = scanner.nextLine();
			System.out.println();
			
			//containsKey: hashMap에서 제공해주는 Key값을 확인하는 메소드
			if(map.containsKey(id)) {
				//있다면
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 되었습니다.");
					break;
				}
				else {
					System.out.println("비밀번호가 일치 하지 않습니다.");
				}
			}
			else {
			System.out.println("입력하신 ID는 존재 하지 않습니다.");
			}
		}
	}
}
