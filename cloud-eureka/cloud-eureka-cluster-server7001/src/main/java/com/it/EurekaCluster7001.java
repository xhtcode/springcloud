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
public class EurekaCluster7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaCluster7001.class,args);
    }

}
