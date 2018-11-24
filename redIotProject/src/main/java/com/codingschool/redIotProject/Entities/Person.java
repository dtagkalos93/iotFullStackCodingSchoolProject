package com.codingschool.redIotProject.Entities;

public class Person {

    private long id;
    private String name;
    private String surname;
    private String mail;
    private String password;
    private Role role;

    public Person() {

    }

    public Person(long id, String name, String surname, String mail, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.role = null;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
