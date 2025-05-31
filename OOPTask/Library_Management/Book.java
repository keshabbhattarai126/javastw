package Lesson5Task.OOPTask.Library_Management;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable = true;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            return "You have successfully borrowed the book.";
        } else {
            return "Sorry, this book is currently not available.";
        }
    }

    public void returnBook() {
        isAvailable = true;
    }
}
