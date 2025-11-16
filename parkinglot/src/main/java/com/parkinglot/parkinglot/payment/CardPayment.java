package com.parkinglot.parkinglot.payment;

public class CardPayment implements PaymentStrategy{

	public CardPayment(double amount) {
		
	}

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing Card Payment");	
	}

	

}
