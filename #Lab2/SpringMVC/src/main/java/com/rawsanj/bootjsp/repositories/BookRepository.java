package com.rawsanj.bootjsp.repositories;

import com.rawsanj.bootjsp.domain.Book;
import java.util.List;

public class BookRepository implements IBookRepository  {

    public BookRepository() {
    }

    public void addBook(Book book) {
    }

    public List<Book> getBooks() throws Exception {
        throw new Exception();
    }
}
