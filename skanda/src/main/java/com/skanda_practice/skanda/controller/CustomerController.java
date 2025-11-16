package com.skanda_practice.skanda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skanda_practice.skanda.dtoentity.CustomerRequest;
import com.skanda_practice.skanda.dtoentity.CustomerResponse;
import com.skanda_practice.skanda.service.CustomerService;

@RequestMapping("/customer")
@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("getById/{id}")
	public CustomerResponse get (@PathVariable Long id) {
		return service.getCustomer(id);
	}
	
	@PostMapping
	public CustomerResponse put(@RequestBody CustomerRequest req) {
		return service.createCustomer(req);
	}
	
	@GetMapping("/search")
	public CustomerResponse findByname(@RequestParam String name) {
		return service.findByname(name);
	}
	
	
	

}
