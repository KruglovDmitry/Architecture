package com.rawsanj.bootjsp.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javax.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
@JacksonXmlRootElement(localName = "User")
public class User implements Serializable {
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

