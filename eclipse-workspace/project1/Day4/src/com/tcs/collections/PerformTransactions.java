package com.tcs.collections;

public class PerformTransactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "nbc", "hyd", "bonds", 90000);
		Investor i3 = new Investor(3, "obc", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "jbc", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ikl", "mumbai", "bonds", 20000);
		
		Transaction t1 = new Transaction(101, "01-jan-24",5000,1);
		Transaction t2 = new Transaction(102, "02-jan-24",9000,2);
		Transaction t3 = new Transaction(103, "03-jan-24",7000,3);
		Transaction t4 = new Transaction(104, "04-jan-24",6000,4);
		Transaction t5 = new Transaction(105, "05-jan-24",4000,5);
		
		InvestmentTransactions investmentTransactions = new InvestmentTransactions();
		investmentTransactions.addTransaction(t1);
		investmentTransactions.addTransaction(t2);
		investmentTransactions.addTransaction(t3);
		investmentTransactions.addTransaction(t4);
		investmentTransactions.addTransaction(t5);
		
		investmentTransactions.showTransactions();
		System.out.println(investmentTransactions.showGivenTransaction(104));
		System.out.println(investmentTransactions.updateTransactionAmt(104, 8000));

	}

}
