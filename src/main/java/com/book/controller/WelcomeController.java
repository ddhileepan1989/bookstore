package com.book.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/{name}")
    public String hello(@PathVariable String name) {
        return "Welcome Mr. " + name;
    }
}
