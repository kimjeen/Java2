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
			System.out.println("���̵�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("���̵� : ");
			String id = scanner.nextLine();
			System.out.print("��й�ȣ : ");
			String pw = scanner.nextLine();
			System.out.println();
			
			//containsKey: hashMap���� �������ִ� Key���� Ȯ���ϴ� �޼ҵ�
			if(map.containsKey(id)) {
				//�ִٸ�
				if(map.get(id).equals(pw)) {
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
				else {
					System.out.println("��й�ȣ�� ��ġ ���� �ʽ��ϴ�.");
				}
			}
			else {
			System.out.println("�Է��Ͻ� ID�� ���� ���� �ʽ��ϴ�.");
			}
		}
	}
}
