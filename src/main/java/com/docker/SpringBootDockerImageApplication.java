package com.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerImageApplication {

	@GetMapping("/get")
	public String m1()
	{
		System.out.println("docker image create and running....");
		return "docker image create and running ...";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerImageApplication.class, args);
	}

}
