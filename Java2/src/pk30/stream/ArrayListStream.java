package pk30.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStream {
	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		
		sList.add("��ȣ��");
		sList.add("�ڼ���");
		sList.add("�̽¿�");
		
		//���׸� Ÿ���� stream ����
		
		Stream<String> stream =sList.stream();
		//�Լ��� ���� �Ű������� �ִ�.
		//���ٽ� ��� : ��Ʈ���� �����Ͽ� �ϳ��� Element�� ������ ����س��� ���ٽ�
		stream.forEach(s->System.out.println(s+" "));
		System.out.println();
		sList.stream().sorted().forEach(s->System.out.println(s+" "));
		System.out.println();
		sList.stream().filter(s->s.length()>=5).forEach(s->System.out.println(s+" "));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s+" "));
		
//		for(String s: sList) {
//			System.out.println(s);
//		}
		
	}

}
