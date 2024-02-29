package com.bms.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bms.security.entity.UserInfo;
import com.bms.security.service.UserService;

@RestController
@RequestMapping("/bms/public")
public class PublicController {
	
	@Autowired
	private UserService service;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome Home";
	}

	@PostMapping("/adduser")
	public String addNewUser(@RequestBody UserInfo userInfo) {
		return service.addUser(userInfo);
	}

}
