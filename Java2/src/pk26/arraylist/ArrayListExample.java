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
		
		//�Ѱ�ü �� ���
		System.out.println("�Ѱ�ü�� :" +list.size());
		for(int i=0;i<list.size();i++) {
			String str = list.get(i);
			System.out.println(i +":"+str.toString());
		}
		System.out.println("===== �ε��� �ϳ��� ��������=======");
		
		String subject = list.get(2);
		System.out.println("2 : " + subject);
		System.out.println();
		
		//����
		list.remove(2);        //�ε�������
		list.remove("Spring"); //object����
		
		System.out.println("=============================");
		
		//�ٽ� ���
		for(int i=0;i<list.size();i++) {
			String str= list.get(i);
			System.out.println(i+":" + str.toString());
		}
		
		
		
		
		
	}
}
