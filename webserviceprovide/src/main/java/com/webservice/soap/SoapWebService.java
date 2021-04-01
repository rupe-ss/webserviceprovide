package com.webservice.soap;

import javax.xml.ws.Endpoint;

public class SoapWebService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:9999/calculator/soap", new CalculatorWebService());
	}

}
