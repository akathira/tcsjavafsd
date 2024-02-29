package com.tcs.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Day14HelloServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14HelloServicesApplication.class, args);
	}

}
