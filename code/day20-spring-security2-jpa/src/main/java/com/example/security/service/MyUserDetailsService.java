package com.example.security.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.example.security.repository.UserRepository;
import com.example.security.model.MyUserDetails;
import com.example.security.model.User;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user=repo.findByUserName(username);
		user.orElseThrow(() -> (new UsernameNotFoundException("Not found username"+ username)));
		
		return user.map(MyUserDetails::new).get();
	}
	

}
