package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService implements  IBookService{

    @Autowired
    private BookRepository _bookRepository;

    public BookService() {
    }

    @Override
    public void addBook(Book book) {
        _bookRepository.save(book);
    }

    @Override
    public List<Book> getBooks() {
        return _bookRepository.findAll();
    }
}