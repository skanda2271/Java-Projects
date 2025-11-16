package com.skanda_practice.skanda.controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.skanda_practice.skanda.controller.CustomerController;
import com.skanda_practice.skanda.dtoentity.CustomerRequest;
import com.skanda_practice.skanda.dtoentity.CustomerResponse;
import com.skanda_practice.skanda.service.CustomerService;

class CustomerControllerTest {
	
	  @Mock
	    private CustomerService service;

	    @InjectMocks
	    private CustomerController controller;

	    @BeforeEach
	    void setup() {
	        MockitoAnnotations.openMocks(this);
	    }
	    
	    @Test
	    void testGetCustomerById() {
	        CustomerResponse response = new CustomerResponse(1L, "John", "john@gmail.com");

	        when(service.getCustomer(1L)).thenReturn(response);

	        CustomerResponse result = controller.get(1L);

	        assertEquals(1L, result.getId());
	        assertEquals("John", result.getName());
	        assertEquals("john@gmail.com", result.getEmail());
	    }
	    
	    @Test
	    void testCreateCustomer() {
	        CustomerRequest request = new CustomerRequest("John", "john@gmail.com","1234");
	        CustomerResponse response = new CustomerResponse(1L, "John", "john@gmail.com");

	        when(service.createCustomer(request)).thenReturn(response);

	        CustomerResponse result = controller.put(request);

	        assertEquals("John", result.getName());
	        assertEquals("john@gmail.com", result.getEmail());
	    }
	    
	    @Test
	    void testGetCustomerById1() {

	        // Mocked response object (fake data)
	        CustomerResponse mockResponse =
	                new CustomerResponse(1L, "Ramesh", "ramesh@gmail.com");

	        // when(service.getCustomer(1L)) is called → return mockResponse
	        when(service.getCustomer(1L)).thenReturn(mockResponse);

	        CustomerResponse result = controller.get(1L);

	        assertEquals("Ramesh", result.getName());
	        assertEquals("ramesh@gmail.com", result.getEmail());

	        // verify service interaction
	        verify(service, times(1)).getCustomer(1L);
	    }
	    

}
