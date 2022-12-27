package com.example.repository;

import com.example.domain.User;
import java.util.List;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public UserRepository() {
    }

    public void addUser(User user) {
        entityManager.persist(user);
    }

    public List<User> getUsers() {
        return entityManager.createQuery("SELECT u FROM user u").getResultList();
    }
}
