package com.acc.handson.paymentProcessingSystem;

public abstract class Payments implements MyCard {
	public String pType;
	
	Payments(String pType) {
		this.pType = pType;
	}
	
	public void processPayment() {
		System.out.println("Processing Payment.. for your " + pType);
	}
}
