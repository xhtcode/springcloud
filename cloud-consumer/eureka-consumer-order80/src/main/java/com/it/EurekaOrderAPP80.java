package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@EnableEurekaClient
@SpringBootApplication
public class EurekaOrderAPP80 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaOrderAPP80.class, args);
    }
}
