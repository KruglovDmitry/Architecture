package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BookService bookService;

    private String bookList = "";

    @RequestMapping("/all")
    public String getAll(ModelMap model) {
        List<Book> books =  bookService.getBooks();

        bookList = "<ul>";
        for (Book book : books) {
            bookList += "<li>" + book.getTitle() + " " + book.getAuthor() + "</li>";
        }
        bookList += "</ul>";

        model.addAttribute("bookList", "<h3>Список книг: </h3>" + bookList);
        return "books";
    }
}