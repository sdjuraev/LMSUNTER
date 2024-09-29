package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member extends Person{
    private List<Book> borrowedBooks;
    public Member(String name, int age, String login, String password, Role role, Librarian librarian) {
        super(name, age, login, password, role);
        borrowedBooks = new ArrayList<>();
    }
    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }
    public void returnBook(Book book){
        for (Book b: borrowedBooks){
            if (b.getBookID().equals(book.getBookID())){
                b.returnBook();
            }
        }
    }
    public void displayBooks(){
        for (Book b: borrowedBooks) {
            b.displayBook();
        }
    }
}
