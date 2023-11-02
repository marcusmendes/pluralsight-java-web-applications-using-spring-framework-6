package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

    @GetMapping("/me")
    public User getUser() {
        User user = new User();
        user.setId(1L);
        user.setName("John");
        return user;
    }
}
