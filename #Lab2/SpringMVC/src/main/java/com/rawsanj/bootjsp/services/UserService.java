package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService implements  IUserService {

    @Autowired
    private UserRepository _userRepository;

    public UserService() {
    }

    @Override
    public void addUser(User user) {
        _userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return _userRepository.findAll();
    }
}