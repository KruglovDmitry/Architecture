package com.rawsanj.bootjsp.api;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.jms.JMSException;
import java.util.List;

@RestController
@RequestMapping("api/books")
public class apiBooksController {
    @Autowired
    private BookService bookService;

    public apiBooksController() {}

    @RequestMapping(
            path = "/all",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public List<Book> getAll() { return bookService.getAll(); }

    @RequestMapping(
            path = "/get",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public Book get(@RequestParam int id) {
        return bookService.get(id);
    }

    @RequestMapping(
            path = "/create",
            method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public void create(Book book) throws JMSException {
        bookService.add(book);
    }

    @RequestMapping(
            path = "/update",
            method = RequestMethod.POST,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public void update(Book book) throws JMSException {
        bookService.update(book);
    }

    @RequestMapping(
            path = "/delete",
            method = RequestMethod.DELETE,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            consumes = MediaType.ALL_VALUE)
    public void delete(@RequestParam int id) throws JMSException {
        bookService.delete(id);
    }
}
