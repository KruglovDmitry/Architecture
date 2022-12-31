package com.example.servlets;

import java.io.*;
import java.util.List;
import com.example.domain.Book;
import com.example.repository.BookRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.ejb.EJB;

@WebServlet(name = "bookServlet", value = "/book-servlet")
public class BooksServlet extends HttpServlet {

    @EJB
    private BookRepository bookRepository;
    private String bookList;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Book> books =  bookRepository.getBooks();
        bookList = "<ul>";
        for (Book book : books) {
            bookList += "<li><a href=\"delete-book-servlet?id=" + book.getId() + "\">" +
                    book.getTitle() + " " + book.getAuthor() + "</li>";
        }
        bookList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h4>List of all books</h4><span>click on book to delete</span>" + bookList + "</body></html>");
    }
}
