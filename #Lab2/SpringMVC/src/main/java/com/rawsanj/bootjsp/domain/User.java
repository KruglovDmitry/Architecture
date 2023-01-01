package com.rawsanj.bootjsp.domain;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "users")
@XmlRootElement
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String Name;

    @Column(name = "surname")
    private String Surname;

    @Column(name = "login")
    private String Login;

    @Column(name = "password")
    private String Password;

    @Column(name = "age")
    private int Age;

    @Column(name = "goldstatus")
    private Boolean Goldstatus;

    public User() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getName() {
        return this.Name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getSurname() {
        return this.Surname;
    }

    public void setLogin(String login) {
        this.Login = login;
    }

    public String getLogin() {
        return this.Login;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public int getAge() {
        return this.Age;
    }

    public void setGoldstatus(boolean goldstatus) {
        this.Goldstatus = goldstatus;
    }

    public boolean getGoldstatus() {
        return this.Goldstatus;
    }
}

