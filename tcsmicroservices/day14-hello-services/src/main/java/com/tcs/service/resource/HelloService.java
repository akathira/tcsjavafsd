package com.tcs.service.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/service")
public class HelloService {
	
	@Value("name")
	String str;
	
	@Autowired
	Environment environment;
	
	@Value("${spring.application.name}")
	String strg;
	
	@GetMapping
	public String Welcome()
	{
		String port=environment.getProperty("server.port");
		return "Programming Micsroservice 0" + port + "Appname :" + strg;
	}
	@GetMapping("/status")
	public String status()
	{
	
		return "Up and running-->" ;
	}
	

}
