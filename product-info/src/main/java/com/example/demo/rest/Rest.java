package com.example.demo.rest;

import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@EnableCircuitBreaker
class Rest {
	
	@RequestMapping(value="/api", produces=MediaType.APPLICATION_JSON_VALUE)
	public Product getProduct()
	{
		Product prod = new Product();
		prod.setDescription("Desc");
		prod.setName("Philips LED TV");
		return prod;
	}
}
