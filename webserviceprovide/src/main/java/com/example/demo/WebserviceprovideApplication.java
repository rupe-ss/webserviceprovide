package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.demo","com.webservice.rest","com.webservice.soap"})

public class WebserviceprovideApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceprovideApplication.class, args);
	}

}