package com.tcs.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/api/client")
public class HelloClientController {

	@Autowired
	RestTemplate template;
	
	@HystrixCommand(fallbackMethod="fallback",
			groupKey="Hello",
			commandKey="hello",
			threadPoolKey="helloThread"
	)
	
	/*
	 * @GetMapping public String callServer() { String url =
	 * "http://localhost:8093/rest/service/status"; String
	 * output=template.getForObject(url, String.class); return output; }
	 */
	
	public String fallback(Throwable hystrixCommand)
	{
		return "Fallback Hello World";
	}
	
	@GetMapping
	@CircuitBreaker(name="CLIENT_SERVICE", fallbackMethod= "callOnFail")
	public String callServer() {
		String url="http://localhost:8094/reset/service";
		String output=template.getForObject(url, String.class);
		return output;
	}
	
	
}
