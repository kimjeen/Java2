package pk26.arraylist;

import java.util.ArrayList;

class MyStack{
	//ArrayList를 Stack class구조화
	//제너릭은 제한조건이 가능하다.
	private ArrayList<String> arrayStack= new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop(){
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		return(arrayStack.remove(len-1));
	}
	
}


public class StackTest2 {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		// 비어있는 확인은 어떻게?
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.push("E");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
//empty
//iseEmpty !,동기화
