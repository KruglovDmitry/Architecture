package com.example.servlets;

import com.example.domain.User;
import com.example.repository.UserRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;

import jakarta.ejb.EJB;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addUserServlet", value = "/add-user-servlet")
public class AddUserServlet extends HttpServlet {

    @EJB
    private UserRepository userRepository;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");
        request.setAttribute("namePage", "Добавление");
        request.getRequestDispatcher("/addUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        int age = Integer.parseInt(request.getParameter("age"));

        User user = new User(name, surname, login, password, age, false);
        userRepository.addUser(user);
        response.sendRedirect(request.getContextPath() + "/index");
    }
}