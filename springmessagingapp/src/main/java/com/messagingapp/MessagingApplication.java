package com.messagingapp;

import org.springframework.web.bind.annotation.*;

// UC-1 Code
@RestController
@RequestMapping("/sayhello")
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

    @PostMapping("/post")
    public String greetUser(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // UC-5 Code
    @RequestMapping("/hello/put/{firstName}")
    public String greetUserPut(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
}

}





