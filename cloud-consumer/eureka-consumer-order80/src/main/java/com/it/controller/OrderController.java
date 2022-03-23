package com.it.controller;

import com.it.common.CommonResult;
import com.it.common.entity.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

/**
 * 描述 ：
 *
 * @author : 小糊涂
 * @version : 1.0
 **/
@RestController
public class OrderController
{

    public static final String PaymentSrv_URL = "http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create") //客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
    public CommonResult create(PaymentEntity payment)
    {
        System.out.println(payment);
        return restTemplate.postForObject(PaymentSrv_URL + "/payment/create",payment,CommonResult.class);
    }


    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id)
    {
        return restTemplate.getForObject(PaymentSrv_URL + "/payment/get/"+id, CommonResult.class, id);
    }

    @GetMapping("/get")
    public CommonResult test(@PathVariable Long id)
    {
        HashMap<String,Object> map = new HashMap<>();
        map.put("id",1);
        ResponseEntity<String> forEntity = restTemplate.getForEntity(PaymentSrv_URL + "/payment/get/" + id, String.class, map);
        System.out.println(forEntity);


        return new  CommonResult(200,"");
    }
}