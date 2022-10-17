package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@RestController
public class SpringBootAwsApplication {
	@GetMapping("/home")
	public String home() {
		return "Welcome to the spring boot application deployment";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsApplication.class, args);
	}

}
