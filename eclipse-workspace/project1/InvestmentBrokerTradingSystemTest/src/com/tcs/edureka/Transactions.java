package com.tcs.edureka;

public class Transactions {
	
	private int transactionId;
	private String transDate;
	private double transAmount;
	private int investerId;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public String getTransDate() {
		return transDate;
	}
	public void setTransDate(String transDate) {
		this.transDate = transDate;
	}
	public double getTransAmount() {
		return transAmount;
	}
	public void setTransAmount(double transAmount) {
		this.transAmount = transAmount;
	}
	public int getInvesterId() {
		return investerId;
	}
	public void setInvesterId(int investerId) {
		this.investerId = investerId;
	}
	public Transactions(int transactionId, String transDate, double transAmount, int investerId) {
		super();
		this.transactionId = transactionId;
		this.transDate = transDate;
		this.transAmount = transAmount;
		this.investerId = investerId;
	}
	public Transactions() {
		super();
	}
	@Override
	public String toString() {
		return "Transactions [transactionId=" + transactionId + ", transDate=" + transDate + ", transAmount="
				+ transAmount + ", investerId=" + investerId + "]";
	}
	
	

}
