package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public ModelAndView getAll(ModelMap model) {
        List<User> users =  userService.getAll();
        ModelAndView mav = new ModelAndView("userList");
        mav.addObject("users", users);
        return mav;
    }
    @RequestMapping("/add")
    public String addUser(ModelMap model) {
        User user = new User();
        model.put("user", user);
        return "editUser";
    }

    @RequestMapping("/update")
    public String updateUser(ModelMap model) {

        return "editUser";
    }

    @RequestMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {
        if (user.getId() == 0) {
            userService.add(user);
        }
        else {
            userService.update(user);
        }
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteUser(ModelMap model) {

        return "userList";
    }
}