package com.example.repository;

import com.example.domain.Book;
import java.util.List;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public BookRepository() {
    }

    public List<Book> getBooks() {
        return entityManager.createQuery("SELECT b FROM book b").getResultList();
    }

    public void addBook(Book book) {
        entityManager.persist(book);
    }

    public void deleteBook(int id) {
        Book book = entityManager.find(Book.class, id);
        entityManager.remove(book);
    }
}
