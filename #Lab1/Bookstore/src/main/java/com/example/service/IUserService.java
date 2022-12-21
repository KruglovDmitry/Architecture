package com.example.service;
import com.example.domain.User;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface IUserService {

    void addUser(User user);

    List<User> getUsers();
}
