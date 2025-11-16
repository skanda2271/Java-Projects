package com.skanda_practice.skanda.dtoentity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class PracticeDTO {
	    public PracticeDTO(Long id, String customerName, String product, double totalAmount) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.product = product;
		this.totalAmount = totalAmount;
	}
		public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
		private Long id;
	    private String customerName;
	    private String product;
	    private double totalAmount;
}
