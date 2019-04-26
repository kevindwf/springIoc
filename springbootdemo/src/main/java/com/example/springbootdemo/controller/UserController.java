package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Value("${com.kevin.name}")
    private String name;

    @Value("${com.kevin.age}")
    private String age;

    @RequestMapping("/")
    public String hello(){
        return name + age;
    }
}

