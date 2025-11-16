package com.skanda_practice.skanda.dtoentity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PracticeEntiry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String product;
    private int quantity;
    private double price;
    
	public PracticeEntiry() {
		super();
	}

	public PracticeEntiry(Long id, String customerName, String product, int quantity, double price) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "PracticeEntiry [id=" + id + ", customerName=" + customerName + ", product=" + product + ", quantity="
				+ quantity + ", price=" + price + "]";
	} 
    
}
