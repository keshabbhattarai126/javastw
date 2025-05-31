package Lesson5Task.OOPTask.Library_Management;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.setAuthor("Subin Bhattarai");
        myBook.setTitle("Monsoon");
        myBook.setPublicationYear(2002);

        System.out.println(myBook.borrowBook()); 
        System.out.println(myBook.borrowBook()); 
    }
}
