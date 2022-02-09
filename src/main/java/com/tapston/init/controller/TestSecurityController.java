package com.tapston.init.controller;

import com.tapston.init.entity.UserEntity;
import com.tapston.init.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/get")
    public String getAdmin() {
        return "Hi admin";
    }

    @GetMapping("/user/get")
    public String getUser() {
        return "Hi user";
    }

    @GetMapping("/user/get/{login}")
    public UserEntity read(@PathVariable String login) {
        return userService.findByLogin(login) ;
    }
}
