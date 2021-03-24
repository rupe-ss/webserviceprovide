package com.example.demo;

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebserviceprovideApplication {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost/calculator/soap", new CalculatorWebService());
	}

}