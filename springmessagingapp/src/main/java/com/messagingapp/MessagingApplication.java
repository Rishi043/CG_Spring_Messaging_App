package com.messagingapp;

import org.springframework.web.bind.annotation.*;

// UC-1 Code
@RestController
public class MessagingApplication {
    @GetMapping("/hello")
    public String sayHello() {

        return "Hello From Bridgelabz";
    }

    // UC-2 Code
    @GetMapping("/hello/query")
    public String fetchName(@RequestParam String name){

        return "Hello "+name;
    }

    @GetMapping("/hello/param/{name}")
    public String fetchNameWithPath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }

}





