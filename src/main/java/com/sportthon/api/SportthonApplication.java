package com.sportthon.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.sportthon.api")
public class SportthonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportthonApplication.class, args);
	}

}
