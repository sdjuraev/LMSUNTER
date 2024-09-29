package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person{
    private List<Book> managedBooks;
    public Librarian(String name, int age, String login, String password, Role role) {
        super(name,age, login, password, role);
        managedBooks = new ArrayList<>();
    }
    public void addBook(Book book){
        managedBooks.add(book);
    }
    public void removeBook(String bookID){
        Book foundBook = new Book("","");
        for (Book b: managedBooks) {
            if (b.getBookID().equals(bookID)) {
             foundBook =  b;
            }
        }
        managedBooks.remove(foundBook);
    }
    public void issueBook(String bookID, Member member){
        for (Book b: managedBooks) {
            if (b.getBookID().equals(bookID)) {
                member.borrowBook(b);
                b.borrowBook();
            }
        }

    }
    public void returnBook(String bookID){
        for (Book b: managedBooks) {
            if (b.getBookID().equals(bookID))
                b.returnBook();
        }
    }
    public void displayBooks(){
        for (Book b: managedBooks) {
            b.displayBook();
        }
    }

    public List<Book> getManagedBooks() {
        return managedBooks;
    }
}
