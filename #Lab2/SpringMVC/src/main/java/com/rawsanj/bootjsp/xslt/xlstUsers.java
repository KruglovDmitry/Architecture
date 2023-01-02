package com.rawsanj.bootjsp.xslt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.domain.Users;
import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.io.StringReader;

@Controller
@RequestMapping("/xsltUsers")
public class xlstUsers {

    @Autowired
    private UserService userService;

    @RequestMapping(
            path = "/all",
            method = RequestMethod.GET)
    public ModelAndView getAll(Model model) throws JsonProcessingException {
        Users users = new Users(userService.getAll());

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(users);
        StringReader xmlString = new StringReader(xml);
        System.out.println(xml);
        ModelAndView mav = new ModelAndView("users");
        mav.addObject("Users", xmlString);
        return mav;
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam int id, Model model) throws JsonProcessingException {
        User user = userService.get(id);

        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(user);
        StringReader xmlString = new StringReader(xml);

        ModelAndView mav = new ModelAndView("user");
        mav.addObject("User", xmlString);
        return mav;
    }
}
