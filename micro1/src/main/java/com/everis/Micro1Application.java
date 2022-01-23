package com.everis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class Micro1Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro1Application.class, args);
	}

	@GetMapping(path="/helloworld")
	public String helloWordl() {
		return "Hello World";
	}
}
