package pk30.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayStream {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		Arrays.stream(arr).forEach(n->System.out.print(n+" "));
		
		int sumVal1 = Arrays.stream(arr).sum();
		System.out.println(sumVal1);
		
		//��ü�̸�  : list
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		
		int sum2=list.stream().mapToInt(n->n.intValue()).sum();
		System.out.println("ArrayList�� �հ� : "+ sum2);
		
//		Stream<Integer> stream1 = list.stream();
//		
//		//���
//		stream1.forEach(n->System.out.print(n+" "));
//		System.out.println();
//		System.out.println("======= sorted =============");
//		//sorted
//		list.stream().sorted().forEach(n->System.out.print(n+" "));
//		System.out.println();
//		System.out.println("======= filter =============");
////		list.stream().filter(n->n.le()>=5).forEach(n->System.out.println(n+" "));
//		System.out.println();
//		System.out.println("======= map =============");
		
		
		
		
		
		
	
		
		
		
		

	}

}
