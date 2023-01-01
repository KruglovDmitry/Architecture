package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class BookRepository implements IBookRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public BookRepository() {
    }

    @Override
    public List<Book> getAll() {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            List<Book> books = session.createCriteria(Book.class).list();
            session.getTransaction().commit();
            return books;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Book get(int id) {
        return null;
    }

    @Override
    public void add(Book book) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Integer id = (Integer) session.save(book);
            System.out.println("Successfully create book with id - " + id);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(int id) {

    }
}
