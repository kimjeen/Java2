package pk30.reduce;

import java.util.ArrayList;
import java.util.List;

public class TraveTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee1 = new TravelCustomer("�̼���",40,100);
		TravelCustomer customerLee2 = new TravelCustomer("������",20,100);
		TravelCustomer customerLee3 = new TravelCustomer("ȫ�浿",10,100);
		
		List<TravelCustomer> customerlist = new ArrayList<TravelCustomer>();
		
		customerlist.add(customerLee1);
		customerlist.add(customerLee2);
		customerlist.add(customerLee3);
		//customerlist.add(new TravelCustomer("ȫ�浿",40,100));
		System.out.println("== �� ��� �߰��� ������� ��� ==");
		//�Է��Ѵ��
		customerlist.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("== �� ���� ��� ��� ==");
		int sumVal = customerlist.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println(sumVal);
		
		//�ڷ�
		System.out.println("== 20�� �̻� ����������Ͽ� ��� ==");
		customerlist.stream().filter(s->s.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s+" "));
		
		
		
		
		
		
		
		

	}

}
