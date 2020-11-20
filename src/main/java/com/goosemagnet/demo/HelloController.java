package com.goosemagnet.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/time")
    public String getTime() {
        return new Date().toString();
    }

    @RequestMapping(path="/{name}")
    public String helloWorld(@PathVariable("name") String name) {
        return String.format("Hello, %s!", name);
    }
}
