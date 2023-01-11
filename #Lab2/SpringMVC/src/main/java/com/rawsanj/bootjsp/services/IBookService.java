package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;

import javax.jms.JMSException;
import java.util.List;

public interface IBookService {

    List<Book> getAll();

    Book get(int id);

    void add(Book book) throws JMSException;

    void update (Book book) throws JMSException;

    void delete(int id) throws JMSException;
}