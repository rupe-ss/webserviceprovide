package com.webservice.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

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
	
	@RequestMapping(value = "/areaOfrect", method = RequestMethod.POST)
	public int areaOfrect(@RequestParam("length") int a, @RequestParam("breadth") int b) {
		int area=a * b;
		return area;
	}
	
	// http://localhost/jsonReqMul
	@RequestMapping(value = "/jsonReqMul", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public int mulCalculator(@RequestBody Input in) {
		// "Input" parameter is json compliant java program
		int mul=in.param1 * in.param2  ;
		return mul;
	}
	
	@RequestMapping(value = "/areaService", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public AreaOutput areaService(@RequestBody MathInput mi) {
		AreaOutput result=new AreaOutput();
		result.areaOfCircle =(int) 3.142 * mi.radius * mi.radius;
		result.areaOfRectangle = mi.length * mi.breadth;
		result.areaOfSquare = mi.sides * mi.sides;
		return result;
	}
}
