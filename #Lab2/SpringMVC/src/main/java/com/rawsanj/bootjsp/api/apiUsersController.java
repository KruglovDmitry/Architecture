package com.rawsanj.bootjsp.api;

import com.rawsanj.bootjsp.domain.Book;
import com.rawsanj.bootjsp.domain.User;
import com.rawsanj.bootjsp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class apiUsersController {
    @Autowired
    private UserService userService;

    @RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
        return userService.getAll();
    }

    @RequestMapping(path = "/get", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public User get(@RequestParam int id) {
        return userService.get(id);
    }

    @RequestMapping(path = "/create", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public void create(User user) {
        userService.add(user);
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(User user) {
        userService.update(user);
    }

    @RequestMapping(path = "/delete", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestParam int id) {
        userService.delete(id);
    }
}
