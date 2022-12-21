package com.example.domain;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

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
        this.Id = id;
    }

    public int getId() {
        return this.Id;
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
