package com.example.prueba.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@CrossOrigin(value = "*", allowCredentials = "true")
public class Controller {

    @GetMapping("")
    public String getData() {
        return "Hello world";
    }

}
