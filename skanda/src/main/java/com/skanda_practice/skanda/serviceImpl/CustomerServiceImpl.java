package com.skanda_practice.skanda.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skanda_practice.skanda.dtoentity.Customer;
import com.skanda_practice.skanda.dtoentity.CustomerRequest;
import com.skanda_practice.skanda.dtoentity.CustomerResponse;
import com.skanda_practice.skanda.exceptions.CustomerNotFountException;
import com.skanda_practice.skanda.repoDao.CustomerRepo;
import com.skanda_practice.skanda.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepo repo;

	@Override
	public CustomerResponse createCustomer(CustomerRequest customerRequest) {
		Customer cus = new Customer();
		cus.setEmail(customerRequest.getEmail());
		cus.setName(customerRequest.getName());
		cus.setAddress(customerRequest.getAddress());
		Customer saved = repo.save(cus);
		return mapToResponse(saved);
	}

	@Override
	public CustomerResponse getCustomer(Long id) {
	    Customer cus = repo.findById(id).orElseThrow(()->new CustomerNotFountException("Not found with this id " + id));
	    return mapToResponse(cus);
	}

	@Override
	public CustomerResponse mapToResponse(Customer cusomer) {
		CustomerResponse reponse = new CustomerResponse();
		reponse.setId(cusomer.getId());
		reponse.setName(cusomer.getName());
		reponse.setEmail(cusomer.getEmail());
		return reponse;
	}
	
	@Override
	public CustomerResponse findByname(String name) {
		Customer cus = repo.findByName(name).orElseThrow(()-> new CustomerNotFountException("Not found by this name"));
		return mapToResponse(cus);
		
	}
	
	

}
