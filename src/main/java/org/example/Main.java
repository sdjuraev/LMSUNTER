package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library("U ENTER","Amir Temur 2");
        Librarian librarian = new Librarian("Alex",12,"alex","1234",Role.LIBRARIAN);
        library.addLibrarian(librarian);
        Member member = new Member("John", 23,"john","123",Role.MEMBER, librarian);
        library.registerMember(member);

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Login as librarian\n" +
                "2. Login as Member\n" +
                "3. Login as Guest\n" +
                "4. Show Library Info\n" +
                "5. Register as Member\n" +
                "0. Exit");
        int selection = scanner.nextInt();
        switch (selection){
            case 1:
                System.out.println("Login as librarian");
                System.out.print("Login: ");
                String login = scanner.next();
                System.out.print("Password: ");
                String password = scanner.next();
                for (Librarian lib: library.getLibrarians()){
                    if (lib.getLogin().equals(login) && lib.getPassword().equals(password)){
                        System.out.println("Hello "+lib.getLogin());
                        LibrarianHandler handler = new LibrarianHandler(librarian);
                        handler.run();

                    }else {
                        System.out.println("Login or password wrong");
                        System.out.println("Change this part");
                    }
                }
                break;
            case 2:
                System.out.println("Login as member");
                break;
            case 3:
                System.out.println("Login as Guest");
                break;
            case 4:
                System.out.println("Show library info");
                break;
            case 5:
                System.out.println("Register as Member");
            case 0:
                System.exit(0);

        }





//        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
//        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
//        Book book3 = new Book("1984", "George Orwell");
//        Book book4 = new Book("Pride and Prejudice", "Jane Austen");
//        Book book5 = new Book("Moby Dick", "Herman Melville");
//        Book book6 = new Book("War and Peace", "Leo Tolstoy");
//        Book book7 = new Book("The Catcher in the Rye", "J.D. Salinger");
//        Librarian librarian = new Librarian("Alex",12,"alex","1234",Role.LIBRARIAN);
//
//        Member member = new Member("John", 23,"john","123",Role.MEMBER, librarian);
//        Member member1 = new Member("aa",12,"log","p",Role.MEMBER, librarian);
//        Person member3 = new Member("Jony", 45,"login","o",Role.MEMBER,librarian);
//
//        librarian.addBook(book1);
//        librarian.addBook(book2);
//        librarian.addBook(book3);
//        librarian.addBook(book4);
//        librarian.addBook(book5);
//        librarian.addBook(book6);
//        librarian.addBook(book7);
//        librarian.displayBooks();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the bookID you want to borrow");
//        String bookID = scanner.next();
//        librarian.issueBook(bookID, member);
//        System.out.println("Show borrowed book by member");
//        member.displayBooks();
//        System.out.println("Display all managed books");
//        librarian.displayBooks();
//        librarian.returnBook(bookID);
//        librarian.displayBooks();
//

//        librarian.issueBook(bookID, member);
//        librarian.displayBooks();
//        System.out.println("Enter the bookID you want to return");
//        bookID = scanner.next();
//        librarian.returnBook(bookID);






    }
}