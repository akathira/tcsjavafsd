package com.tcs.inheritance;

public class HDFCVisaDebitcard extends Card {

	public HDFCVisaDebitcard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HDFCVisaDebitcard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean swipe(double transactionAmount) {
		//first get the balance from account based on card no of the customer
		//update the account balance with transaction amount
		
		System.out.println("Transaction Successfull From HDFC");
		return true;
	}

}
