package com.tcs.service.resource;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class HelloService {
	
	private static final Logger logger= LoggerFactory.getLogger(HelloService.class);
	
	@GetMapping("/data")
	public String sendRespone() {
		logger.info("in service: ");
		return "From services";
	}
	

}
