package com.xunle.controller;

import com.xunle.pojo.User;
import com.xunle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xunle
 */

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String register(@RequestParam User user) {
        System.out.println("register ==========> " +user);
        userService.register(user);

        return "/user";
    }
}
