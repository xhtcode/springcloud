package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@EnableEurekaClient
@EnableDiscoveryClient //服务注册与发现
@SpringBootApplication
public class EurekaPaymentAPP8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPaymentAPP8001.class, args);
    }

}
