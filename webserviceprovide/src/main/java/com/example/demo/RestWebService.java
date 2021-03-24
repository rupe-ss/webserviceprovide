package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestWebService {
	@RequestMapping(value = "/addition/{abc}/{pqr}", method = RequestMethod.GET)
	public int add(@PathVariable int abc, @PathVariable int pqr) throws Exception {
		int sum=abc + pqr;
		return sum;
	}
	
	// http://localhost/subCal?param1=10&param2=5
	@RequestMapping(value = "/subCal", method = RequestMethod.GET)
	public int sub(@RequestParam("param1") int a, @RequestParam("param2") int b) {
		int sub=a - b;
		return sub;
	}
}
