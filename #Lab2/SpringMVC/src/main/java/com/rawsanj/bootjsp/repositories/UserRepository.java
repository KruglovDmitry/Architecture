package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {
    @Autowired
    private SessionFactory sessionFactory;

    public UserRepository() {
    }

    @Override
    public List<User> GetUsers() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            List<User> users = session.createCriteria(User.class).list();
            session.getTransaction().commit();
            return users;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void AddUser(User user) {
    }
}
