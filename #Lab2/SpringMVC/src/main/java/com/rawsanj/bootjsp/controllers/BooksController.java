package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/all")
    public ModelAndView getAll(ModelMap model) {
        List<Book> books =  bookService.getAll();
        ModelAndView mav = new ModelAndView("bookList");
        mav.addObject("books", books);
        return mav;
    }

    @RequestMapping("/add")
    public String addBook(ModelMap model) {
        Book book = new Book();
        model.put("book", book);
        return "editBook";
    }

    @RequestMapping("/update")
    public String updateBook(ModelMap model) {

        return "editBook";
    }

    @RequestMapping("/save")
    public String saveBook(@ModelAttribute("book") Book book) {
        if (book.getId() == 0) {
            bookService.add(book);
        }
        else {
            bookService.update(book);
        }
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteBook(ModelMap model) {
        return "redirect:/";
    }
}