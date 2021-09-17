package com.spring.eureka.client.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoopingController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/amazon-payment/{price}")
    public String invokePaymentService(@PathVariable int price){
//    restTemplate.getForObject("http://localhost:8888/payment-provider/payNow/"+price,String.class);

       return restTemplate.getForObject("http://PAYMENT-SERVICE/payment-provider/payNow/"+price,String.class);
    }
}
