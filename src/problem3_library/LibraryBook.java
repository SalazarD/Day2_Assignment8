package problem3_library;

public class LibraryBook {
	
	private int bookId;
	private String bookTitle;
	private String bookAuthor;
	private String borrowerId;
	
	public LibraryBook(int bookId, String bookTitle, String bookAuthor, String borrowerId) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.borrowerId = borrowerId;
		
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public String getBorrowerId() {
		return borrowerId;
	}

	@Override
	public String toString() {
		return "LibraryBook [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", borrowerId=" + borrowerId + "]";
	}

	public void setBorrowerId(String borrowerId) {
		this.borrowerId = borrowerId;
	}

}
