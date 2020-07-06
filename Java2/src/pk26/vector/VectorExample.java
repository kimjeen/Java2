package pk26.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		List<Board> list=new Vector<Board>();
		
		Board board1 = new Board("소설1","판타지1","쥬논1");
		Board board2 = new Board("소설2","판타지2","쥬논2");
		Board board3 = new Board("소설3","판타지3","쥬논3");
		Board board4 = new Board("소설4","판타지4","쥬논4");
		Board board5 = new Board("소설5","판타지5","쥬논5");
		
		list.add(board1);
		list.add(board2);
		list.add(board3);
		list.add(board4);
		list.add(board5);
		
//		list.add(new Board("소설1","판타지1","쥬논1"));
//		list.add(new Board("소설2","판타지2","쥬논2"));
//		list.add(new Board("소설3","판타지3","쥬논3"));
//		list.add(new Board("소설4","판타지4","쥬논4"));
//		list.add(new Board("소설5","판타지5","쥬논5"));
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
