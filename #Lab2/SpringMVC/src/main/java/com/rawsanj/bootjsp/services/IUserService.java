package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.User;
import java.util.List;

public interface IUserService {
    List<User> getAll();

    User get(int id);
    void add(User user);

    void update(User user);

    void delete(int id);
}
