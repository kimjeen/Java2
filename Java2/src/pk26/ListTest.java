package pk26;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		//new ArrayList<String> ���� ����.
		//list���� arraylist �� �������ڴ�.
		//List������ ���� ArrayListŬ������ ��ü ����
		List<String> ls=new ArrayList();
		
		//����Ʈ�� ������ �߰�
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
