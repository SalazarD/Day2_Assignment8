package problem3_library;

public class LibraryBookDemo {
	
	public static void main(String[] args) {
		
		LibraryBook[] books = new LibraryBook[5];
		books[0] = new LibraryBook(1, "Harry Potter", "JK Rowling", "12345");
		books[1] = new LibraryBook(2, "Mister Monday", "Garth Nix", "12345");
		books[2] = new LibraryBook(3, "City Of Ember", "Jeanne DuPrau", "12345");
		books[3] = new LibraryBook(4, "The People Of Sparks", "Jeanne DuPrau", "54321");
		books[4] = new LibraryBook(5, "The Diamond Of Darkhold", "Jeanne DuPrau", "54321");
		
		LibraryBook[] temp = getCheckouts(books, "12345");
		
		System.out.println("Here are the books checked out by IdNo 12345: ");
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}
		
		checkInBook(books[3]);
		
		System.out.println("\n");
		
		for(int i = 0; i < books.length; i++) {
			System.out.println(books[i].toString());
		}
		
		
	}
	
	public static void checkInBook(LibraryBook book) {
		book.setBorrowerId("");
	}
	
	public static LibraryBook[] getCheckouts(LibraryBook[] books, String borrowerId) {
		
		int count = 0;
		
		for(int i = 0; i < books.length; i++) {
			if(books[i].getBorrowerId().equalsIgnoreCase(borrowerId)) {
				count++;
			}
		}
		
		LibraryBook[] temp = new LibraryBook[count];
		
		int pos = 0;
		for(int i = 0; i < books.length; i++) {
			if(books[i].getBorrowerId().equalsIgnoreCase(borrowerId)) {
				temp[pos] = books[i];
				pos++;
			}
		}
		
		
		
		return temp;
	}

}
