package com.example.domain;
import jakarta.persistence.*;

@Entity(name="user")
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;

    @Column(name = "goldstatus")
    private Boolean goldStatus;

    public User() {
    }

    public User(String name, String surname, String login, String password, int age, Boolean goldStatus) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.age = age;
        this.goldStatus = goldStatus;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getGoldStatus() {
        return goldStatus;
    }

    public void setGoldStatus(Boolean goldStatus) {
        this.goldStatus = goldStatus;
    }
}
