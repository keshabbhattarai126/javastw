// Base class
class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Derived class: FictionBook
class FictionBook extends Book {
    FictionBook(String title, String author) {
        super(title, author); // Call parent constructor
    }
}

// Derived class: NonFictionBook
class NonFictionBook extends Book {
    NonFictionBook(String title, String author) {
        super(title, author); // Call parent constructor
    }
}

// Derived class: TechnicalBook
class TechnicalBook extends Book {
    TechnicalBook(String title, String author) {
        super(title, author); // Call parent constructor
    }
}

// Main class to demonstrate the program
public class Bookdemo {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("Harry Potter", "J.K. Rowling");
        NonFictionBook nonFiction = new NonFictionBook("Sapiens", "Yuval Noah Harari");
        TechnicalBook technical = new TechnicalBook("Effective Java", "Joshua Bloch");

        System.out.println("=== Fiction Book ===");
        fiction.displayDetails();

        System.out.println("\n=== Non-Fiction Book ===");
        nonFiction.displayDetails();

        System.out.println("\n=== Technical Book ===");
        technical.displayDetails();
    }
}
