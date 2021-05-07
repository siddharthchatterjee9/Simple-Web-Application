package com.example.simplewebapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @RequestMapping("/")
    public String index() {
        return "This is 19BCE2249 Siddharth Chatterjee!\nHello World with Java on Spring!";
    }

}
