package com.example.service;
import com.example.domain.Book;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface IBookService {

    void addBook(Book book);

    List<Book> getBooks();
}
