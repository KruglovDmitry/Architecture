package com.example.repository;
import com.example.domain.User;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface IUserRepository {

    void addUser(User user);

    List<User> getUsers();
}
