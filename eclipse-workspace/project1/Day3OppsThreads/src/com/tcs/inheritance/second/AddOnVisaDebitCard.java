package com.tcs.inheritance.second;

import com.tcs.inheritance.Card;

public class AddOnVisaDebitCard extends Card {

	@Override
	public boolean swipe(double transactionAmount) {
		System.out.println("");
		return true;
	}

	public AddOnVisaDebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AddOnVisaDebitCard(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super(cardNo, expiry, cvv, name, pin, amount);
		// TODO Auto-generated constructor stub
	}


}
