package com.rawsanj.bootjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/users")
public class UsersController {

    @RequestMapping("/all")
    public String greeting(ModelMap model) {
        model.addAttribute("userList", "user list");
        return "users";
    }
}