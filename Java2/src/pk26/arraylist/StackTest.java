package pk26.arraylist;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {

		Object obj;
		
		//empty 스택생성
		Stack<Object> st= new Stack<Object>();
		// 1. 비워 있는지 확인.
		if(st.empty()) {
			for(int i=0;i<3;i++) {
				
				st.push(new String("Hi!"+i));
				System.out.println("입력 "+i+"번째 "+ st.peek());
			}
		}
		//꺼내기 , pop으로 하나 꺼내 같다.
		st.pop();
		// peek로 확인하면 1번째 확인 가능
		System.out.println("현재 TOP의 위치  (peek) : "+st.peek());
		st.pop();
		System.out.println("현재 TOP의 위치  (peek) : "+st.peek());
		
		//집어 넣기;
		st.push(new String("everybody!"));
		System.out.println("현재 TOP의 위치  (peek) : "+st.peek());
		
		st.push(new String("Nice Day"));
		System.out.println(st.peek());
	}
}
