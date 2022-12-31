package com.example.servlets;

import java.io.*;
import java.util.List;

import com.example.domain.Book;
import com.example.repository.BookRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.ejb.EJB;

@WebServlet(name = "addBookServlet", value = "/add-book-servlet")
public class AddBookServlet extends HttpServlet {

    @EJB
    private BookRepository bookRepository;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("namePage", "Добавление");
        request.getRequestDispatcher("/addBook.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");

        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String description = request.getParameter("description");
        int price = Integer.parseInt(request.getParameter("price"));
        int quant = Integer.parseInt(request.getParameter("quant"));

        Book book = new Book(title, author, quant, price, "", description);
        bookRepository.addBook(book);
        response.sendRedirect(request.getContextPath() + "/index.jsp");
    }
}