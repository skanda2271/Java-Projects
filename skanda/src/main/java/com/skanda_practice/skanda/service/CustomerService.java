package com.skanda_practice.skanda.service;

import com.skanda_practice.skanda.dtoentity.Customer;
import com.skanda_practice.skanda.dtoentity.CustomerRequest;
import com.skanda_practice.skanda.dtoentity.CustomerResponse;

public interface CustomerService {
	
	CustomerResponse createCustomer (CustomerRequest customerRequest);
	CustomerResponse getCustomer (Long id);
	CustomerResponse mapToResponse(Customer cusomer);
	CustomerResponse findByname(String name);

}
