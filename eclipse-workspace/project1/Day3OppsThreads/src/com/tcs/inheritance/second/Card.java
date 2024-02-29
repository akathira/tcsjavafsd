package com.tcs.inheritance.second;

//Debit card credit card for other
public abstract class Card {
	
	public abstract boolean swipe(double transactionAmount);
	
	private int cardNo;
	private String expiry;
	private int cvv;
	private String name;
	private int pin;
	private double amount; //availability balance or limit
	
	public Card() {
		super();
	}

	

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public String getExpiry() {
		return expiry;
	}

	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public Card(int cardNo, String expiry, int cvv, String name, int pin, double amount) {
		super();
		this.cardNo = cardNo;
		this.expiry = expiry;
		this.cvv = cvv;
		this.name = name;
		this.pin = pin;
		this.amount = amount;
	}



	public int getPin() {
		return pin;
	}



	public void setPin(int pin) {
		this.pin = pin;
	}



	public double getAmount() {
		return amount;
	}



	public void setAmount(double amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", expiry=" + expiry + ", cvv=" + cvv + ", name=" + name + ", pin=" + pin
				+ ", amount=" + amount + "]";
	}



	
}
