interface LibraryItem {
    String getTitle();
    String getAuthor();
    int getYear();
    boolean isAvailable();
}

class Book implements LibraryItem {
    private String title, author;
    private int year;
    private boolean available;

    Book(String t, String a, int y, boolean avail) {
        title = t;
        author = a;
        year = y;
        available = avail;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class Libraryy {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "John Doe", 2020, true);
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year: " + book.getYear());
        System.out.println("Available: " + book.isAvailable());
    }
}

