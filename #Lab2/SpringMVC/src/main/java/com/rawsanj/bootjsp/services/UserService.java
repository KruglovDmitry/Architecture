package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.repositories.UserRepository;
import javax.ejb.EJB;
import java.util.List;

public class UserService implements  IUserService {


    private UserRepository _userRepository;

    public UserService() {
    }

    @Override
    public void addUser(User user) {
        _userRepository.addUser(user);
    }

    @Override
    public List<User> getUsers() throws Exception {
        return _userRepository.getUsers();
    }
}