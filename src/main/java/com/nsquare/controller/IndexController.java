package com.nsquare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.nsquare.model.User;
import com.nsquare.repo.UserRepository;

@Controller
public class IndexController {
	
	@Autowired
	UserRepository repoUser;
	
	@Autowired
	PasswordEncoder encodePass;
	
	@GetMapping("/")
	public String getIndex() {
		/*User user = new User();
		user.setName("ajay datla");
		user.setUserId("ajaydatlalbn06@gmail.com");
		user.setPassword(encodePass.encode("ajaydatla"));
		repoUser.insert(user);*/
		
		return "index";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
	@PostMapping("/signin")
	public String loginError() {
		return "login";
	}

}
