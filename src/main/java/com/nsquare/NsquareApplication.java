package com.nsquare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NsquareApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(NsquareApplication.class, args);
	}
}
