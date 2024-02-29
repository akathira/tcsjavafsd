package com.tcs.collections;

public class Transaction {
	
	int tid;
	String transDate;
	double transAmount;
	int investerId;
	public Transaction(int tid, String transDate, double transAmount, int investerId) {
		super();
		this.tid = tid;
		this.transDate = transDate;
		this.transAmount = transAmount;
		this.investerId = investerId;
	}
	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", transDate=" + transDate + ", transAmount=" + transAmount + ", investerId="
				+ investerId + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
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
	public Transaction() {
		super();
	}
	
	

}
