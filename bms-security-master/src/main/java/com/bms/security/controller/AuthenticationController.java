package com.bms.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;
import com.bms.security.dto.AuthRequest;
import com.bms.security.service.JwtService;

@RestController
@RequestMapping("/bms")
public class AuthenticationController {

	@Autowired
	private JwtService jwtService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/admin")
	@PreAuthorize("hasAuthority('admin')")
	public String admin() {
		return "Welcome admin";
	}

	@GetMapping("/user")
	@PreAuthorize("hasAuthority('user')")
	public String user() {
		return "Welcome user";
	}

	@PostMapping("/authenticate")
	public ResponseEntity<String> authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
		String username = authRequest.getUsername();
		String password = authRequest.getPassword();
		try {
			Authentication authentication = authenticationManager
					.authenticate(new UsernamePasswordAuthenticationToken(username, password));

			SecurityContextHolder.getContext().setAuthentication(authentication);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>("Invalid Credentials", HttpStatus.UNAUTHORIZED);
		}
		String jwt = jwtService.generateToken(username);
		return new ResponseEntity<String>(jwt, HttpStatus.OK);

	}
}
