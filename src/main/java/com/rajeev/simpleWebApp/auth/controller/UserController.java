package com.rajeev.simpleWebApp.auth.controller;

import com.rajeev.simpleWebApp.auth.dto.LoginDTO;
import com.rajeev.simpleWebApp.auth.model.User;
import com.rajeev.simpleWebApp.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PostMapping("/user/login")
    public String UserLogin(@RequestBody LoginDTO user){
        return userService.loginUser(user);
    }



}
