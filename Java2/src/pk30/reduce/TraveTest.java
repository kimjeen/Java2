package pk30.reduce;

import java.util.ArrayList;
import java.util.List;

public class TraveTest {

	public static void main(String[] args) {
		
		TravelCustomer customerLee1 = new TravelCustomer("이순신",40,100);
		TravelCustomer customerLee2 = new TravelCustomer("김유신",20,100);
		TravelCustomer customerLee3 = new TravelCustomer("홍길동",10,100);
		
		List<TravelCustomer> customerlist = new ArrayList<TravelCustomer>();
		
		customerlist.add(customerLee1);
		customerlist.add(customerLee2);
		customerlist.add(customerLee3);
		//customerlist.add(new TravelCustomer("홍길동",40,100));
		System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
		//입력한대로
		customerlist.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		System.out.println("== 총 여행 비용 출력 ==");
		int sumVal = customerlist.stream().mapToInt(n->n.getPrice()).sum();
		System.out.println(sumVal);
		
		//자료
		System.out.println("== 20세 이상 고객명단정렬하여 출력 ==");
		customerlist.stream().filter(s->s.getAge()>=20).map(c->c.getName()).sorted().forEach(s->System.out.println(s+" "));
		
		
		
		
		
		
		
		

	}

}
