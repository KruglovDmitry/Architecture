package com.rawsanj.bootjsp.listeners;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.Log;
import com.rawsanj.bootjsp.repositories.BookRepository;
import com.rawsanj.bootjsp.repositories.LogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class DBWriteListener {

    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
    @Autowired
    private LogRepository logRepository;

    @JmsListener(destination = "${emp.jms.topic}", containerFactory = "bookJmsContFactory")
    public void dbWriteBookListener(Book book) {
        String description = "Id: " + book.getId() + " Title: " + book.getTitle() + "Author: " + book.getAuthor() +
                "Description: " + book.getDescription() + "Price: " + book.getPrice() + "Quant: " + book.getQuant();
        String timeStamp = sdf.format(new Date());
        Log newLog = new Log("", Book.class.toString(), description, timeStamp);
        logRepository.add(newLog);
    }
}
