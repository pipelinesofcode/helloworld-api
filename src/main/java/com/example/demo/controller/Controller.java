package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Controller {
    @GetMapping("/hello")
    public String getGreeting(){
        return "Hello there ! The time is " + new Date().toString();
    }
}
