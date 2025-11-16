package com.skanda_practice.skanda.dtoentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
	public CustomerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Long id;
	private String name;
	private String email;
	public CustomerResponse(long l, String name, String email) {
		this.id = l;
		this.name = name;
		this.email= email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
}
