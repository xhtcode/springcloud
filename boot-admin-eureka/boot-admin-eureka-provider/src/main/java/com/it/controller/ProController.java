package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProController {
    @RequestMapping("/hello")
    public String index() {
        return "hello this is first messge";
    }
}
