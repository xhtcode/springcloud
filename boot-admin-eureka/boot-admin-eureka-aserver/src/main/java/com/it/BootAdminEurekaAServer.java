package com.it;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient
public class BootAdminEurekaAServer {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminEurekaAServer.class,args);
    }
}
