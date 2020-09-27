package com.hncj.controller;

import com.hncj.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({User.class})
public class UserController {

    @Autowired
    private User user;

    @GetMapping("/getUser")
    public String getUser(){
        return user.toString();
    }


}
