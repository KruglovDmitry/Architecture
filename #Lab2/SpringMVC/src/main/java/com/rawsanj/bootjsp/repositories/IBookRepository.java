package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public interface IBookRepository {

    void addBook(Book book);

    List<Book> getBooks() throws Exception;
}
