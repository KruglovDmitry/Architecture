package com.example.service;

import com.example.domain.Book;
import com.example.repository.BookRepository;
import com.example.repository.UserRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class BookService implements  IBookService{
    @EJB
    private BookRepository _bookRepository;

    public BookService() {
    }

    @Override
    public void addBook(Book book) {
        _bookRepository.addBook(book);
    }

    @Override
    public List<Book> getBooks() {
        return _bookRepository.getBooks();
    }
}
