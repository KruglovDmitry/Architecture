package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService implements  IUserService {

    @Autowired
    private UserRepository userRepository;

    public UserService() {
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User get(int id) {
        return userRepository.get(id);
    }

    @Override
    public void add(User user) {

        userRepository.add(user);
    }

    @Override
    public void update(User user) {
        userRepository.update(user);
    }

    @Override
    public void delete(int id) {
        userRepository.delete(id);
    }
}