package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.User;
import java.util.List;

public interface IUserRepository {
    public List<User> GetUsers();

    public void AddUser(User user);
}
