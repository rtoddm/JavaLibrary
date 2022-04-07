package librarylab;

import java.util.ArrayList;
import java.util.List;

public class Library {
    // Add the missing implementation to this class
	
	String address;
	List<Book> bookList = new ArrayList<>();
	
	public Library(String address) {
		this.address = address;
	}
	
	public void addBook (Book book) {
		this.bookList.add(book);
	}

	public static void printOpeningHours(){
		System.out.println("9 AM to 5 PM");
	}
	
	
	public void printAddress() {
		System.out.println("10 Main St.\n" + "228 Liberty St.");
	}
	
	public void borrowBook(String bookTitle) {
		for(Book book : this.bookList) {
			if(bookTitle.equals(book.getTitle())) {
				if(book.isBorrowed()) {
					System.out.println("Sorry, that book is unavailable.");
					return;
				}else {
					book.borrowed();
					System.out.println("You have successfully borrowed this book!");
					return;	
				}
				
			}
			
		}
		System.out.println("Sorry, we don't have that book.");
	}
	
	public void printAvailableBooks() {
		for(Book book : this.bookList) {
			if(this.bookList.isEmpty()) {
				System.out.println("Sorry this book is not available.");
			}else {
				System.out.println(book.getTitle());
			}
		}
	}
	
	public void returnBook(String bookTitle) {
		for(Book book: this.bookList) {
			if(bookTitle.equals(book.getTitle())) {
				book.returned();
		System.out.println("You have returned your book!");
			}
		}
	};
	

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

    }
}
