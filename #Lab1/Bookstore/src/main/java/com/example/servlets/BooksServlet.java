package com.example.servlets;

import java.io.*;
import java.util.List;

import com.example.domain.Book;
import com.example.service.IBookService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.ejb.EJB;

@WebServlet(name = "bookstoreServlet", value = "/bookstore-servlet")
public class BooksServlet extends HttpServlet {

    @EJB
    private IBookService _bookService;
    private String _bookList;

    public void init()
    {
        _bookList = "<ul>";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Book> books =  _bookService.getBooks();
        for (Book book : books) {
            _bookList += "<li>" + book.getTitle() + " " + book.getAuthor() + "</li>";
        }
        _bookList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>" + _bookList + "</body></html>");
    }

    public void destroy() {
    }
}
