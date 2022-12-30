package com.example.servlets;

import java.io.*;
import java.util.List;

import com.example.domain.Book;
import com.example.repository.BookRepository;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.ejb.EJB;

@WebServlet(name = "bookServlet", value = "/book-servlet")
public class BooksServlet extends HttpServlet {

    @EJB
    private BookRepository bookRepository;
    private String bookList;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Book> books =  bookRepository.getBooks();
        bookList = "<ul>";
        for (Book book : books) {
            bookList += "<li>" + book.getTitle() + " " + book.getAuthor() + "</li>";
        }
        bookList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h3>Book list:</h3>" + bookList + "</body></html>");
    }
}
