package com.rawsanj.bootjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/books")
public class BooksController {

    @RequestMapping("/all")
    public String getAll(ModelMap model) {
        model.addAttribute("bookList", "book list");
        return "books";
    }
}