package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService implements  IBookService{

    @Autowired
    private BookRepository bookRepository;

    public BookService() {
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book get(int id) {
        return bookRepository.get(id);
    }

    @Override
    public void add(Book book) {
        bookRepository.add(book);
    }

    @Override
    public void update(Book book) {

        bookRepository.update(book);
    }

    @Override
    public void delete(int id) {

        bookRepository.delete(id);
    }
}