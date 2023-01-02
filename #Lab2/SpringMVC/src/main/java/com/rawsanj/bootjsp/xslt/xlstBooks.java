package com.rawsanj.bootjsp.xslt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.Books;
import com.rawsanj.bootjsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.io.StringReader;

@Controller
@RequestMapping("/xsltBooks")
public class xlstBooks {

    @Autowired
    private BookService bookService;

    @RequestMapping(
            path = "/all",
            method = RequestMethod.GET)
    public ModelAndView getAll(Model model) throws JsonProcessingException {
        Books books = new Books(bookService.getAll());

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(books);
        StringReader xmlString = new StringReader(xml);

        ModelAndView mav = new ModelAndView("books");
        mav.addObject("Books", xmlString);
        return mav;
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam int id, Model model) throws JsonProcessingException {
        Book book = bookService.get(id);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(book);
        StringReader xmlString = new StringReader(xml);

        ModelAndView mav = new ModelAndView("book");
        mav.addObject("Book", xmlString);
        return mav;
    }
}
