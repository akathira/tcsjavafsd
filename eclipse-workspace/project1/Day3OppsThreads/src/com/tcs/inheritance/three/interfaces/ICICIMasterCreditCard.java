package com.tcs.inheritance.three.interfaces;

public class ICICIMasterCreditCard extends Card {

	public ICICIMasterCreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICICIMasterCreditCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean swipe(double transactionAmount) {
		System.out.println("Transaction Successfull FRom ICICI");
		return true;
	}
	
	

}
