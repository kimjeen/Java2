package pk22;

class BK{
	
	int bookNumber;
	String bookTitle;
	
	public BK(int bookNumber,String bookTitle) {
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber +","+bookTitle;
	}
	
}

public class ToStringEx2 {
	public static void main(String[] args) {
		
		
		BK book1= new BK(200,"°³¹Ì");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		
		
	}
}
