package com.rawsanj.bootjsp.listeners;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.JmsMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

import java.util.Map;

@Slf4j
@Component
public class EmailListener {

    @Autowired
    public JavaMailSender emailSender;
    private String subject = "BookStoreAppLogs";
    private String mailFrom = "dim4098@gmail.com";
    private String mailTo = "dim4098@yandex.ru";

    @JmsListener(destination = "${emp.jms.topic}", containerFactory = "bookJmsContFactory")
    public void emailBookListener(JmsMessage<Book> msg) {
        Book book = msg.getNewValue();
        String msgText = "Changes have been made in Book entity with following data: /n" +
                "Id: " + book.getId() + " Title: " + book.getTitle() + "Author: " + book.getAuthor() +
                "Description: " + book.getDescription() + "Price: " + book.getPrice() + "Quant: " + book.getQuant();

        SimpleMailMessage mailMsg = new SimpleMailMessage();
        mailMsg.setTo(mailTo);
        mailMsg.setFrom(mailFrom);
        mailMsg.setSubject(subject);
        mailMsg.setText(msgText);

        try{
            this.emailSender.send(mailMsg);
        }
        catch(MailException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
