package pk26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Coin> coinBox= new Stack<Coin>();
		
		//4번 이상 push
		if(coinBox.isEmpty()) {
		coinBox.push(new Coin(1));
		coinBox.push(new Coin(2));
		coinBox.push(new Coin(3));
		coinBox.push(new Coin(4));
		}
		
		//while문을 이용해서 출력
		//coin이 없을때까지 pop
		while(!coinBox.isEmpty()) {
			//coinBox.pop으로 했었음.
			// StackTest에서는 객체 생성을 Object로 해서 맞바로 사용할수 있지만.
			// 요기서는 Coin 클래스 생성후 Coin 클래스서 빼오는것이기 때문에 객체 생성해서 
			// 그 객체에다가 넣어주는 형식으로 간다.
			Coin coin= coinBox.pop();
			//
			System.out.println("꺼내온 동전:"+coin.getValue()+"원");
			System.out.println(coinBox.peek());
		}
		
		
		
	}
}
