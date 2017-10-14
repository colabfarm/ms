package com.example.demo.rest;

import org.springframework.boot.actuate.endpoint.RequestMappingEndpoint;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/api")
	public Number rootApp()
	{
		return 200;
	}
	@RequestMapping("/api/arun")
	public String newMethod()
	{
		return "Arun";
	}
	
	
}
