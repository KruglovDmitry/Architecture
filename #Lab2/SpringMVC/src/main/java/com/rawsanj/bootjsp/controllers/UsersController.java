package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService _userService;

    @RequestMapping("/all")
    public String greeting(ModelMap model) {
        model.addAttribute("userList", "user list");
        return "users";
    }
}