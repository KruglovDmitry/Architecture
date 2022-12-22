package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.User;
import java.util.List;

public interface IUserService {

    void addUser(User user);

    List<User> getUsers() throws Exception;
}
