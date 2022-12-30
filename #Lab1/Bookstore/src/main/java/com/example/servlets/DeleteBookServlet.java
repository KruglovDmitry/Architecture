package com.example.servlets;

import com.example.domain.Book;
import com.example.repository.BookRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

import jakarta.ejb.EJB;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "deleteBookServlet", value = "/delete-book-servlet")
public class DeleteBookServlet extends HttpServlet {

    @EJB
    private BookRepository bookRepository;
    private String bookList;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Book> books =  bookRepository.getBooks();
        bookList = "<ul>";
        for (Book book : books) {
            bookList += "<li><a href=\"/delete-book-servlet/" + book.getId() + "\">" + book.getTitle() + " " + book.getAuthor() + "</li>";
        }
        bookList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h3>Choose book to delete:</h3>" + bookList + "</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        bookRepository.deleteBook(id);
        response.sendRedirect(request.getContextPath() + "/index");
    }
}
