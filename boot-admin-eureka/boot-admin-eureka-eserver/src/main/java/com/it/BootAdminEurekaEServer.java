package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@EnableEurekaServer
@SpringBootApplication
public class BootAdminEurekaEServer {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminEurekaEServer.class, args);
    }
}
