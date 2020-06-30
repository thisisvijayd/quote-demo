package com.vijay.quotedemo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuoteController {
	
	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/quote")
	//public Company company(@RequestParam(value = "companyName", defaultValue = "AAPL") String name) {
	public String company() {
	//return new Company("AAPL",10);
		return "[ {\r\n" + 
				"  \"symbol\" : \"AAPL\",\r\n" + 
				"  \"name\" : \"Apple Inc.\",\r\n" + 
				"  \"price\" : 353.63000000\r\n" +  
				"} ]";
	}
	
	@GetMapping("/version")
	//public Company company(@RequestParam(value = "companyName", defaultValue = "AAPL") String name) {
	public String version() {
	//return new Company("AAPL",10);
		return "App Version : 0.3";
	}
}


