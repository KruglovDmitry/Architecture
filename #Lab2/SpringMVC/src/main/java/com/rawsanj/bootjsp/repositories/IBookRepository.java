package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public interface IBookRepository {

    public List<Book> GetBooks();

    public void AddBook(Book book);
}
