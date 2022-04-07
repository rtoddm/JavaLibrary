package librarylab;

public class Book {

	    String bookTitle;
	    boolean borrowed;

	   
	    public Book(String bookTitle) {
	    	this.bookTitle = bookTitle;
	    	this.borrowed = false;
	    }
	   
	    public void borrowed() {
	        this.borrowed = true;
	    }
	   
	   
	    public void returned() {
	    	this.borrowed = false; 
	    }
	   
	    // Returns true if the book is borrowed, false otherwise
	    public boolean isBorrowed() {
	    		if(this.borrowed) {
	    			return true;
	    	}else {
	    		return false;
	    	}
	    }
	   
	    // Returns the title of the book
	    public String getTitle() {
	    	return this.bookTitle;
	    }

	    public static void main(String[] arguments) {
	        // Small test of the Book class
	        Book example = new Book("The Da Vinci Code");
	        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
	        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	        example.borrowed();
	        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
	        example.returned();
	        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	    }
	} 


