package com.nsquare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/")
	public String loggedIn() {
		System.out.println("inside userhome");
		return "userhome";
	}
	
}
