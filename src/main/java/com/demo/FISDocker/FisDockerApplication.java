package com.demo.FISDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FisDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FisDockerApplication.class, args);
	}
	
	@GetMapping("/")
	 public String getMessage() {
	 return "Welcome to FIS Spring Integration with Jenkins App";
	 }
	

}
