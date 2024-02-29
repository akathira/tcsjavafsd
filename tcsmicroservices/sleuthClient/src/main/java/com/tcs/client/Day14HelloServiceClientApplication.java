package com.tcs.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Day14HelloServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day14HelloServiceClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate makeTemplate()
	{
		return new RestTemplate();
	}

}
