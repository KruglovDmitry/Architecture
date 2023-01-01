package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public interface IBookService {

    List<Book> getAll();

    Book get(int id);

    void add(Book book);

    void update (Book book);

    void delete(int id);
}