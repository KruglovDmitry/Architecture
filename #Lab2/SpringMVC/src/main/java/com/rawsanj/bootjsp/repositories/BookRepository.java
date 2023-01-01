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
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Book book = (Book) session.get(Book.class, id);
            session.getTransaction().commit();
            return book;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(book);
            System.out.println("Successfully update book with id - " + book.getId());
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Book book = (Book) session.get(Book.class, id);
            session.delete(book);
            System.out.println("Successfully delete book with id - " + id);
            session.getTransaction().commit();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
