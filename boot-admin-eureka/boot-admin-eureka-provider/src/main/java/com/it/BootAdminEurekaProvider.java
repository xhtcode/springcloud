package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BootAdminEurekaProvider {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminEurekaProvider.class, args);
    }
}
