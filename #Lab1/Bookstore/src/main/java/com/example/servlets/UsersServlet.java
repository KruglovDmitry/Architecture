package com.example.servlets;

import java.io.*;
import java.util.List;

import com.example.domain.User;
import com.example.repository.UserRepository;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import jakarta.ejb.EJB;

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UsersServlet extends HttpServlet {

    @EJB
    private UserRepository userRepository;
    private String userList;

    public void init()
    {
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<User> users =  userRepository.getUsers();
        userList = "<ul>";
        for (User user : users) {
            userList += "<li>" + user.getName() + " " + user.getSurname() + "</li>";
        }
        userList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h3>User list:</h3>" + userList + "</body></html>");
    }

    public void destroy() {
    }
}

