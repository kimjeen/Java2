package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
		
		Board board1 = new Board("�Ҽ�1","��Ÿ��1","���1");
		Board board2 = new Board("�Ҽ�2","��Ÿ��2","���2");
		Board board3 = new Board("�Ҽ�3","��Ÿ��3","���3");
		Board board4 = new Board("�Ҽ�4","��Ÿ��4","���4");
		Board board5 = new Board("�Ҽ�5","��Ÿ��5","���5");
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		list.add(board4);
		list.add(board5);
		
//		list.add(new Board("�Ҽ�1","��Ÿ��1","���1"));
//		list.add(new Board("�Ҽ�2","��Ÿ��2","���2"));
//		list.add(new Board("�Ҽ�3","��Ÿ��3","���3"));
//		list.add(new Board("�Ҽ�4","��Ÿ��4","���4"));
//		list.add(new Board("�Ҽ�5","��Ÿ��5","���5"));
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.toString());
		}
		System.out.println("==============================");
		
		list.remove(2);
		list.remove(3);

		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.toString());
		}
		
	}

}
