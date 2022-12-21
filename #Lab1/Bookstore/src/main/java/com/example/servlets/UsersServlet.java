package com.example.servlets;

import java.io.*;
import java.util.List;

import com.example.domain.User;
import com.example.service.IUserService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import javax.ejb.EJB;

@WebServlet(name = "userServlet", value = "/user-servlet")
public class UsersServlet extends HttpServlet {

    @EJB
    private IUserService _userService;
    private String _userList;

    public void init()
    {
        _userList = "<ul>";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<User> users =  _userService.getUsers();
        for (User user : users) {
            _userList += "<li>" + user.getName() + " " + user.getSurname() + "</li>";
        }
        _userList += "</ul>";
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>" + _userList + "</body></html>");
    }

    public void destroy() {
    }
}

