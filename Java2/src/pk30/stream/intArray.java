package pk30.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class intArray {
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		//Integer ��ȯ�ϴ� sum()�̹Ƿ� int ������ �޴´�.
		int sumVal = Arrays.stream(arr).sum();
		//������ �ȵ�.
//		int cnt=(int)stream.count();
		System.out.println(sumVal);
		
		
		//��üȭ �Ͽ� ����� �� ����
		IntStream stream=Arrays.stream(arr);
		int s=stream.sum();
		System.out.println(s);
		
		
	}

}
