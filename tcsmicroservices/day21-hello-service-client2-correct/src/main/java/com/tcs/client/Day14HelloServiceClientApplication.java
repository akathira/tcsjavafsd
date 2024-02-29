package com.tcs.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@EnableDiscoveryClient
@SpringBootApplication
public class Day14HelloServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14HelloServiceClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate makeTemplate() {
		return new RestTemplate();
	}
 

}
