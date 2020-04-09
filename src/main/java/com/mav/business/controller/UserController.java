package com.mav.business.controller;

import com.mav.business.model.User;
import com.mav.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static java.util.Objects.isNull;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService serVice;

    public void createUser(@PathVariable String firstName, @PathVariable String lastName) {
        if (!isNull(firstName) && !isNull(lastName)) {
            User user = new User();
            user.setFirstName(firstName);
            user.setLastName(lastName);
        }


    }
}
