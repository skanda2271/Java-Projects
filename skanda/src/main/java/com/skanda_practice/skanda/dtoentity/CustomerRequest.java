package com.skanda_practice.skanda.dtoentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {
	private String name;
	private String email;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerRequest(String name, String email, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	
}
