package com.spring.eureka.client.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AmazonShoppingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonShoppingApplication.class, args);
	}

	@LoadBalanced
	@Bean
	public RestTemplate getTemplate(){return new RestTemplate();}

}
