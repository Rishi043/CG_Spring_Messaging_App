package com.messagingapp;

import org.springframework.web.bind.annotation.*;

// UC-1 Code
@RestController
public class MessagingApplication {
    @GetMapping("/hello")
    public String sayHello() {

        return "Hello From Bridgelabz";
    }
}



