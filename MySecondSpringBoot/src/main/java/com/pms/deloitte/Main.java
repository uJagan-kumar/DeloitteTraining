package com.pms.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.demo.MySecondSpringBootApplication;

@RestController
@SpringBootApplication
public class Main 
{
		public static void main(String[] args) {
			SpringApplication.run(Main.class, args);

		}
}
