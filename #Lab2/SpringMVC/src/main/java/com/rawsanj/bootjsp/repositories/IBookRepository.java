package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public interface IBookRepository {

    List<Book> getAll();

    Book get(int id);

    void add(Book book);

    void update(Book book);

    void delete(int id);
}
