package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String location;
    private List<Book> catalog;
    private List<Member> members;
    private List<Librarian> librarians;
    private List<Person> persons;
    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        this.catalog = new ArrayList<>();
        this.librarians = new ArrayList<>();
        this.members = new ArrayList<>();

    }
    public void registerMember(Member member) {
        members.add(member);
    }
    public void addLibrarian(Librarian librarian) {
        librarians.add(librarian);
    }
    public List<Member> getMembers() {
        return members;
    }
    public List<Librarian> getLibrarians() {
        return librarians;
    }
}
