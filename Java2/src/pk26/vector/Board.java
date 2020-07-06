package pk26.vector;

public class Board {
	
	String subject;
	String content;
	String writer;
	
	//생성자 오버라이딩
	public Board(String subject,String content,String writer) {
		this.subject=subject;
		this.content=content;
		this.writer=writer;
	}

	@Override
	public String toString() {
		return subject +","+ content+","+writer;
	}
	
	
	
	

}
