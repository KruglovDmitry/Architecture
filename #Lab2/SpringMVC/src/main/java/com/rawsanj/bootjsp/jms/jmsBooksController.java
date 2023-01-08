package com.rawsanj.bootjsp.jms;

import com.rawsanj.bootjsp.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;

@Slf4j
@RestController
@RequestMapping("jms/books")
public class jmsBooksController {

    @Autowired
    JmsTemplate jmsTemplate;

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public ResponseEntity<Book> newBook(@RequestBody Book book) {
        try {
            Topic empTopic = jmsTemplate.getConnectionFactory().createConnection()
                    .createSession().createTopic("EmpTopic");
            int bookId = (int)(Math.random() * 50 + 1);
            Book bookJMS = Book.builder().id(bookId).Title(book.getTitle()).Author(book.getAuthor()).build();
            log.info("Sending Book Object: " + bookJMS);
            jmsTemplate.convertAndSend(empTopic, bookJMS);
            return new ResponseEntity<>(bookJMS, HttpStatus.OK);

        } catch (Exception exception) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}