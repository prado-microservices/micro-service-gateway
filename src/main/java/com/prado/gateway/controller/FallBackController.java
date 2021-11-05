package com.prado.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fall-back")
public class FallBackController {
	
	@GetMapping("/aggregator-fall-back")
	public String aggregatorFallBack() {
		return "Aggregator Service is down - Please try again later";
	}
	
	@GetMapping("/user-fall-back")
	public String userServiceFallBack() {
		return "User Service is down - Please try again later";
	}
	
	@GetMapping("/department-fall-back")
	public String departmentServiceFallBack() {
		return "Department Service is down - Please try again later";
	}
	
	@GetMapping("/contact-fall-back")
	public String contactFallBack() {
		return "Contact Service is down - Please try again later";
	}
}
