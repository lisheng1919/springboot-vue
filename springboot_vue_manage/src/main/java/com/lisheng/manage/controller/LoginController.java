package com.lisheng.manage.controller;

import com.lisheng.manage.domain.User;
import com.lisheng.manage.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class LoginController {

    @Resource
    private UserService userService;

    @GetMapping(value = "login")
    public List<User> login(){
        return userService.findAllUser();
    }
}
