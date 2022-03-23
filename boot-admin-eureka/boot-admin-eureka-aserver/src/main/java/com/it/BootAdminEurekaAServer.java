package com.it;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@SpringBootApplication
@EnableAdminServer
public class BootAdminEurekaAServer {
    public static void main(String[] args) {
        SpringApplication.run(BootAdminEurekaAServer.class,args);
    }
}
