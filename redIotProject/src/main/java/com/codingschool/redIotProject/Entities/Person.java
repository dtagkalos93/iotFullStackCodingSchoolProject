package com.codingschool.redIotProject.Entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="PERSON")
public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="PERSON_ID")
    private long id;
    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="person_device", joinColumns=@JoinColumn(name="device_id"), inverseJoinColumns=@JoinColumn(name="person_id"))
    private List<Device> devices;
    
    @Column(name="PERSON_NAME")
    private String name;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="MAIL")
    private String mail;
    @Column(name="PASSWORD")
    private String password;
    @Column(name="ROLE")
    private String role;
    
    

    public Person() {

    }



    public Person(String name, String surname, String mail, String password, String role) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
