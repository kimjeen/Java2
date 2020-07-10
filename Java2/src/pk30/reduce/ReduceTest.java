package pk30.reduce;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {
		//����� ���� �ǽ�.
		String[] greetings = {"aaaa","bbb","cc","d"};
		
//		1. reduce ���� (reduce�� ����(�ʱⰪ,�Ű�����,�����)//�������� ������)
//		reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) {
//			return s1;
//		}
//		else return s2;})
		
//		2. stream�� ����
//		Arrays.stream(greetings).reduce("",(s1,s2)->
//		{if(s1.getBytes().length >=s2.getBytes().length) {
//			return s1;
//		}
//		else return s2;})
		
		
		//3. ������
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
		{if(s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		}
		else return s2;}));
		
//--------------------------------------------------------------------------------
		
		//BinaryOperator�� ������ Ŭ���� �̿� �ǽ�
		//Ŭ������ �̿��Ҷ��� �ʱⰪ ���� �ȴ�.
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
//		reduce(new CompareString().get())
		System.out.println(str);
					
				
	}
}
