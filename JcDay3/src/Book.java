
public class Book {
	private int bookId;
	private String bookName;
	

	public Book(int bookId, String bookName) {
		this.bookId = bookId;
		this.bookName = bookName;
	}
	

	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public static void main(String[] args) {
		Book book1 = new Book(10,"Java");
		Book book2 = new Book(20,"Java");
		
		System.out.println(book1.equals(book2));
		
		System.out.println(book1.getBookName().equals(book2.getBookName()));
		
		String str = "Hii";
		String str1 = "Hii";
		System.out.println(str.equals(str1));
		System.out.println(str == str1);
	}
}
