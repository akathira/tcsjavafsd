package com.tcs.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Day14ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14ApiGatewayApplication.class, args);
	}

}
