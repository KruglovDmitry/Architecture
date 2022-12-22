package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.User;
import java.util.List;

public interface IUserRepository {

    void addUser(User user);

    List<User> getUsers() throws Exception;
}
