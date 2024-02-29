package com.tcs.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class HelloClientController {

private static final Logger logger= LoggerFactory.getLogger(HelloClientController.class);

@Autowired
RestTemplate template;
	
	@GetMapping("/data")
	public String callServer() {
		logger.info("in Client: ");
		return "From Client";
	}
	}
