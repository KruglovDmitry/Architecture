package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public interface IBookService {

    void addBook(Book book);

    List<Book> getBooks() throws Exception;
}