package com.rawsanj.bootjsp.services;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.JmsMessage;
import com.rawsanj.bootjsp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Topic;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookService implements  IBookService{

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    JmsTemplate jmsTemplate;

    public BookService() {
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.getAll();
    }

    @Override
    public Book get(int id) {
        return bookRepository.get(id);
    }

    @Override
    public void add(Book book) throws JMSException {
        System.out.println("Add book: " + book);

        Topic topic = jmsTemplate
                .getConnectionFactory()
                .createConnection()
                .createSession()
                .createTopic("EmpTopic");

        JmsMessage<Book> msg = new JmsMessage<Book>("add", book);
        jmsTemplate.convertAndSend(topic, msg);
        bookRepository.add(book);
    }

    @Override
    public void update(Book book) throws JMSException {
        System.out.println("Update book: " + book);

        Topic topic = jmsTemplate
                .getConnectionFactory()
                .createConnection()
                .createSession()
                .createTopic("EmpTopic");

        JmsMessage<Book> msg = new JmsMessage<Book>("update", book);
        jmsTemplate.convertAndSend(topic, msg);

        bookRepository.update(book);
    }

    @Override
    public void delete(int id) throws JMSException {
        System.out.println("Update book with id: " + id);

        Topic topic = jmsTemplate
                .getConnectionFactory()
                .createConnection()
                .createSession()
                .createTopic("EmpTopic");

        Book book = bookRepository.get(id);
        JmsMessage<Book> msg = new JmsMessage<Book>("delete", book);
        jmsTemplate.convertAndSend(topic, msg);

        bookRepository.delete(id);
    }
}