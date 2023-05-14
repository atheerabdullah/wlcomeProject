package com.example.demo3.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/Get")
public class welcomeController {

    @GetMapping(path = "/name")
    public String name() {
        return "My name is : atheer ";
    }

    @GetMapping(path = "/age")
    public String age() {
        return "My age is : 25 ";
    }

    @GetMapping(path = "/check/status")
    public String status() {
        return "Everything OK";
    }
    @GetMapping(path = "/health")
    public String health() {
        return "Server health is up and running";
    }
}
