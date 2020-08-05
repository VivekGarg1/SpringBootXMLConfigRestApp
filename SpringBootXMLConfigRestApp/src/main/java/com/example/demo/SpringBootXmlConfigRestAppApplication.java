package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:Beans.xml")
public class SpringBootXmlConfigRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootXmlConfigRestAppApplication.class, args);
	}

}
