package pk26.arraylist;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Coin> coinBox= new Stack<Coin>();
		
		//4�� �̻� push
		if(coinBox.isEmpty()) {
		coinBox.push(new Coin(1));
		coinBox.push(new Coin(2));
		coinBox.push(new Coin(3));
		coinBox.push(new Coin(4));
		}
		
		//while���� �̿��ؼ� ���
		//coin�� ���������� pop
		while(!coinBox.isEmpty()) {
			//coinBox.pop���� �߾���.
			// StackTest������ ��ü ������ Object�� �ؼ� �¹ٷ� ����Ҽ� ������.
			// ��⼭�� Coin Ŭ���� ������ Coin Ŭ������ �����°��̱� ������ ��ü �����ؼ� 
			// �� ��ü���ٰ� �־��ִ� �������� ����.
			Coin coin= coinBox.pop();
			//
			System.out.println("������ ����:"+coin.getValue()+"��");
			System.out.println(coinBox.peek());
		}
		
		
		
	}
}
