package com.rajeev.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        return "Welcome to Spring boot ...";
    }

    @RequestMapping("/about")
    public String abount() {
        return "We are in about page..!";
    }

}

