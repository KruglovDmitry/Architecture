package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService _bookService;

    @RequestMapping("/all")
    public String getAll(ModelMap model) {
        model.addAttribute("bookList", "book list");
        return "books";
    }
}