package com.rawsanj.bootjsp.controllers;

import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    public String getAll(ModelMap model) {
        return "index";
    }
}