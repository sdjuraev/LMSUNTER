package org.example;

public class Book {
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.bookID = IDGenerator.generateBookID();
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public boolean borrowBook(){
        if (isAvailable){
            isAvailable= false;
            return true;
        }else {
            System.out.println("You can't borrow this book");
            return false;
        }
    }
    public boolean returnBook(){
        if (!isAvailable){
            isAvailable=true;
            return true;
        }else {
            System.out.println("This book isn't borrowed");
            return false;
        }
    }
    public void displayBook(){
        System.out.print("Book ID: "+ bookID);
        System.out.print(" Book Title: "+title);
        System.out.print(" Book author "+ author);
        if (isAvailable){
            System.out.println(" Available");
        }else {
            System.out.println(" Not available");
        }
    }

    public String getBookID() {
        return bookID;
    }
}
