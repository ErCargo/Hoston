package com.ez.hostons.controller;

import com.ez.hostons.domain.entity.User;
import com.ez.hostons.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ercargo  on 2020/4/6
 * @DESCRIBE
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/{id}")
    public User findById(@PathVariable Integer id) {
        return this.userService.findById(id);

    }

}
