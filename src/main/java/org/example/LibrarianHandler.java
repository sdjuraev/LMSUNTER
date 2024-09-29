package org.example;

import java.util.Scanner;

public class LibrarianHandler {
    private Librarian librarian;
    private Scanner scanner;
    LibrarianHandler(Librarian librarian){
        this.librarian = librarian;
        scanner = new Scanner(System.in);
    }
    private void showMenu(){
        System.out.println("1. Add book\n" +
                "2. Remove book\n" +
                "3. Issue book\n" +
                "4. Return book\n" +
                "5. Display books\n" +
                "0. Return");
    }
    public void run(){
        showMenu();
        int selection = scanner.nextInt();
        switch (selection){
            case 1:

                librarian.addBook(InputForm.inputBookForm());
        }
    }
}
