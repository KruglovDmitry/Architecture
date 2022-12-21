package com.example.repository;

import com.example.domain.Book;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class BookRepository implements IBookRepository  {

    @PersistenceContext(unitName = "default")
    private EntityManager entityManager;

    public BookRepository() {
    }

    public void addBook(Book book) {
        entityManager.persist(book);
    }

    public List<Book> getBooks() {
        return entityManager.createQuery("SELECT * FROM books").getResultList();
    }
}
