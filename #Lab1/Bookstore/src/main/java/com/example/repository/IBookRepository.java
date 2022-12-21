package com.example.repository;
import com.example.domain.Book;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface IBookRepository {

    void addBook(Book book);

    List<Book> getBooks();
}
