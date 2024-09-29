package org.example;

import java.util.Scanner;

public class InputForm {
    public static Book inputBookForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book name:");
        String name = scanner.nextLine();
        System.out.println("Enter author:");
        String author = scanner.nextLine();
        return new Book(name, author);

    }
}
