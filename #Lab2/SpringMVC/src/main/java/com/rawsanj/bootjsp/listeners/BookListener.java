package com.rawsanj.bootjsp.listeners;

import com.rawsanj.bootjsp.domain.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BookListener {
    @JmsListener(destination = "${emp.jms.topic}", containerFactory = "bookJmsContFactory")
    public void getBookListener1(Book book) {

        log.info("Book listener1: " + book);
    }

    @JmsListener(destination = "${emp.jms.topic}", containerFactory = "bookJmsContFactory")
    public void getBookListener2(Book book) {

        log.info("Book Listener2: " + book);
    }
}