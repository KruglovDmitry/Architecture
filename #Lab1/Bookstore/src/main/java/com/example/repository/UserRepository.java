package com.example.repository;

import com.example.domain.Book;
import com.example.domain.User;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserRepository implements IUserRepository{

    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public UserRepository() {
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public List<User> getUsers() {
        return entityManager.createQuery("SELECT * FROM users").getResultList();
    }
}
