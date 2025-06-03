package com.practice.webapp;

import com.arangodb.springframework.annotation.EnableArangoRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableArangoRepositories(basePackages = "com.practice.webapp")
public class WebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappApplication.class, args);
	}

}
