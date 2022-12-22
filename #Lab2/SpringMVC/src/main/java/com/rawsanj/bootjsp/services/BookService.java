package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.repositories.BookRepository;
import javax.ejb.EJB;
import java.util.List;

public class BookService implements  IBookService{

    private BookRepository _bookRepository;

    public BookService() {
    }

    @Override
    public void addBook(Book book) {
        _bookRepository.addBook(book);
    }

    @Override
    public List<Book> getBooks() throws Exception {
        return _bookRepository.getBooks();
    }
}