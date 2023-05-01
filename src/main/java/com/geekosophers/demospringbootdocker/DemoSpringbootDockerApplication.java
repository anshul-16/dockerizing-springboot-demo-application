package com.geekosophers.demospringbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringbootDockerApplication {

	@GetMapping("/welcome")
	public String welcomePage(){
		return "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootDockerApplication.class, args);
	}

}
