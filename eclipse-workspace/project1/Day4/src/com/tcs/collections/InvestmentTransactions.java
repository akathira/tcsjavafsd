package com.tcs.collections;

import java.util.*;

import com.tcs.collections.Transaction;

public class InvestmentTransactions {

	ArrayList<Transaction> transactions = new ArrayList();

	public boolean addTransaction(Transaction t) {
		boolean flag = transactions.add(t);
		return flag;

	}

	public void showTransactions()
	{
		//1. System.out.println(transactions);
		
		/*
		 *  2. for(Transaction t: transactions) { System.out.println(t); }
		 */
		
		Iterator<Transaction> iter = transactions.iterator();
		while(iter.hasNext())
		{
			Transaction t = iter.next();
			System.out.println(t);
		}
		
	}
	public Transaction showGivenTransaction(int transactionId)
	{
		Transaction temp = null;
		for(Transaction t: transactions) {
			if(t.tid == transactionId)
				temp=t;
		}
		
		return temp;
	}
	
	public Transaction updateTransactionAmt(int transactionId, double transAmt)
	{
		Transaction temp = null;
		for(Transaction t: transactions) {
			if(t.tid == transactionId)
			{
				temp = t;
				t.setTransAmount(transAmt);
			}
				
		}
		
		return temp;
	}
	
	public Transaction updateTransactionBasedonInvestorId(int transactionId, double transAmt)
	{
		Transaction temp = null;
		for(Transaction t: transactions) {
			if(t.tid == transactionId)
			{
				
				temp = t;
				t.setTransAmount(transAmt);
			}
				
		}
		
		return temp;
	}
	
}
