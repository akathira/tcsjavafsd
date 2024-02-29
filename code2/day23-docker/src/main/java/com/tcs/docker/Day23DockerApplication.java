package com.tcs.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Day23DockerApplication {

	@GetMapping
	public String message() {
		return "Helle springboot";
	}

	public static void main(String[] args) {
		SpringApplication.run(Day23DockerApplication.class, args);
	}

}
