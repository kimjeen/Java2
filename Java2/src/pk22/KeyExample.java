package pk22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//key->��ü�ĺ�!!
		
		
		
		//Key ��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� HashMap ��ü ����
		      //�����о��� �ΰ��� �ƱԸ�Ʈ�� �޾Ƽ� ����.
		HashMap<Key, String> hashmap = new HashMap<Key,String>();
		
		//�ĺ�Ű(hashcode)�� put���� �Է�
		hashmap.put(new Key(1),"ȫ�浿");
		
		//�ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��.
		String value = hashmap.get(new Key(1));
		System.out.println(value);
		
	}

}