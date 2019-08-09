package com.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySecondSpringBootApplication {

	@RequestMapping("/sayMessage")
	public String getMessage() {
		return "Congrats, you have been a witness to this working";
	}
	
	@RequestMapping("/sayBye")
	public String getBye() {
		return "Congrats, you can now leave";
	}

	public static void main(String[] args) {
		SpringApplication.run(MySecondSpringBootApplication.class, args);
	}
	
	
}
