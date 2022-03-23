package com.it.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    public static final String PaymentSrv_URL = "http://boot-admin-eureka-provider";
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hello")
    public String hello() {
        String body = restTemplate.getForEntity(PaymentSrv_URL+"/hello", String.class).getBody();
        return body;
    }
}
