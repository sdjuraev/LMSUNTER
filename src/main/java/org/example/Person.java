package org.example;

public class Person {
    private String name;
    private String ID;
    private int age;
    private String login;
    private String password;
    private Role role;

    public Person(String name, int age, String login, String password, Role role) {
        this.name = name;
        this.ID = IDGenerator.generateBookID();
        this.age = age;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                ", age=" + age +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '.';
    }
}

