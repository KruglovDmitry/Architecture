package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    private String userList = "";

    @RequestMapping("/all")
    public String getAll(ModelMap model) {
        List<User> users =  userService.getUsers();

        userList = "<ul>";
        for (User user : users) {
            userList += "<li>" + user.getName() + " " + user.getSurname() + "</li>";
        }
        userList += "</ul>";

        model.addAttribute("userList", "<h3>Список пользователей:</h3>" + userList);
        return "users";
    }
}