package pk26.arraylist;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {

		Object obj;
		
		//empty ���û���
		Stack<Object> st= new Stack<Object>();
		// 1. ��� �ִ��� Ȯ��.
		if(st.empty()) {
			for(int i=0;i<3;i++) {
				
				st.push(new String("Hi!"+i));
				System.out.println("�Է� "+i+"��° "+ st.peek());
			}
		}
		//������ , pop���� �ϳ� ���� ����.
		st.pop();
		// peek�� Ȯ���ϸ� 1��° Ȯ�� ����
		System.out.println("���� TOP�� ��ġ  (peek) : "+st.peek());
		st.pop();
		System.out.println("���� TOP�� ��ġ  (peek) : "+st.peek());
		
		//���� �ֱ�;
		st.push(new String("everybody!"));
		System.out.println("���� TOP�� ��ġ  (peek) : "+st.peek());
		
		st.push(new String("Nice Day"));
		System.out.println(st.peek());
	}
}
