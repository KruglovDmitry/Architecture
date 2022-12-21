package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class UserService implements  IUserService {

    @EJB
    private UserRepository _userRepository;

    public UserService() {
    }

    @Override
    public void addUser(User user) {
        _userRepository.addUser(user);
    }

    @Override
    public List<User> getUsers() {
        return _userRepository.getUsers();
    }
}
