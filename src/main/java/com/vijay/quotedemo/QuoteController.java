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
				"  \"price\" : 353.63000000,\r\n" + 
				"  \"changesPercentage\" : -3.07000000,\r\n" + 
				"  \"change\" : -11.21000000,\r\n" + 
				"  \"dayLow\" : 353.02000000,\r\n" + 
				"  \"dayHigh\" : 365.32000000,\r\n" + 
				"  \"yearHigh\" : 372.38000000,\r\n" + 
				"  \"yearLow\" : 192.58000000,\r\n" + 
				"  \"marketCap\" : 1532749152256.00000000,\r\n" + 
				"  \"priceAvg50\" : 331.95822000,\r\n" + 
				"  \"priceAvg200\" : 299.39972000,\r\n" + 
				"  \"volume\" : 51314211,\r\n" + 
				"  \"avgVolume\" : 37332785,\r\n" + 
				"  \"exchange\" : \"NASDAQ\",\r\n" + 
				"  \"open\" : 364.41000000,\r\n" + 
				"  \"previousClose\" : 364.84000000,\r\n" + 
				"  \"eps\" : 12.72800000,\r\n" + 
				"  \"pe\" : 27.78362800,\r\n" + 
				"  \"earningsAnnouncement\" : \"2020-04-30T20:30:00.000+0000\",\r\n" + 
				"  \"sharesOutstanding\" : 4334330097,\r\n" + 
				"  \"timestamp\" : 1593424230\r\n" + 
				"} ]";
	}
	
	@GetMapping("/version")
	//public Company company(@RequestParam(value = "companyName", defaultValue = "AAPL") String name) {
	public String version() {
	//return new Company("AAPL",10);
		return "App Version : 0.2";
	}
}


